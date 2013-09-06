svn checkout http://rmi-lb-client.googlecode.com/svn/trunk/ rmi-lb-client-read-only
cd rmi-lb-client-read-only
mvn package -Dmaven.test.skip=true # there is a failing test as of Sept 2013
cp target/rmi-lb-client-3.2.0.jar ../../AccountCommon/lib/


