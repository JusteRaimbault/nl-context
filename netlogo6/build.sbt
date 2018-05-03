enablePlugins(org.nlogo.build.NetLogoExtension)

//scalaVersion := "2.11.7"
scalaVersion := "2.12.2"

scalaSource in Compile := { baseDirectory.value  / "src" }

javaSource in Compile  := { baseDirectory.value / "src" }

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xlint", "-Xfatal-warnings",
                        "-encoding", "us-ascii")

javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-encoding", "us-ascii")

name := "context"

netLogoVersion      := "6.0.2"

netLogoClassManager := "ClassManager"

netLogoExtName      := "context"

netLogoZipSources   := false
