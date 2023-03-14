ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.5"

lazy val root = (project in file("."))
  .settings(
    name := "electric-bill-generator",
    idePackagePrefix := Some("com.knoldus")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test