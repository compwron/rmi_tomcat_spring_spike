This spike was developed in Eclipse using the in-IDE Tomcat server (version 7.0). It is intended to demonstrate the use of RMI between spring beans on the client and server. 

To run:
- Add the Web project to the Tomcat server (or export as .war to use with non-Eclipse Tomcat)
- Run main() in the Client project

The Common project exists to hold dependencies and code needed by both the server and client- this is an echo of a common application structure which we wanted to see work with Spring. 