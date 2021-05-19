package com.simpleapidb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="users")
public class User implements Serializable {

	 
	private static final long serialVersionUID = 561837640739567975L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private long usuarioId;
	@Column(length = 60)
	private String name; 
	private String lastName;
	@Column(name="correo", nullable=false, unique=true, length=80)
	private String email;
	private Boolean enabled;
	
	 
	public long getId() {
		return usuarioId;
	}

	public void setId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	 
	 
	
	
}
