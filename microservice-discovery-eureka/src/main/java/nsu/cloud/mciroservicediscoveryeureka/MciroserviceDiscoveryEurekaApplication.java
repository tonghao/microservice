package nsu.cloud.mciroservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MciroserviceDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MciroserviceDiscoveryEurekaApplication.class, args);
    }

}
