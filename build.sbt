name         := "samplespark"
version      := "1.0"
organization := "com.codenvy.example.scala"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.0-SNAPSHOT"  (1)
resolvers += Resolver.mavenLocal