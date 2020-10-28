
// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.1"
val zioVersion = "1.0.3"
val enableZioTest = true


libraryDependencies += "dev.zio" %% "zio" % zioVersion
libraryDependencies += "dev.zio" %% "zio-streams" % zioVersion

// libraryDependencies ++= Seq(
// "dev.zio" %% "zio-test"          % zioVersion % "test",
// "dev.zio" %% "zio-test-sbt"      % zioVersion % "test",
// "dev.zio" %% "zio-test-magnolia" % zioVersion % "test" // optional
// )
// testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")