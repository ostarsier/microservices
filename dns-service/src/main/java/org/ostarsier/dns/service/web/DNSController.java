package org.ostarsier.dns.service.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DNSController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    public String getIp(@RequestParam String domain) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
        return inetAddress.getHostAddress();
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println( inetAddress.getHostAddress());
    }

}