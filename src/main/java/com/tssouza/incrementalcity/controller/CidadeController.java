package com.tssouza.incrementalcity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

	@PostMapping("/add")
	public String lerCaminho(@RequestBody String uri) {
		return uri;
	}
}
