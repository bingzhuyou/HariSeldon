package com.boco.xdpp.hs.domain;

import java.io.Serializable;

public class Person implements Serializable {  

	private static final long serialVersionUID = -5803213185131874246L;
	
	private int id;  
    private String name;  
    private boolean status;  

    public Person() {  
        // do nothing  
    }

	public Person(int id2, String name2, boolean status2) {
		 setId(id2);
		 setName(name2);
		 setStatus(status2);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}  
}  