package net.lockney

import sbt._
import plugins._

object SimplePlugin extends AutoPlugin {
  override def trigger = allRequirements
  override val projectSettings: Seq[Setting[_]] = inConfig(Compile)(baseSettings)
  lazy val sayHello = taskKey[Unit]("Say hello")
  lazy val baseSettings: Seq[Setting[_]] = Seq(
    sayHello := {
      println("Hello!")
    }
  )
}