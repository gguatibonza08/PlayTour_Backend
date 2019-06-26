/**
 * 
 */
package com.gguatibonza.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.entities.Ruta;
import com.gguatibonza.app.models.services.IAvatarService;
import com.gguatibonza.app.models.services.IRutaService;

/**
 * 
 * @author gian
 * @Date 2019-06-26
 */
@RestController
@RequestMapping(value = "/test")
public class ControllerTest {

	@Autowired
	private IAvatarService avatarService;

	@Autowired
	private IRutaService rutaService;

	@GetMapping(value = "/getAvatares")
	public ResponseEntity<List<Avatar>> crearCliente() {

		List<Ruta> rutas = rutaService.findAll();

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "Todo bien")
				.body(avatarService.findByRuta(rutas.get(0)));
	}

}
