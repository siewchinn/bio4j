Nice.javaProject

javaVersion := "1.8"

organization := "bio4j"

name := "bio4j"

description := "Bio4j abstract model"

bucketSuffix := "era7.com"

libraryDependencies ++= Seq(
  "ohnosequences" % "angulillos" % "0.4.0-SNAPSHOT",
  "ohnosequences" % "bioinfo-util" % "1.4.0-SNAPSHOT"
)

dependencyOverrides ++= Set(
  "commons-codec" % "commons-codec" % "1.7",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.2",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.1.1",
  "commons-beanutils" % "commons-beanutils" % "1.8.3",
  "commons-beanutils" % "commons-beanutils-core" % "1.8.3",
  "net.sf.opencsv" % "opencsv" % "2.3"
)
