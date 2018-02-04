package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.packt.webstore.domain.*;
import com.packt.webstore.service.*;

@RestController
@RequestMapping(value = "rest/profile")
public class ProfileRestController {
	
	 @Autowired(required=true)
	 @Qualifier("profileService")
	private ProfileService prflService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Profiles create(@RequestBody Profiles profile) {
		return prflService.create(profile);
	}

	@RequestMapping(value = "/{UserId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Profiles read(@PathVariable(value = "ProfileId") int id) {
		return prflService.read(id);
	}

	@RequestMapping(value = "/{ProfileId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void update(@PathVariable(value = "id") int id, @RequestBody Profiles profile) {
		prflService.update(id, profile);
	}

	@RequestMapping(value = "/{ProfileId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable(value = "id") int id) {
		prflService.delete(id);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegalrequest, please verify your payload")
	public void handleClientErrors(Exception ex) {
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
	public void handleServerErrors(Exception ex) {
	}
}
