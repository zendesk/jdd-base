# JavaConfBase

JavaConfBase is a sample java application built using technology stack we are
considering for new java backend services in Base.

List of included technologies:
* [Dropwizard](http://dropwizard.io/) for serving RESTfull web services
* [Gradle](http://www.gradle.org/) for dependency management and build automation
* [Spock](https://code.google.com/p/spock/) for testing
* [Java 8] (http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html)

## How to run the app?
To run the app execute `./gradlew run` and then open http://localhost:8080/app

## How to build the app to run it on a different machine?
Run `./gradlew runShadow` to build a fat jar including all the dependencies.
Then run `java -jar ./build/libs/java-conf-base-1.0-all.jar server` to run the app.