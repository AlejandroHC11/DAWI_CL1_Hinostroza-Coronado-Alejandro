package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

	@Autowired
	private IProductoService servicio;
	
	//Metodo para listar
	@GetMapping("/listar")			//http://localhost:8080/listar
	public String Listar(Model m) {
		List<Producto> lista = servicio.Listado();
		m.addAttribute("productos",lista);
		return "listar";		//listar.html
	}
	//Metodo para nuevo
	@GetMapping("/nuevo")		//http://localhost:8080/nuevo
	public String nuevo(Model m) {
		m.addAttribute("producto",new Producto());
		return "formulario";		//formulario.html
	}
	//Metodo para guardar
	@GetMapping("/guardar")		//http://localhost:8080/guardar
	public String guardar(@Validated Producto p, Model m) {
		servicio.Grabar(p);
		return "redirect:/listar";	
	}
	
}
