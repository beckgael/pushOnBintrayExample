addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.3")

resolvers += Resolver.url("bintray-sbt-plugin-releases", url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)