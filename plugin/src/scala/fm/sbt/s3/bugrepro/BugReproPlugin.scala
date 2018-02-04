package fm.sbt.s3.bugrepro

import sbt._
import sbt.Keys._

import fm.sbt.S3ResolverPlugin

object BugReproPlugin extends AutoPlugin {
  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = plugins.JvmPlugin && S3ResolverPlugin

  override def projectSettings = Seq(
    resolvers += "Test Repo" at "s3://whatever"
  )
}
