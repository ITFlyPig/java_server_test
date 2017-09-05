package com.wangyuelin.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value = "user")
	public @ResponseBody User getUser() {

		// System.out.println("this is json!!!");
		// Map<String, String> map = new HashMap<String, String>();
		// map.put("json", "value1");
		// map.put("jack", "value2");
		// DefaultIndenter de = new DefaultIndenter();
		User user = new User();
		user.name = "wangyulein";
		user.sex = "man";
		return user;

	}

	@RequestMapping("fuck")
	public @ResponseBody String getString() {
		return "this fuck code finally work!";
	}

}
