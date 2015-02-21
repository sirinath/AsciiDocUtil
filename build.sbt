/*
 * Copyright (c) 2015. The Project (Project Founder, Project Owner, Project Committers, Project Developers and Project Contributors.)
 *
 * Licensed under:
 *  - the Apache License, Version 2.0 <http://www.apache.org/licenses/LICENSE-2.0> or
 *  - the Academic Free License, Version 3.0 <http://opensource.org/licenses/AFL-3.0> or
 *  - the CeCILL-B Free Software License, Version 1.0 <http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html>, at your option.
 * This file may not be copied, modified, or distributed except according to those terms.
 * Any contribution to the project should comply with terms in all of the above licenses.
 */


import sbt.Keys._

name := "AsciiDocUtil"

organization := "com.sakrio"

version := "0.0.1"

scalaVersion := "2.11.5"

autoCompilerPlugins := true

resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.jcenterRepo,
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.sbtPluginRepo("releases"),
  Resolver.sbtPluginRepo("snapshots"),
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
  "Twitter Maven Repo" at "http://maven.twttr.com/"
)

libraryDependencies ++= Seq(
  "org.asciidoctor" % "asciidoctorj" % "1.5.2",
  "com.googlecode.scalascriptengine" %% "scalascriptengine" % "1.3.10",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.codehaus.groovy" % "groovy-all" % "2.4.1"
)