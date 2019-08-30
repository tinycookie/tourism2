package com.wang.tourism2.controller;

import com.wang.tourism2.service.ScenicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scenicBy")
public class ScenicInfoController {
    @Autowired
    ScenicInfoService scenicInfoService;

    @GetMapping("/bid/{bid}")
    List<Map<String , Object>> getScenicByBid(@PathVariable int bid){
        return scenicInfoService.findByBid(bid);
    }
}
