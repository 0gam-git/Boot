package com.younggambyeon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping(value = "/list")
	public String ReadingList() {
		return "view/readingList";
	}
}
