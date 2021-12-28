package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.modelos.clientebanco;
import com.sv.repositorio.InterfaceUser;

@RestController
@RequestMapping ("/clientebanco")	

public class UserControlador {

	
	@Autowired 
	private InterfaceUser interfaceUser;
	
	
	@GetMapping
	public List <clientebanco> users ()
	
	{
		return (List<clientebanco>) interfaceUser.findAll();
		
		
	}
	
}
