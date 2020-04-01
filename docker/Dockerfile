# Start with a base image containing Java runtime
FROM tomcat

# Add Maintainer Info
LABEL maintainer="usuario@gmail.com"

# Add a volume pointing to /tmp
#VOLUME /tmp

# Make port 8084 available to the world outside this container
#EXPOSE 8084

#ENV DATABASE_HOST localhost
#ENV DATABASE_PORT 3306
#ENV DATABASE_NAME kaizen
#ENV DATABASE_USER kaizen
#ENV DATABASE_PASSWORD kaizen
#ENV DATABASE_POOL 64

# The application's war file
#ARG JAR_FILE=/target/demo-weblogic.war

# Add the application's jar to the container
#ADD ${JAR_FILE} /usr/local/tomcat/webapps/
ADD demo-weblogic.war /usr/local/tomcat/webapps/

# Run the war file 
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/demo-weblogic.war"]
CMD ["catalina.sh", "run"]