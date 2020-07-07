# How to Use the Checkstyle Checker As Part of Build in the Maven Checkstyle Plugin
This post contains a step-by-step guide on how to use checkstyle checker in the Maven Checkstyle Plugin as part of the validate phase.

## Full Article
The full article can be found on the [JavaNibble][Article1] website.

## Build Integration
The following XML within the POM.xml file makes the Checkstyle Plugin part of the maven build phase. The *check* goal is binded to the *validate* phase of the default lifecycle.

The config file named *checkstyle.xml* can also be located on the classpath.
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <configLocation>checkstyle.xml</configLocation>
            </configuration>
            <executions>
                <execution>
                    <id>code-checkstyle</id>
                    <phase>validate</phase>
                    <goals>
                        <goal>check</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

## Compile and Run the Application
To generate the Checkstyle report as part of the project reports, execute the *site* phase to generate the report.

**Build Application & Generate Build Report**
```bash
$ mvn clean validate
```

**Generate Checkstyle Report as Standalone**
```bash
$ mvn checkstyle:checkstyle
```

## Summary
Congratulations! You have successfully used checkstyle checker in the Maven Checkstyle Plugin as part of the validate phase.

[Article1]:https://www.javanibble.com/

