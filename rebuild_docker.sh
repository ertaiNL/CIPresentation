#/bin/bash

mvn clean install -f java-tryout/pom.xml

docker stop runner
docker rm runner

docker-compose up -d --build

echo 'done'
