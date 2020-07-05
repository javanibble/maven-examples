# Maven Command Line Options

Command-line options are used to specify various options for Maven making use of the command line. This post lists several examples on the usage of maven command-line options and the different behaviours they have on maven.

<table width="100%">
<tr>
<th>Nr</th><th>Maven Options</th><th>Description</th>
</tr>
<tr><td></td><td>-B, --batch-mode</td><td># Run in non-interactive (batch) mode</td></tr>
<tr><td></td><td>-C, --strict-checksums</td><td># Fail the build if checksums don't match</td></tr> 
<tr><td></td><td>-c, --lax-checksums</td><td># Warn if checksums don't match</td></tr>
<tr><td></td><td>-D, --define</td><td># Define a system property</td></tr>
<tr><td></td><td>-e, --errors</td><td># Produce execution error messages</td></tr>
<tr><td></td><td>-emp, --encrypt-master-password</td><td># Encrypt the master security password</td></tr>
</table>


#### Display the version information
```bash
# Display the version information
$ mvn --version
$ mvn -v
```

#### Display version info without stopping build
```bash
# Display version info without stopping build
$ mvn -V clean install
$ mvn --show-version clean install
```

#### Produce execution debug output
```bash
# Produce execution debug output
$ mvn -X clean install
$ mvn --debug clean install
```

#### Run Maven in Batch Mode
To run Maven in batch mode, you can use the **-B** or **--batch-mode** options as part of the maven command. This is very useful when running maven in a continuous integration environment. Maven will not request or accept input from the user while running in batch mode. The batch-mode will automatically use default values and not prompting the user for those values. The batch mode also disables the output colour.

```bash
# Run in non-interactive (batch) mode (disables output colour)
$ mvn -B clean install
$ mvn --batch-mode clean install
```

#### Fail Maven Build if Checksums Fail
```bash
# Fail the build if checksums don't match
$ mvn -C clean install
$ mvn --strict-checksums clean install
```

#### Fail Maven Build if Checksums Fail
```bash
# Warn if checksums don't match
$ mvn -c clean install
$ mvn --lax-checksums clean install
```

#### Define a System Property
```bash
# Define a system property
$ mvn help:describe -Dcmd=validate
$ mvn help:describe -D cmd=validate
$ mvn help:describe --define cmd=validate
```

#### Define a System Property
```bash
# Produce execution error messages
$ mvn -e clean install
$ mvn --errors clean install
```

#### Encrypt the Master Security Password
```bash
# Encrypt the master security password
$ mvn -emp <my_master_password>
$ mvn --encrypt-master-password <my_master_password>
```

#### Encrypt the Server Security Password
```bash
# Encrypt the server password
$ mvn -ep <my_server_password>
$ mvn --encrypt-password <my_server_password>
```

#### Create alternative path to Global settings file
```bash
# Alternative path for the global settings file
$ mvn -gs /path/to/settings.xml clean install
$ mvn --global-settings /path/to/settings.xml clean install
```

#### Create alternative path to Global toolchain file
```bash
# Alternative path for the global toolchains file
$ mvn -gt /path/to/toolchains.xml clean install
$ mvn --global-toolchains /path/to/toolchains.xml clean install
```

#### Create alternative path to User settings file
```bash
# Alternative path for the user settings file
$ mvn -s /path/to/settings.xml clean install
$ mvn --settings /path/to/settings.xml clean install
```

#### Create alternative path to User toolchain file
```bash
# Alternative path for the user toolchains file
$ mvn -t /path/to/toolchains.xml clean install
$ mvn --toolchains /path/to/toolchains.xml clean install
```


#### Display Help Information
```bash
# Display help information
$ mvn -h
$ mvn --help
```

#### Work Offline
```bash
# Work offline
$ mvn -o clean install
$ mvn --offline clean install
```

#### Only display Errors
```bash
# Quiet output, only display errors
$ mvn -q clean install
$ mvn -quiet clean install
```

#### Resume from specific project 
```bash
# Resume reactor from specified project
$ mvn -rf {module-name} clean install
$ mvn --resume-from {module-name} clean install
```

#### Builds the project with 1 thread per available CPU core
```bash
# Builds the project with 1 thread per available CPU core
$ mvn -T 1C clean install
$ mvn -threads 1C clean install
```

#### Builds the project with 2 threads per available CPU core
```bash
# Builds the project with 2 threads per available CPU core
$ mvn -T 2C clean install
$ mvn -threads 2C clean install
```

#### Builds the project with 4 threads
```bash
# Builds the project with 4 threads
$ mvn -T 4 clean install
$ mvn -threads 4 clean install
```

#### Forces a check for missing releases and updated snapshots on remote repositories
```bash
# Forces a check for missing releases and updated snapshots on remote repositories
$ mvn -U clean install
$ mvn --update-snapshots clean install
```

#### Summary
The maven command line options listed in this article are by no means a complete set of the options and only serve as a quick reference to be used by developers. To see the full documentation of the maven command-line options, please read see the [Maven Documentation][Maven_Documentation].

Follow me on any of the different social media platforms and feel free to leave comments.

[Maven_Documentation]:https://maven.apache.org/ref/3.1.0/maven-embedder/cli.html