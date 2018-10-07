package yao.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/hello")
	@ResponseBody
	public String home() {
		return "Hello yao! " + System.currentTimeMillis();
	}

//	@RequestMapping("/login")
//	@ResponseBody
//	public String loginPage() {
//		Test service = Feign.builder()
//				// .encoder(new JacksonEncoder())
//				// .decoder(new JacksonDecoder())
//				.target(Test.class, "http://121.11.161.36:8082");
//		return service.getLoginPage("张三");
//	}
}