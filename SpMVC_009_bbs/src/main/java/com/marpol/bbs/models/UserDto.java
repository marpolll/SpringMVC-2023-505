package com.marpol.bbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter

@Entity
@Table(name="tbl_users", schema ="jpaDB")
public class UserDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "username" , columnDefinition = "VARCHAR(20)")
	private String username;
	
	@Column(name = "password", columnDefinition = "VARCHAR(125)")
	private String password;
	
	@Column(name = "email", columnDefinition = "VARCHAR(125)")
	private String email;
	
	private String nickname;
	
	@Column(nullable = true)
	private int age;
}
