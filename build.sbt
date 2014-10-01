sbtPlugin := true

name := "jruby"

version := "0.4"

scalaVersion := "2.10.4"

organization := "de.marvinkerkhoff"

libraryDependencies ++= Seq(
  "org.jruby" % "jruby-complete" % "1.7.16"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.2")
