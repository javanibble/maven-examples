# How to Create a Simple Java Project using Maven
This post contains a step-by-step guide on how to create a simple java application making use of maven. The Archetype Plugin is used to create a simple java project from an existing template called an archetype. The guide also illustrates how to build and then run the application using maven commands.

## Full Article
The full article can be found on the [Code2Bits][Article1] website.

## Maven Archetype
The archetype plugin allows the user to create a maven project from an existing template called an archetype. The generate goal generates a new project in a directory corresponding to the artifactId.  

```bash
$ mvn archetype:generate -DgroupId=com.javanibble.maven.example -DartifactId=simple-java-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Compile and Run the Application
Use the following command to compile the Java application making use of maven.

**Build Application**
```bash
$ mvn clean install
```

<p>After you have successfully built the Java application, the compiled artifact can be found in the target directory. There are several ways to run the Java Application.</p>

**Run Application**
```bash
$ java -cp target/simple-java-project-1.0-SNAPSHOT.jar com.javanibble.maven.example.App 
```

**Run Application With Single Argument**
```bash
$ java -cp target/simple-java-project-1.0-SNAPSHOT.jar com.javanibble.maven.example.App JavaNibble
```

**Example**

<img src="https://www.javanibble.com/assets/img/my_images/posts/simple-java-application-maven/terminal_simplejavaproject_compile_run.gif" width="100%"/>

<p>The exec maven plugin provides 2 goals to help execute system and Java programs. The exec:java goal executes the supplied java class in the current VM with the enclosing project's dependencies as classpath.</p>

**Run Application using Maven Plugin**
```bash
$ mvn exec:java -Dexec.mainClass="com.javanibble.maven.example.App"  
```

**Run Application using Maven Plugin With Single Argument**
```bash
$ mvn exec:java -Dexec.mainClass="com.javanibble.maven.example.App" -Dexec.args="JavaNibble"  
```

## Summary
Congratulations! You have successfully created a simple Java Application using maven. You have also used maven to compile the application and also to run the application. Follow me on any of the different social media platforms and feel free to leave comments.

[Article1]:https://www.javanibble.com/how-to-create-a-simple-java-project-using-maven/
