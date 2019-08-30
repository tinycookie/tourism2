package com.wang.tourism2.service;

import com.wang.tourism2.repository.ScenicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class ScenicInfoService  {
    @Autowired
    ScenicInfoRepository scenicInfoRepository;

    public List<Map<String , Object>> findByBid(int bid){
        return scenicInfoRepository.findScenicEntityByBid(bid);
    }
}
