#!/bin/bash

wget -c http://download.java.net/jtharness/4.4.1/Rel/jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip
unzip jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip -d /tmp/jtharness-4.4.1
mkdir -p lib
mv -f /tmp/jtharness-4.4.1/lib/javatest.jar lib/
mv -f /tmp/jtharness-4.4.1/lib/jh.jar lib/
rm -rf /tmp/jtharness-4.4.1
mvn install:install-file -DgroupId=com.sun -DartifactId=javatest -Dversion=4.4.1 -Dpackaging=jar -Dfile=./lib/javatest.jar
