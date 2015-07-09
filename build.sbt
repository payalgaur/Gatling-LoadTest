  name := "Gatling-Test"

  version := "1.0"

  scalaVersion := "2.11.1"

lazy val root = (project in file(".")).enablePlugins(GatlingPlugin)

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.6" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.1.6" % "test"