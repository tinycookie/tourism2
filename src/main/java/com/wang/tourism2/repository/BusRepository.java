package com.wang.tourism2.repository;

import com.wang.tourism2.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusEntity,Integer> {
    BusEntity findByBid(int bid);

}
