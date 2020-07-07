# How to Setup Multimodule As Part of Build in the Maven Checkstyle Plugin
This post contains a step-by-step guide on how to setup multimodule in the Maven Checkstyle Plugin.

## Full Article
The full article can be found on the [javanibble][Article1] website.

## Compile and Run the Application
To generate the Checkstyle report as part of the project reports, execute the *site* phase to generate the report.

**Build Application**
```bash
$ mvn clean install site
```

**Generate Checkstyle Report as Standalone**
```bash
$ mvn checkstyle:checkstyle
```

## Summary
Congratulations! You have successfully setup multimodule in the Maven Checkstyle Plugin.

[Article1]:https://www.javanibble.com/

