CTM Smoke Test/Functional Test cases

This project is created to validate the smoke test cases for the web application "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT"

This Project has Two Feature file

1. end_to_end.feature
2. your_supplier.feature

end_to_end.feature

   This file have test cases for Smoke testing of this application with Three Test scenarios. Each scenario will cover each page of the Web application
   
your_supplier.feature

   This file has the test cases for the Functional Testing for the Your supplier page. It has four scenarios. Each scenario will cover individual web elements validation.
   
    
Prerequisites
1. JDK
2. Maven

Install Steps for Maven:

1.Maven can be downloaded from this location  http://maven.apache.org/download.cgi. I have extracted it in location – C:/apache-maven-3.0.4. You can choose your own location.

2.Set the M2_HOME and MAVEN_HOME variable to maven installation folder

3.Include ‘maven/bin’ directory in ‘PATH’ variable

4.  Verify maven in console with command mvn -version in command prompt and hit ENTER

Install Java 

1. Install JDK in the default location

How to Run: 

Download this project in to your local machine.Using command prompt navigate to the FrameworkDev (Project folder) location and run the command "mvn test"


This project can be imported in to Eclipse which can run as Maven project or Junit project.
Right click on the pom.xml file and select Run As --> Maven test

The test runner is JUnit. Execute the tests from within your IDE by right-clicking TestRunner/TestRun.java and running it as a JUnit Test.

Drivers:
  I have added the "Chrome" and "firefox" drivers in the Drivers folder of project. The basic Driver setup is provided in the BaseClass.java