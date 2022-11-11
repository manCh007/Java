package com.manCh007.java.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
}
