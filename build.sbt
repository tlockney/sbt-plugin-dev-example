lazy val `sbt-plugin-dev` = project
  .in(file("."))
  .enablePlugins(AutomateHeaderPlugin, GitVersioning)

libraryDependencies ++= Vector(
  Library.scalaTest % "test"
)

initialCommands := """|import default.sbt.plugin.dev._
                      |""".stripMargin
