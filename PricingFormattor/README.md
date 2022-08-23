Instructions:

Pre-requisites:

- Java 8
- Maven 3.8


Step 1: On the project location, perform 

    `mvn clean install`

Step 2: When the jar file is generated in the target folder run the below command

     C:/Project Location> java -jar <location of JAR generated with maven>
     
Step 3: Go to the browser and hit `http://localhost:9090/pricing/{number to be converted}`

For example:  `http://localhost:9090/pricing/105.25`


You will see the converted value on the browser screen.

:::note

I didnt get time to submit the unit tests. But I can submit them by the end of the day.

:::

Thank you!