package com.blogspot.nirmal.springboot.dao;

import com.blogspot.nirmal.springboot.ReceivingMsg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReceivingMsgDao extends JpaRepository<ReceivingMsg, Long> {
    ReceivingMsg findByName(String name);

}