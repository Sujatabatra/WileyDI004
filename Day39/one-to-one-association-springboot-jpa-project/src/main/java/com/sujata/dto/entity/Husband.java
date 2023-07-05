package com.sujata.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Husband {
	
	@Id
	private int husbandId;
	private String husbandName;
	
	public Husband() {
		
	}

	public Husband(int husbandId, String husbandName) {
		super();
		this.husbandId = husbandId;
		this.husbandName = husbandName;
	}

	public int getHusbandId() {
		return husbandId;
	}

	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	@Override
	public String toString() {
		return "Husband [husbandId=" + husbandId + ", husbandName=" + husbandName + "]";
	}
	
	
}
