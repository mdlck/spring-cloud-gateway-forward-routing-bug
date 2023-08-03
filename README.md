# spring-cloud-gateway-forward-routing-bug
Simple Spring Boot-Project with Spring Cloud Gateway to reproduce a StackOverflowError

This project contains:
- a simple application.yaml (Spring Cloud Gateway Configuration)
- the file SpringCloudGatewayForwardRoutingBugApplication.java initializing a RouterFunction-Bean to serve static resources

You can reproduce the Error by starting the server (default port 8080) and opening
http://localhost:8080/
in your browser.

As you can see, the application.yaml contains a forward to a non-existing file, which produces the error. I would expect Spring Cloud Gateway to just answer with a 404 instead of crashing the server.