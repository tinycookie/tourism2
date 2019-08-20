package com.wang.tourism2.service;


import com.wang.tourism2.entity.BusEntity;
import com.wang.tourism2.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class BusService {
    @Autowired
    BusRepository busRepository;

    public BusEntity findByBid(int bid){
        return busRepository.findByBid(bid);
    }

}
