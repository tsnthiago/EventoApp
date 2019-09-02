package app.ecofast.eventoapp.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import app.ecofast.eventoapp.application.models.Evento;
import app.ecofast.eventoapp.application.repository.EventoRepository;

@Controller
public class IndexController {

	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/")
	private ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
	
}
