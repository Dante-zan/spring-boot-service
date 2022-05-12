package com.example.springbootservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-boot-docker-git")
public interface DockClient {

	@RequestMapping(method = RequestMethod.GET, value = "/hellgate/{name}")
	String getHome(@PathVariable("name") String name);

}
