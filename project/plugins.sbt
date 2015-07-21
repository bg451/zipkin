resolvers ++= Seq(
  Resolver.url("bintray-sbt-plugins", url("http://dl.bintray.com/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns),
  Resolver.jcenterRepo, // superset of maven central
  "Twitter Maven Repository" at "https://maven.twttr.com/" // for thrift 0.5.0-1 needed by scrooge
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2") // configuration starting with 0.12 is different
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.8.1")
addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "3.20.0")
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.0")

dependencyOverrides += "net.databinder.dispatch" %% "dispatch-json4s-native" % "0.11.3"
