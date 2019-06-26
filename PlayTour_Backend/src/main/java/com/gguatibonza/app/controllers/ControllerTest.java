/**
 * 
 */
package com.gguatibonza.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.services.IAvatarService;

/**
 * @author gian
 *
 */
@Controller
@RequestMapping("/test")
public class ControllerTest {

	@Autowired
	private IAvatarService avatarService;

	@GetMapping(value = "/avatares", produces = { "application/json" })
	public List<Avatar> crearCliente() {
		List<Avatar> result = avatarService.findAll();
		return result;
	}

}
