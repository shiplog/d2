name := "directives2"

organization := "no.shiplog"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.1.0",
  "ws.unfiltered" %% "unfiltered" % "0.10.0-M6",
  "ws.unfiltered" %% "unfiltered-directives" % "0.10.0-M6" % "optional"
)

crossScalaVersions := Seq("2.13.1", "2.12.10")

scalaVersion := crossScalaVersions.value.head
