lazy val root = (project in file(".")).dependsOn(pluginProject)
lazy val pluginProject = file("../plugin")
