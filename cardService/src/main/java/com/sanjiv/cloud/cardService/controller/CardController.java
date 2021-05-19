package com.sanjiv.cloud.cardService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanjiv.cloud.cardService.entity.Card;

@RestController
@RequestMapping("/api")
public class CardController {
	
	private List<Card> testRepo;
	
	@PostConstruct
	public List<Card> init()
	{
		this.testRepo = new ArrayList<>();
        testRepo.add(new Card(1l,"Sanjiv Madhavan", String.valueOf(Math.random()).substring(0, 16),"11/20"));
        testRepo.add(new Card(2l,"Paul Crarte", String.valueOf(Math.random()).substring(0, 16),"09/25"));
        testRepo.add(new Card(3l,"Ana Hassent", String.valueOf(Math.random()).substring(0, 16),"01/19"));
        testRepo.add(new Card(4l,"Elena Tarin", String.valueOf(Math.random()).substring(0, 16),"06/22"));
        testRepo.add(new Card(5l,"Wending Qua", String.valueOf(Math.random()).substring(0, 16),"03/25"));
        testRepo.add(new Card(6l,"Julio Sanch", String.valueOf(Math.random()).substring(0, 16),"09/18"));
        testRepo.add(new Card(7l,"Adolf Bianc", String.valueOf(Math.random()).substring(0, 16),"07/22"));
        return testRepo;
	}
	
	@RequestMapping(value = "/cards",method = RequestMethod.GET)
	public List<Card> getCards()
	{
		return testRepo;
	}
	
	@RequestMapping(value = "/cards/{cardID}",method = RequestMethod.GET)
	public Card getCard(@PathVariable Long cardID)
	{
		return Optional.ofNullable(
                testRepo
                .stream()
                .filter((card) -> card.getId().equals(cardID))
                .reduce(null, (u, v) -> {
                    if (u != null && v != null)
                        throw new IllegalStateException("More than one CardId found");
                    else return u == null ? v : u;
                })).get();
	}
	
	@RequestMapping(value = "/new-card",method = RequestMethod.POST,headers = "Accept=application/json")
	public void createCard(@RequestBody Card newCard) {
        if(newCard.getId()!=null){
            testRepo.add(newCard);
        }
        System.out.println("New card passing: " + newCard);
    }
}
