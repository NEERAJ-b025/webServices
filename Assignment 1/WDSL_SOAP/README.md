# WDSL/SOAP Web Service

## Bottom Up Approach

- Web Service written as a maven project using IntelliJ Idea.
- After extracting WDSL_SOAP tar file, go to bottom-up folder.
- Open the maven project bottom-up using any IDE (preferably IntelliJ IDEA).
- Make sure maven is installed in the system.
	-  `sudo apt-get install maven` : Ubuntu
	-  **[https://howtodoinjava.com/maven/how-to-install-maven-on-windows/](https://howtodoinjava.com/maven/how-to-install-maven-on-windows/) (For Windows)**
	- **Make sure java version used is java 8 (i.e java 1.8)**
- Clean, compile and package the project in IDE or in the cmd line as:
	- `mvn clean compile package` 
- This generates the target classes and jar in the project for execution.
- You could run the webservice by running the `ServerApp.java` in the IDE or do `java -jar target/soap-calculator-bu-0.0.1-SNAPSHOT.jar` from the project base directory. 
- Bottom Up Approach makes use of models written in java classes to be automatically generated into WSDL files. The modes are written in `CalcModel` class.
- **Make sure port 8080 is open and not in use by any other application before running.**
- You can find the generated WSDL file by hitting the url:
	- **[http://localhost:8080/ws/?WSDL](http://localhost:8080/ws/?WSDL)**
- The following request xml files are stored in the base directory that could be used to hit the SOAP service:
	-   request_add.xml (SOAP Request for Addition)
	-   request_sub.xml (SOAP Request for Subtraction)
	-   request_mul.xml (SOAP Request for Multiplication)
	-   request_div.xml (SOAP Request for Division)
	-   You can change the arguments inside the ``<value1>x</value1> and <value2>y</value2> tags``.
	-   curl cmd is used to act as a client in terminal to transfer data between client (terminal) and server.
	-   curl --header "content-type: text/xml" -d @request_add.xml [http://localhost:8080/ws](http://localhost:8080/ws)
	-   curl --header "content-type: text/xml" -d @request_sub.xml [http://localhost:8080/ws](http://localhost:8080/ws)
	-   curl --header "content-type: text/xml" -d @request_mul.xml [http://localhost:8080/ws](http://localhost:8080/ws)
	-   curl --header "content-type: text/xml" -d @request_div.xml [http://localhost:8080/ws](http://localhost:8080/ws)
	-   Response comes in xml format and the calculated value can be found in retVal tag. Eg: 
		- ``<?xml version="1.0" ?><S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/"><S:Body><ns2:mulResponse xmlns:ns2="[http://impl.service.ws.neeraj.com/](http://impl.service.ws.neeraj.com/)"><return><retVal>20.25</retVal><value1>4.5</value1><value2>4.5</value2></return></ns2:mulResponse></S:Body></S:Envelope>``

## Top Down Approach

- Web Service written as a maven project using Intellij Idea.
- Go to soap-calculator folder.
- Open the maven soap-calculator using any IDE (preferably IntelliJ IDEA).
-  Make sure maven is installed in the system.
	-   ``sudo apt-get install maven`` (For Ubuntu)
	-   [https://howtodoinjava.com/maven/how-to-install-maven-on-windows/](https://howtodoinjava.com/maven/how-to-install-maven-on-windows/) (For Windows)
-   **Make sure java version used is java 8 (i.e java 1.8)**
-   Clean, compile and package the project in IDE or in terminal as:
	-   ``mvn clean compile package``
-  This generates the target classes and jar in the project for execution.
-   You could run the webservice by running the ServerApp.java in the IDE environment or do ``java -jar target/soap-calculator-0.0.1-SNAPSHOT.jar`` from the project source directory.

-   A spring boot application with tomcat server runs with the necessary SOAP web services on port 8080.
    
-   Top-Down Approach involves designing WSDL and java classes and models automatically generated based on the WSDL file. The WSDL design can be found in calculatorService.xsd in resources folder which upon project build is converted to a WSDL file using a maven dependency added as plugin.
    
-   You can find the WSDL file by hitting:
    

	-   [http://localhost:8080/ws/calculatorService.wsdl](http://localhost:8080/ws/calculatorService.wsdl)
    

-   The following request xml files are stored in the base directory that could be used to as request to hit the SOAP service:
    

	-   request_add.xml (Addition)
    
	-   request_sub.xml (Subtraction)
    
	-   request_mul.xml (Multiplication)
    
	-   request_div.xml (Division)
    
	-   You can change the arguments inside the ``<gs:value1>x</gs:value1> and <gs:value2>y</gs:value2> tags``.
    
	-   ``curl`` cmd is used to act as a client in terminal to transfer data between client (terminal) and server.
    

		-   curl --header "content-type: text/xml" -d @request_add.xml [http://localhost:8080/ws](http://localhost:8080/ws)
    
		-   curl --header "content-type: text/xml" -d @request_sub.xml [http://localhost:8080/ws](http://localhost:8080/ws)
    
		-   curl --header "content-type: text/xml" -d @request_mul.xml [http://localhost:8080/ws](http://localhost:8080/ws)
    
		-   curl --header "content-type: text/xml" -d @request_div.xml [http://localhost:8080/ws](http://localhost:8080/ws)
    
		-   Response is generated in xml format the calculated value is found in ``<ns2:val>`` tag.
    

			-   Eg: ``<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"><SOAP-ENV:Header/><SOAP-ENV:Body><ns2:getCalcResponse xmlns:ns2="[http://www.neeraj.com/springsoap/gen](http://www.neeraj.com/springsoap/gen)"><ns2:val>2.0</ns2:val></ns2:getCalcResponse></SOAP-ENV:Body></SOAP-ENV:Envelope>``