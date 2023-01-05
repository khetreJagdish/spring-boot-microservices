package com.globallogic.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Document(indexName = "invoices")
@Data
public class Invoice {
	
	@Id
	private String id;
	
	@Field(type = FieldType.Text , name = "name")
	private String name;
	
	@Field(type = FieldType.Text, name = "number")
	private String number;
	
	@Field(type = FieldType.Double, name = "amount")
	private Double amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", number=");
		builder.append(number);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
