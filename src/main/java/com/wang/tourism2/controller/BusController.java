package com.wang.tourism2.controller;

import com.wang.tourism2.entity.BusEntity;
import com.wang.tourism2.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    BusService busService;

    @GetMapping("/bid/{bid}")
    BusEntity getBusByBid(@PathVariable int bid){
        return busService.findByBid(bid);
    }


}
