package cn.forever.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FreemarkerController {
	@RequestMapping("/freemarker")
	public String freemarker(Map<String,Object> map) {
		map.put("username", "大佬");
		map.put("age", "18");
		map.put("sex", "1");
		List<String> userlist = new ArrayList<String>();
		userlist.add("张三");
		userlist.add("王五");
		map.put("userlist", userlist);
		return "freemarker";
	}
}
