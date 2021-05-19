package com.sanjiv.cloud.statementService.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sanjiv.cloud.statementService.VO.Card;
import com.sanjiv.cloud.statementService.VO.ResponseTemplateVO;
import com.sanjiv.cloud.statementService.entity.Statement;

@RestController
@RequestMapping("/api")
public class statementController {
	
	private List<Statement> testRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostConstruct
	public void init()
	{
		this.testRepo = new ArrayList<>();
        testRepo.add(new Statement(1l, 2l,"01/11/15 08:41", "US$411.05"));
        testRepo.add(new Statement(2l, 1l,"13/04/13 20:16", "US$1,914.00"));
        testRepo.add(new Statement(3l, 3l,"31/12/15 18:00", "€12.10"));
        testRepo.add(new Statement(4l, 4l,"21/11/10 19:55", "US$1.50"));
        testRepo.add(new Statement(5l, 4l,"10/06/14 09:37", "US$116.00"));
        testRepo.add(new Statement(6l, 5l,"14/01/12 14:49", "R$11.02"));
        testRepo.add(new Statement(7l, 7l,"15/12/20 12:00", "US$14.60"));
        testRepo.add(new Statement(9l, 6l,"01/11/09 13:02", "€1,888.93"));
        testRepo.add(new Statement(10l, 6l,"01/11/20 08:41", "€293.30"));
        testRepo.add(new Statement(11l, 6l,"01/11/20 08:41", "€11.68"));
    
	}
	@RequestMapping(value = "/statements",method = RequestMethod.GET)
	public List<Statement> getStatements()
	{
		return testRepo;
	}
	
	
	//Try Using MapReduce of Hadoop for this after completion of project
    public Statement getStatament(@PathVariable Long statementId) {
        Statement statement =  Optional.ofNullable(
                testRepo
                .stream()
                .filter((stat) -> stat.getId().equals(statementId))
                .reduce(null, (u, v) -> {
                    if (u != null && v != null)
                        throw new IllegalStateException("More than one StatementId found");
                    else return u == null ? v : u;
                })).get();
        
         return statement;
    }
	
    @RequestMapping(value="/statements/{statementId}", method = RequestMethod.GET)
	public ResponseTemplateVO getStatementwithCard(@PathVariable Long statementId) throws RestClientException, URISyntaxException
	{
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Statement statement =  Optional.ofNullable(
                testRepo
                .stream()
                .filter((stat) -> stat.getId().equals(statementId))
                .reduce(null, (u, v) -> {
                    if (u != null && v != null)
                        throw new IllegalStateException("More than one StatementId found");
                    else return u == null ? v : u;
                })).get();
		Card card = restTemplate.getForObject(new URI("http://CARD-SERVICE/api/cards/" + statement.getCardId()), Card.class);
		//Card card = restTemplate.getForObject(null, null)
		vo.setCard(card);
		vo.setStatement(statement);
		return vo;
	}
     
    @RequestMapping(value="/statement", method = RequestMethod.GET)
    public List<Statement> getStatements(@RequestParam Long cardID){
        if(cardID!=null){
            return testRepo
                    .stream()
                    .filter((statement) -> statement.getCardId().equals(cardID))
                    .collect(Collectors.toList());
        }
        return null;
    }
    
    
}
