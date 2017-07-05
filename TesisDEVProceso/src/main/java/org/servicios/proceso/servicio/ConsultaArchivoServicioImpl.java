package org.servicios.proceso.servicio;

import java.util.List;

import org.servicios.proceso.dao.IConsultaArchivo;
import org.servicios.proceso.entidades.ConfiguracionParte1;
import org.servicios.proceso.entidades.TablaProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaArchivoServicioImpl implements IConsultaArchivoServicio{

	@Autowired
	IConsultaArchivo consulta;
	
	@Override
	public ConfiguracionParte1 busquedaArchivo(String nombre) {
		// TODO Auto-generated method stub
		return consulta.busquedaArchivo(nombre);
	}

	@Override
	public boolean guardaErrorProceso(String string, String nombre) {
		// TODO Auto-generated method stub
		return consulta.guardaErrorProceso(string, nombre);
	}

	@Override
	public List<TablaProceso> list() {
		// TODO Auto-generated method stub
		return consulta.list();
	}

}
