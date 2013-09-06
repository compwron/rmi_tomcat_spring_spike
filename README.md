This spike was developed in Eclipse using the in-IDE Tomcat server (version 7.0). It is intended to demonstrate the use of RMI between spring beans on the client and server. 

It is also to demonstrate the use of one library where a variable number of servers are used in different environments.

The libraries that we found to do this:
* cluster4spring (last updated 2007-06-08) http://sourceforge.net/projects/pscs/files/Cluster4Spring/
* spring-remoting-cluster  "The project is still under heavy development. There is currently a working solution, which lacks some features and might not be stable under all conditions" https://code.google.com/p/spring-remoting-cluster/
* rmi-lb-client - currently using (and used in this example) https://code.google.com/p/rmi-lb-client/

To run:
- Add the Web project to the Tomcat server (or export as .war to use with non-Eclipse Tomcat)
- Run main() in the Client project

The Common project exists to hold dependencies and code needed by both the server and client- this is an echo of a common application structure which we wanted to see work with Spring. 

