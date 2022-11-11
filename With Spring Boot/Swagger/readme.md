# Swagger

Steps:

1. Include Spring Doc OpenAPI documentation

		<dependency>
		    <groupId>org.springdoc</groupId>
		    <artifactId>springdoc-openapi-ui</artifactId>
		    <version>1.6.12</version>
		</dependency>

2. Hit the endpoint to get the documentation,

http://localhost:8088/swagger-ui.html - To get the swagger html
http://localhost:8088/v3/api-docs - To get the json document