#!/bin/sh

docker run -it --net=host swaggerapi/swagger-codegen-cli generate -i http://localhost:8080/swagger.json -l html -o .
#docker run -it swaggerapi/swagger-codegen-cli generate -i http://localhost:8080/swagger.json -l python -o ./python
#docker run -it swaggerapi/swagger-codegen-cli generate -i http://localhost:8080/swagger.json -l java -o ./java
#docker run -it swaggerapi/swagger-codegen-cli generate -i http://localhost:8080/swagger.json -l php -o ./php
#docker run -it swaggerapi/swagger-codegen-cli generate -i http://localhost:8080/swagger.json -l go -o ./go
