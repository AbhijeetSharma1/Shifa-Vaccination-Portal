package com.masai.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrentUserSession {
 
	
	
	@Id
	@Column(unique = true)
	private Integer userId;

	private String uuid;

	private Boolean admin;

	private LocalDateTime localDateTime;

	public CurrentUserSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentUserSession(Integer userId, String uuid, Boolean admin, LocalDateTime localDateTime) {
		super();
		this.userId = userId;
		this.uuid = uuid;
		this.admin = admin;
		this.localDateTime = localDateTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "CurrentUserSession [userId=" + userId + ", uuid=" + uuid + ", admin=" + admin + ", localDateTime="
				+ localDateTime + "]";
	}
	
	
}
