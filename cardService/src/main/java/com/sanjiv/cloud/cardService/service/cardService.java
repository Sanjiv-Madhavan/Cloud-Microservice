package com.sanjiv.cloud.cardService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjiv.cloud.cardService.repository.CardRepository;


@Service
public class cardService {
	
	@Autowired
	private CardRepository cardRepository;
}
