- To run from sources: `mvn spring-boot:run`.
- To build JAR file: `mvn clean package`
    - To run JAR file: `java -jar target/soap-0.0.1-SNAPSHOT.jar`

- To make a request with cURL: `curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws`
