val inputPath = "file:///home/sparkdev/work/data-files/2015-03-01-0.json"
val ghLog = spark.read.json(inputPath)

//ghLog.printSchema

val pushes = ghLog.filter('type === "PushEvent") // 'type <-- apoint column

//pushes.printSchema

//ghLog.show(5)

val grouped = pushes.groupBy("actor.login").count

grouped.show(5)

val ordered = grouped.orderBy(grouped("count").desc)

ordered.show(5)

import scala.io.Source.fromFile

val empPath = "/home/sparkdev/work/data-files/github-employees.txt"
val employees = Set() ++ ( // ++ is concatenate two sets
    for {
        line <- fromFile(empPath).getLines
    } yield line.trim
)

val bcEmployees = sc.broadcast(employees) // declare master/global data for joining other data, readonly

val isEmp = user => bcEmployees.value.contains(user)

val isEmployee = spark.udf.register("SetContainsUdf", isEmp)

val filtered = ordered.filter(isEmployee($"login")) // $ means assign column

filtered.show()

filtered.write.format("json").save("file:///home/sparkdev/work/output/quickstart")



