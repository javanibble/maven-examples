# Apache Maven Help Plugin 
For more detail, see [documentation](https://maven.apache.org/plugins/maven-help-plugin/index.html).
```bash
# Displays a list of the attributes for the maven plugin (plugin-prefix)
$ mvn help:describe -Dplugin=help

# Displays a list of the attributes for the maven plugin (groupId:artifactId)
$ mvn help:describe -Dplugin=org.apache.maven.plugins:maven-help-plugin

# Displays a list of the attributes for the maven plugin (groupId:artifactId:version)
$ mvn help:describe -Dplugin=org.apache.maven.plugins:maven-help-plugin:2.0

# Display a list of attributes for the maven plugin and the corresponding goal
$ mvn help:describe -Dplugin=help -Dgoal=system

# Displays a list of the attributes for the maven plugin with verbose information
$ mvn help:describe -Dplugin=help -Ddetail=true

# Displays a list of the attributes for the maven plugin with very little information
$ mvn help:describe -Dplugin=help -Dminimal=true

# Describe the build phase called "deploy"
$ mvn help:describe -Dcmd=deploy

# Displays a list of the attributes for the maven plugin
$ mvn help:describe -DgroupId=org.apache.maven.plugins -DartifactId=maven-antrun-plugin -Dversion=1.8

# Displays the effective POM as an XML for the current build
$ mvn help:effective-pom

# Displays the calculated settings as XML for this project
$ mvn help:effective-settings

# Evaluates Maven expressions given by the user in an interactive mode. (Prints Project Version)
$ mvn help:evaluate -Dexpression=project.version

# Displays a list of the platform details like system properties and environment variables.
$ mvn help:system
```
