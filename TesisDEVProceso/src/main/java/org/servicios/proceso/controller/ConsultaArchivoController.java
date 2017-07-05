package org.servicios.proceso.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import org.servicios.proceso.entidades.ConfiguracionParte1;
import org.servicios.proceso.entidades.Status;
import org.servicios.proceso.entidades.TablaProceso;
import org.servicios.proceso.servicio.IConsultaArchivoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proceso")
@Produces("application/json")
public class ConsultaArchivoController {
	private final static Logger log = Logger.getLogger(ConsultaArchivoController.class);
	
	@Autowired
	IConsultaArchivoServicio servicio;
	
	@RequestMapping(value = "/busqueda/{nombre}", method = RequestMethod.GET)
	public @ResponseBody Status busqueda(@PathVariable("nombre") String nombre){
		try {
			servicio.busquedaArchivo(nombre);
			servicio.guardaErrorProceso("Exitoso",nombre);
			return new Status(1,"Creacion finalizada");
			
		} catch (Exception e) {
			servicio.guardaErrorProceso(e.toString(),nombre);
			return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "/listaProcesos", method = RequestMethod.GET)
	public @ResponseBody List<TablaProceso> getAllConfS(){
		List<TablaProceso> list = null;
		try {
			list = servicio.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
