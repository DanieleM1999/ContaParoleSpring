package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.model.Contatore;

@Controller
public class ControllerSceltaParole {

	@RequestMapping(value = "/contaVocaboli", method = RequestMethod.POST)
	public ModelAndView scelta(@RequestParam("scelta") String scelta, @RequestParam("testo") String testo, Model model) {
		ModelAndView prossimaPaginaJSP = new ModelAndView();
		prossimaPaginaJSP.setViewName("risultato");
		prossimaPaginaJSP.addObject("sceltaDaController", scelta);
		
		Contatore op = new Contatore();
		if ("parole".equals(scelta)) {
			prossimaPaginaJSP.addObject("risultato", op.contaParole(testo));
		}
		return prossimaPaginaJSP;
	}

}
