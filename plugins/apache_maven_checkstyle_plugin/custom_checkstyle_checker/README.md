# How to Use a Custom Checkstyle Checker Configuration in the Maven Checkstyle Plugin
This post contains a step-by-step guide on how to use a custom checkstyle checker configuration in the maven checkstyle plugin.

## Full Article
The full article can be found on the [javanibble][Article1] website.

## POM: Plugin Management
The *pluginManagement* element is intended to configure project builds that inherit from this one. It configures plugins that are referenced within the plugins element in the children or current POM.

If the new dependency version was added to the plugins element, it would only apply to this specific POM. By adding it to the pluginManagement element, the new dependency version will be applied to this POM and all inheriting POMs.

```xml
<pluginManagement>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <configLocation>checkstyle.xml</configLocation>
            </configuration>
        </plugin>
    </plugins>
</pluginManagement>
```

## POM: Reporting
The *reporting* element contains all elements that correspond specifically for the *site* generation phase. The Checkstyle plugin generates a report and is placed in the outputDirectory which is *${basedir}/target/site* by default.

```xml
<reporting>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
        </plugin>
    </plugins>
</reporting>
```

## Compile and Run the Application
To generate the Checkstyle report as part of the project reports, execute the *site* phase to generate the report.

**Build Application & Generate Build Report**
```bash
$ mvn clean install site
```

**Generate Checkstyle Report as Standalone**
```bash
$ mvn checkstyle:checkstyle
```

## Summary
Congratulations! You have successfully used a custom checkstyle checker configuration in the Maven Checkstyle Plugin. Follow me on any of the different social media platforms and feel free to leave comments.

[Article1]:https://www.javanibble.com/

