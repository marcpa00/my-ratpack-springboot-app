Ratpack + Spring Boot + Spring Cloud project template
-----------------------------------------------------

You have just created a basic Groovy Ratpack application that is also a Spring Boot 
application and a Spring Cloud client. It doesn't do much at this point, but we have
set you up with a standard project structure, a Spring Registry, simple home page,
and Spock for writing tests (because you'd be mad not to use it).

In this project you get:

* A Gradle build file with pre-built Gradle wrapper and dependencies on Spring Boot and
  Spring Cloud starters
* A SpringBootConfig class enabling boot auto-configuration and discovery client
* A tiny home page at src/ratpack/templates/index.html (it's a template)
* A routing file at src/ratpack/Ratpack.groovy
* A bootstrap yml configuration file
* A yml configuration file for eureka client
* Ratpack Registry using Spring
* A settings.gradle with the project name
* A basic system.properties and Procfile for Heroku
* A stage task in build.gradle for Heroku
* Reloading enabled in build.gradle
* A standard project structure:

    <proj>
      |
      +- src
          |
          +- ratpack
          |     |
          |     +- Ratpack.groovy
          |     +- ratpack.properties
          |     +- public // Static assets in here
          |          |
          |          +- images
          |          +- lib
          |          +- scripts
          |          +- styles
          |
          +- main
          |   |
          |   +- groovy
                   |
                   +- // App classes in here!
          |
          +- test
              |
              +- groovy
                   |
                   +- // Spock tests in here!

That's it! You can start the basic app with

    ./gradlew run

but it's up to you to add the bells, whistles, and meat of the application.
