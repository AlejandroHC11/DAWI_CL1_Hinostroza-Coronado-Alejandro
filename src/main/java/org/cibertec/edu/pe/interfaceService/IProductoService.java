package org.cibertec.edu.pe.interfaceService;

import java.util.List;

import org.cibertec.edu.pe.entity.Producto;

public interface IProductoService {
	public List<Producto> Listado();
	public int Grabar(Producto ObjP);
}
