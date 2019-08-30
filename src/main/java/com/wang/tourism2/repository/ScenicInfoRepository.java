package com.wang.tourism2.repository;

import com.wang.tourism2.entity.ScenicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ScenicInfoRepository extends JpaRepository<ScenicEntity,Integer> {

    @Query(value = "SELECT s.sid ,s.s_opentime,s.sname,s.sprice,s.scomment,s.simage FROM scenic s , bus b WHERE b.bid = :bid and b.sid = s.sid" , nativeQuery = true)
    List<Map<String , Object>> findScenicEntityByBid(@Param("bid") int bid);
}
