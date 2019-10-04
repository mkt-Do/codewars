scalaVersion := "2.12.8"

ensimeScalaVersion in ThisBuild := "2.12.8"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
