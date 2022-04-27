package com.sanjiv.cloud.statementService.VO;

import com.sanjiv.cloud.statementService.entity.Statement;

public class ResponseTemplateVO {
	private Statement statement;
	private Card card;
	public ResponseTemplateVO() {
		super();
	}
	public ResponseTemplateVO(Statement statement, Card card) {
		super();
		this.statement = statement;
		this.card = card;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
}
