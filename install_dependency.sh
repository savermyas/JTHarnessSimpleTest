#!/bin/bash

mvn install:install-file -DgroupId=com.sun -DartifactId=javatest -Dversion=4.4.1 -Dpackaging=jar -Dfile=./lib/javatest.jar
