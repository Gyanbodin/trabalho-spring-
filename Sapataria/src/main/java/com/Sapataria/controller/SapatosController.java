package com.Sapataria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Sapataria.modelo.Sapatos;
import com.Sapataria.reposity.CrudSapatos;


@Controller
@RequestMapping
public class SapatosController {
	
	@Autowired
	private CrudSapatos Sapatos;

	
	@GetMapping("/")
	public ModelAndView listar() {

		
		ModelAndView mv = new ModelAndView("Sapatos");
		
		mv.addObject("convidado", Sapatos.findAll());
		
		return mv;
	}
	
	@PostMapping("/")
	public String salvar(Sapatos sapatos) {
		this.Sapatos.save(sapatos);
		return "/";
		
	} 
	

}

