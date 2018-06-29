package com.attech.encrypt.controller;

import com.attech.encrypt.anno.Decrypt;
import com.attech.encrypt.anno.Encrypt;
import com.attech.encrypt.praram.StuInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	/**
	 * 进入测试页面
	 * @return
	 */
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	/**
	 * 测试请求数据
	 * @param info
	 * @return
	 */
	@PostMapping("/save")
	@ResponseBody
	@Decrypt
	@Encrypt
	public Object save(@RequestBody StuInfo info) {
		System.out.println(info.getName());
		return info;
	}
	
	/**
	 * 测试返回数据，会自动加密
	 * @return
	 */
	@GetMapping("/get")
	@ResponseBody
	@Encrypt
	public Object get() {
		StuInfo info = new StuInfo();
		info.setName("yinjihuan");
		return info;
	}
	
}
