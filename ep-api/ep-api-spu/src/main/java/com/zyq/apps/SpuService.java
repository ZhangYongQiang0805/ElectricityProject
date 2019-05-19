package com.zyq.apps;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/spuService")
public interface SpuService {

    @RequestMapping("/getSpuList")
    public String getSpuList();

}
