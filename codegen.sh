#!/bin/sh
currdir=`pwd`
curl http://localhost:8080/swagger.json > swagger.json
rm -Rf generated docs
docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l html -o /tmp/docs
docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l python -o /tmp/generated/python
docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l java -o /tmp/generated/java
docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l php -o /tmp/generated/php
docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l go -o /tmp/generated/golang
#docker run -it -v ${currdir}:/tmp swaggerapi/swagger-codegen-cli generate -i /tmp/swagger.json -l javascript -o /tmp/generated/javascript
