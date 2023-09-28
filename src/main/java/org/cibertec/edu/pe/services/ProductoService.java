package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listado() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public int Grabar(Producto ObjP) {
		int respuesta = 0;
		Producto p = data.save(ObjP);
		if(!p.equals(null)) respuesta = 1;
		return respuesta;
	}

}
