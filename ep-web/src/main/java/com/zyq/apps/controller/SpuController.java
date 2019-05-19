package com.zyq.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpuController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String getSpuList() {
        String url = "http://SPU/spuService/getSpuList";
        return restTemplate.getForObject(url, String.class);
    }
}
