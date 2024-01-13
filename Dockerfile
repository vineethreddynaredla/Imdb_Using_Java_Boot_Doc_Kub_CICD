FROM openjdk:17-oracle
#This line specifies the base image for your Docker image. In this case, it uses the official Java 8 image from Docker Hub as the base. 
#This means your image will include a basic installation of Java 8.


EXPOSE 8080
#This line informs Docker that the container will listen on port 8080 at runtime. 
#It doesn't actually publish the port, but it serves as a documentation for anyone who wants to run the container based on this image, 
#indicating that the application inside the container will use port 8080.


ADD target/Imdb_Using_Java_Boot_Doc_Kub_CICD.jar Imdb_Using_Java_Boot_Doc_Kub_CICD.jar
#This line copies the JAR file from your local build context into the Docker image. 
#It assumes that you have a JAR file named docker-demo.jar in the target directory relative to your Dockerfile.

ENTRYPOINT [ "java", "-jar", "Imdb_Using_Java_Boot_Doc_Kub_CICD.jar" ]
#This line sets the default command to be executed when the container starts. 
#It specifies that the Java application should be run using the java -jar command with the docker-demo.jar file. 
#This means that when the container is started, it will run your Java application as the main process.