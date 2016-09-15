lazy val root = (project in file(".")).dependsOn(plugin)

lazy val plugin = (project in file("plugin")).settings(
  sbtPlugin := true,
  scalaVersion := "2.10.6",
  unmanagedSourceDirectories in Compile :=
    mirrorScalaSource((baseDirectory in ThisBuild).value.getParentFile / "plugin")
)

def mirrorScalaSource(baseDirectory: File): Seq[File] = {
  val scalaSourceDir = baseDirectory / "src" / "main" / "scala"
  if (scalaSourceDir.exists) scalaSourceDir :: Nil
  else sys.error(s"Missing source directory: $scalaSourceDir")
}