# spring-boot

### File Structure

*mvnw* files allows you to run a Maven project without having Maven installed on your computer.


#### POM File

Spring Boot Starters: collection of Maven dependencies grouped together.
  Example: spring-boot-starter-web.
  There are 30+ Spring Boot Starters from the Spring Development team.
  There is a Spring Boot Starter Parent in the pom.xml file.
  spring-boot-starter-* dependendies inherit version from parent.
Spring Boot Maven plugin: for packaging and for running 

#### Running Apps from the command-line

- First option
`./mvnw package` or if you have Maven already installed `mvn package`.
A .jar file is created in the target sub-directory
Run the application by typing: `java -jar appName.jar`
- Second option
Run the application using Spring Boot Maven plugin
`./mvnw spring-boot:run`
		
