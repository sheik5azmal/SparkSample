name         := "samplespark"

version      := "1.0"

organization := "com.codenvy.example.scala"

scalaVersion := "2.11.0"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.0" % "provided",
  "org.apache.spark" %% "spark-streaming" % "1.5.0")

resolvers += Resolver.mavenLocal