# Use Tomcat 9 with JDK 21
FROM tomcat:9.0-jdk21

# Remove default Tomcat apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file from the build folder to Tomcat's webapps
# Ensure your build folder contains the .war file
COPY *.war /usr/local/tomcat/webapps/ROOT.war
# Start Tomcat
CMD ["catalina.sh", "run"]