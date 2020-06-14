#Open API 3.0 - Data Model Generator using Maven Plugin

## Introduction
This java - maven project is used to generate all the Data Object Java classes specified in the .yaml specification file along with their relations.
A sample specification is given in src/main/resources/api-spec/Taxation.yaml that has multiple nested .yaml specification of DTO object.
A simple command will generate all .java classes in the specified package without needing to write any code.

## How to run
1. Go to root directory of project
2. Run `mvn clean install`

##Configuration details in pom.xml
1. package specification : ` <report.package.name>com.example.dataModel</report.package.name>`


 