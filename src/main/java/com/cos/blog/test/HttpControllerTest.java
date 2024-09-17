package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTest : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		//Member m = new Member(1, "ssar", "1234", "email");
		Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
		//System.out.println(TAG + "getter :" + m.getId());
		System.out.println(TAG + "getter :" + m.getUsername());
		m.setUsername("cos");
		//System.out.println(TAG + "setter : " + m.getId());
		System.out.println(TAG + "setter : " + m.getUsername());
		return "lombok test 완료";
	}
	
//	//http://localhost:8080/http/get(select)
//	@GetMapping("/http/getTestRequestParam")
//	public String getTestRequestParam(@RequestParam int id, @RequestParam String username) { 
//		System.out.println();
//		return "get 요청 :" + id + "," +username;
//	}
//	
//	//http://localhost:8080/http/get(select)
//		@GetMapping("/http/getObject")
//		public String getTestObject(Member m) {//?id=1&username=ssar&password=1234&email=ssar@nate.com
//			return "get 요청 :" + m.getId() + "," +m.getUsername()+","+m.getPassword()+","+m.getEmail();
//		}
//	
	
		
		
	//인터넷 브라우저 요청은 무조건 get 요청밖에 할 수 없다.	
		
		
		
	//post는 주소에 붙여서 보내는 것이 아니라
	//Body라는 곳에 담아서 보낸다.
	//1. x-www-encoded
	//ex)   <form>
	//       			<input type =" ">
	//	        </form>
	//http://localhost:8080/http/post(insert)
	@PostMapping("/http/postXwwwEncoded")
	public String postTestXwwwEncoded(Member m) {
		return "post 요청 :" + m.getId() + "," +m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	//http://localhost:8080/http/post(insert)
	@PostMapping("/http/postTextPlain") //text/plain
	public String postTestTextPlain(@RequestBody String text) {
		return "post 요청 :" + text;
	}
	
	//http://localhost:8080/http/post(insert)
		@PostMapping("/http/postApplicationJson")//application/json -> //MessageConvertoer (스프링부트)
		public String postTestApplicationJson(@RequestBody Member m) {
			return"post 요청 :" + m.getId() + "," +m.getUsername()+","+m.getPassword()+","+m.getEmail();
		}
	

	//http://localhost:8080/http/put(update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return"put 요청 :" + m.getId() + "," +m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	//http://localhost:8080/http/delete(delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
