sbtPlugin := true

name := "jruby"

version := "1.0"

organization := "de.marvinkerkhoff"

libraryDependencies ++= Seq(
  "org.jruby" % "jruby-complete" % "1.7.16"
)

// unmanagedBase <<= baseDirectory { base => base / "lib" }

// unmanagedJars in Compile += file("lib/yetch.jar")

unmanagedResourceDirectories in Compile <+= baseDirectory(_ / "lib")
