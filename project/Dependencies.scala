import sbt._

// format: off

object Dependencies {
  lazy val scala211Version  = "2.11.8"
  lazy val scalaTestVersion = "3.0.0"

  lazy val scala210 = "2.10.6"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion
}
