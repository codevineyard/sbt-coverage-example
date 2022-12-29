ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := """sbt-coverage-example""",
    idePackagePrefix := Some("uk.co.codevineyard"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.14" % Test
    ),
    coverageMinimumStmtTotal := 80.0,
    coverageFailOnMinimum := true
  )