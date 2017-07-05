package org.servicios.proceso.dao;

import java.util.List;

import org.servicios.proceso.entidades.ConfiguracionParte1;
import org.servicios.proceso.entidades.TablaProceso;

public interface IConsultaArchivo {

	public ConfiguracionParte1 busquedaArchivo(String nombre);

	public boolean guardaErrorProceso(String string, String nombre);
	
	public List<TablaProceso> list();
	
}
