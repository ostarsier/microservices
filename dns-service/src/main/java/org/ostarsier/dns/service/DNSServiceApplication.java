package org.ostarsier.dns.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DNSServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DNSServiceApplication.class).web(true).run(args);
    }

}