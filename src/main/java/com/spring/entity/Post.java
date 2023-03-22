package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "post")
@Getter
@Setter
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_post", nullable = false, unique=true)
	private Long id;
	@Column(name="description", length = 255)
	private String description;
	@ManyToOne
	private User user;
	
	
	public Post() {
	}


	public Post(String description, User user) {
		this.description = description;
		this.user = user;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" 
				+ description + ", user=" + user + "]";
	}
	
}
