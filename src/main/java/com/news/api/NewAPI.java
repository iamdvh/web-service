package com.news.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.news.dto.NewDTO;
import com.news.service.INewService;

@RestController
public class NewAPI {
	@Autowired
	private INewService newService;
	@PostMapping(value = "/create")
	public NewDTO Create(@RequestBody NewDTO model) {
		return newService.save(model);
	}
}
	