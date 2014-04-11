
resolvers += "im.nexus" at "http://nexus.svc.oncue.com/nexus/content/groups/intel_media_maven/"

resolvers += "ermine.nexus" at "http://nexus.svc.oncue.com/nexus/content/repositories/bintray-ermine/"

addSbtPlugin("oncue.build" %% "sbt-oncue" % "6.1.+")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
