// api-gateway/src/main/java/.../ApiGatewayApplication.java
package io.github.zayan_khan1.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {
  public static void main(String[] args) {
    System.setProperty("server.port", "8081");
    SpringApplication.run(ApiGatewayApplication.class, args);
  }
}
