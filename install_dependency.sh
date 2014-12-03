#!/bin/bash
#export http_proxy=http://www-proxy-ukc1.uk.oracle.com:80
#export https_proxy=http://www-proxy-ukc1.uk.oracle.com:80
mkdir -p downloads
mkdir -p lib
wget -c http://download.java.net/jtharness/4.4.1/Rel/jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip --directory-prefix=downloads
unzip -p downloads/jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip lib/javatest.jar >lib/javatest.jar  
unzip -p downloads/jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip lib/jh.jar >lib/jh.jar

wget -c http://download.java.net/mobileembedded/cqme/meframework/Rel/1.2.2/me_framework_oss-1_2_2-rel-bin-b06-26_aug_2009.zip --directory-prefix=downloads
unzip -p downloads/me_framework_oss-1_2_2-rel-bin-b06-26_aug_2009.zip lib/j2mefw_jt.jar >lib/j2mefw_jt.jar

#unzip jtharness-4_4_1-MR1-bin-b13-20_dec_2011.zip -d /tmp/jtharness-4.4.1
#mv -f /tmp/jtharness-4.4.1/lib/javatest.jar lib/
#mv -f /tmp/jtharness-4.4.1/lib/jh.jar lib/
#rm -rf /tmp/jtharness-4.4.1
mvn install:install-file -DgroupId=com.sun -DartifactId=javatest -Dversion=4.4.1 -Dpackaging=jar -Dfile=./lib/javatest.jar
mvn install:install-file -DgroupId=com.sun -DartifactId=javax.help -Dversion=2.0.3 -Dpackaging=jar -Dfile=./lib/jh.jar
mvn install:install-file -DgroupId=com.sun -DartifactId=j2mefw.javatest -Dversion=1.2.2 -Dpackaging=jar -Dfile=./lib/j2mefw_jt.jar