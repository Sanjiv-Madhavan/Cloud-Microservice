package com.sanjiv.cloud.cardService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjiv.cloud.cardService.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{

}
