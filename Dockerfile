FROM java:8 

# Install maven
RUN apt-get update  
RUN apt-get install -y maven

WORKDIR /app

# Prepare by downloading dependencies
ADD pom.xml /app/pom.xml  
RUN ["mvn", "dependency:resolve"]  
# Failed to execute goal org.codehaus.mojo:jaxb2-maven-plugin:1.6:xjc (xjc) on project ws-validate-pserson: No schemas have been found
# RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /app/src  
RUN ["mvn", "clean", "package"]

EXPOSE 8080
CMD ["mvn", "spring-boot:run"]
