package com.wang.tourism2.repository;

import com.wang.tourism2.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<BusEntity,Integer> {
    List<BusEntity> findAll();
    BusEntity findByBid(int bid);
    BusEntity save(BusEntity busEntity);
    BusEntity deleteByBid(int bid);

}
