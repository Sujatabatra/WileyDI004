package com.sujata.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	@Id
	private String wifeId;
	private String wifeName;
	@OneToOne
	private Husband hubby;
	
	public Wife() {
		
	}

	public Wife(String wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}
	
	public Wife(String wifeId, String wifeName, Husband hubby) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
		this.hubby = hubby;
	}

	public String getWifeId() {
		return wifeId;
	}

	public void setWifeId(String wifeId) {
		this.wifeId = wifeId;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public Husband getHubby() {
		return hubby;
	}

	public void setHubby(Husband hubby) {
		this.hubby = hubby;
	}

	@Override
	public String toString() {
		return "Wife [wifeId=" + wifeId + ", wifeName=" + wifeName + ", hubby=" + hubby + "]";
	}
	
}
