lazy val root = (project in file(".")).aggregate(core, plugin)
lazy val core = (project in file("core"))
lazy val plugin = (project in file("plugin")).settings(
  sbtPlugin := true,
  name := "example-plugin",
  crossScalaVersions := Seq("2.10.6")
)