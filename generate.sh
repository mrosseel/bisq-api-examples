#!/bin/sh

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://localhost:8080/swagger.json -l html -o ../bitcoin_projects/bisq-api-examples/
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://localhost:8080/swagger.json -l python -o ../bitcoin_projects/bisq-api-examples/python
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://localhost:8080/swagger.json -l java -o ../bitcoin_projects/bisq-api-examples/java
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://localhost:8080/swagger.json -l php -o ../bitcoin_projects/bisq-api-examples/php
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://localhost:8080/swagger.json -l go -o ../bitcoin_projects/bisq-api-examples/go
