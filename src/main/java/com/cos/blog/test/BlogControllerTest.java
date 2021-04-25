package com.cos.blog.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든파일을 메모리에 new하는것은 아니구요
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC)스프링 컨테이너에 관리해줍니다.
//스프링 시작할때 메모리에 띄운다.
@RestController
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public ResponseEntity<?> hello() {
		//return "<h1>hello spring boot</h1>";
		return new ResponseEntity("{\"id\":\"clickral\"}",HttpStatus.OK);
	}
}