name := "Scala___BFU_Parser"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.tumblr" %% "colossus" % "0.8.1"

// https://mvnrepository.com/artifact/com.pi4j/pi4j-core
libraryDependencies += "com.pi4j" % "pi4j-core" % "1.0"

//mainClass := Some("blackjack_and_hookers.main")

mainClass in (Compile, run) := Some("blackjack_and_hookers.main")