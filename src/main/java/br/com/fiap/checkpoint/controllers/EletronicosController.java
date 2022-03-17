package br.com.fiap.checkpoint.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.checkpoint.models.Eletronicos;

@Controller
public class EletronicosController {

	@GetMapping("/eletronicos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("eletronicos/index");
		
		Eletronicos eletronico1 = new Eletronicos (1000, "GigabyteRTX 2060", 3000.00, "Placa de vídeo");
		Eletronicos eletronico2 = new Eletronicos (1324, "Iphone 10", 5000.00, "Smartphone");
		Eletronicos eletronico3 = new Eletronicos (3216, "Teclado Microsoft", 49.00, "Teclado");
		Eletronicos eletronico4 = new Eletronicos (7413, "Monitor Acer SA230", 800, "Monitor");
		Eletronicos eletronico5 = new Eletronicos (9871, "Intel core I7 10700", 3000.00, "CPU");
		Eletronicos eletronico6 = new Eletronicos (2000, "Radeon RX6600XT", 3500.00, "Placa de vídeo");
		
		List<Eletronicos> produtosEletronicos = Arrays.asList(eletronico1,eletronico2, eletronico3, eletronico4, eletronico5, eletronico6);
		modelView.addObject("listarEletronicos", produtosEletronicos);
		
		return modelView;
	}
	
}
