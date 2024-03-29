FROM openjdk:17-jdk-alpine

#VOLUME /tmp
#ARG JAVA_OPTS
#ENV JAVA_OPTS=$JAVA_OPTS

# Copiar el archivo JAR del proyecto a la imagen
COPY target/portfolio-0.0.1-SNAPSHOT.jar backend.jar

# Puerto que usará la aplicación
EXPOSE 8080

#ENTRYPOINT exec java $JAVA_OPTS -jar backend.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar backend.jar


ENTRYPOINT ["java", "-jar", "backend.jar"]