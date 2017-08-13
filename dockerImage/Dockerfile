#Download base image with jenkins
From jenkins

MAINTAINER Rob Snelders

#install packages
USER root
RUN apt-get update && apt-get install -y maven

RUN /usr/local/bin/install-plugins.sh docker-slaves workflow-aggregator pipeline-github-lib ws-cleanup
