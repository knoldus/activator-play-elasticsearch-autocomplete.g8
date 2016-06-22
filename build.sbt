name := """play-elasticsearch-autocomplate"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.elasticsearch" % "elasticsearch" % "2.3.3",
    specs2 % Test
)
