package com.zyq.apps.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.zyq.apps.SpuService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpuServiceImpl implements SpuService {

    @Override
    public String getSpuList() {
        JSONObject root = new JSONObject();
        root.put("msg", "spu list");
        return root.toJSONString();
    }
}
