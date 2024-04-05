package com.example;

import org.springframework.stereotype.Controller;

@Controller
public class TestSerlvet {

	public String main() {
		System.out.println("/ 주소 요청///////");
		System.out.println("/ 주소 요청222222222222222      ///////");
		System.out.println("/ 주소 요청3333333333333333      ///////");

		return "main";//뷰리졸버 동작
	}
}
