package com.wang.tourism2.service;


import com.wang.tourism2.entity.BusEntity;
import com.wang.tourism2.repository.BusRepository;
import org.hibernate.query.criteria.internal.BasicPathUsageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BusService {
    @Autowired
    BusRepository busRepository;

    public BusEntity findByBid(int bid){
        return busRepository.findByBid(bid);
    }

    public BusEntity deleteById(int bid){
        return busRepository.deleteByBid(bid);
    }
    public BusEntity save(BusEntity busEntity){
        return busRepository.save(busEntity);
    }
    public List<BusEntity> findAll(){
        return busRepository.findAll();
    }

}
