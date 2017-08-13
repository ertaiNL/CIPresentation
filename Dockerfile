#Download base image with jenkins
From tomcat:8.0

MAINTAINER Rob Snelders

copy java-tryout/target/java-tryout.war /usr/local/tomcat/webapps
