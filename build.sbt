name := "Scala___BFU_Parser"

version := "1.0"

scalaVersion := "2.11.8"


// Добавление зависимостей для core
libraryDependencies += "com.pi4j" % "pi4j-core" % "1.0"

//mainClass := Some("blackjack_and_hookers.main")

mainClass in (Compile, run) := Some("blackjack_and_hookers.main")