package org.servicios.proceso.servicio;

import java.util.List;

import org.servicios.proceso.entidades.ConfiguracionParte1;
import org.servicios.proceso.entidades.TablaProceso;

public interface IConsultaArchivoServicio {

	public ConfiguracionParte1 busquedaArchivo(String nombre);

	public boolean guardaErrorProceso(String string, String nombre);
	
	public List<TablaProceso> list();
}
