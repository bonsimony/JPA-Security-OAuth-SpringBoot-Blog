package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@Data (@Getter, @Setter)

//@AllArgsConstructor
//@RequiredArgsConstructor //final 붙은 아이들에 대한 생성자 생성


@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	
	@Builder
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
}	
	
	
//	private final int id;
//	private final String username;
//	private final String password;
//	private final String email;
	
//	//모델(클래스)을 만들때는
//	//변수는 private로 만들어준다.
//	//private 변수의 상태를 변경하기 위해
//	//getter, setter를 사용한다.
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	//생성자
//	public Member(int id, String username, String password, String email) {
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.email = email;
//	}
	
}
