package org.servicios.proceso.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import org.servicios.proceso.constantes.ConstantesUAT;
import org.servicios.proceso.entidades.ConfiguracionParte1;
import org.servicios.proceso.entidades.DatosPersona;
import org.servicios.proceso.entidades.TablaProceso;
import org.servicios.proceso.metodos.BusquedaFichero;
import org.springframework.beans.factory.annotation.Autowired;
import org.servicios.proceso.metodos.Data;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;


public class ConsultaArchivo implements IConsultaArchivo{
	
	static final String[] headers = {"nombre","apellido","seguro","suma","prima"};
	
	private final static Logger log = Logger.getLogger(ConfiguracionParte1.class);
	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public ConfiguracionParte1 busquedaArchivo(String nombre) {
	BusquedaFichero busquedaFichero = new BusquedaFichero();
ConstantesUAT uat;	
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		ConfiguracionParte1 parte1 = new ConfiguracionParte1();
		List<ConfiguracionParte1> lista =  session.createCriteria(ConfiguracionParte1.class).
				add(Restrictions.eq("activo",new Short("1"))).add(Restrictions.eq("nombreCarga",nombre)).list();
		String name = lista.get(0).getNombreCarga();
		parte1.setNombreCarga(name);
		log.info("parte1 "+parte1);
		String ruta = "C:/txt/"+name+".txt";
		BufferedReader arch = busquedaFichero.getBuffered(ruta);
		if(arch != null){
			log.info("Exitoso");
			try {
				separaDatos(ruta);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tx.commit();
		session.close();
		return parte1;
	}

	 private void separaDatos(String link) throws FileNotFoundException {
		 List<Data> dataList = new ArrayList<Data>();
		 LineNumberReader r = new LineNumberReader(new FileReader(link));
		 try {
				String line = r.readLine();
				while(line != null){
					String[] dataArray = line.split(",");
					for(String record:dataArray){
						String[] elements = record.split("\\|");
						Data data = new Data(elements);
						dataList.add(data);
					}
					line = r.readLine();
				}
				r.close();
				XStream xtream = new XStream(new StaxDriver());
				xtream.alias("data", Data.class);
				xtream.toXML(dataList,System.out);
				Transformer transformer = null;
				try {
					transformer = TransformerFactory.newInstance().newTransformer();
				} catch (TransformerConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TransformerFactoryConfigurationError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	for(int i=0 ;i <= dataList.size();i++){
		baseDeDatos(dataList.get(i));
	}
				
				
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	private DatosPersona baseDeDatos(Data data) {
		DatosPersona prueba2 = new DatosPersona();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		 char c = 0;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		     c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		prueba2.setId(sb.append(c).toString());
		prueba2.setIdConfiguracion("gK6CX");
		prueba2.setNombre(data.nombre);
		prueba2.setApellidoPaterno(data.apellido);
		prueba2.setApellidoMaterno("ss");
		prueba2.setCelular("5516405341");
		prueba2.setCorreo("addielhp21@gmail.com");
		prueba2.setIne("Addiel");
		prueba2.setTelefono("asd");
		prueba2.setRfc("HEPARW7");
		prueba2.setFechaNacimiento(new Date());
		session.save(prueba2);
		tx.commit();
		session.close();
		return prueba2;
		
	}

	@Override
	public boolean guardaErrorProceso(String string, String nombre) {
		TablaProceso prueba = new TablaProceso();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		 char c = 0;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		     c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		prueba.setArchivo(nombre+".txt");
		prueba.setExitoso(string);
		prueba.setFechaProceso(new Date());
		prueba.setId(sb.append(c).toString());
		prueba.setSeguro("Prueba");
		session.save(prueba);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public List<TablaProceso> list() {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<TablaProceso> lista = session.createCriteria(TablaProceso.class).list();
		tx.commit();
		session.close();
		return lista;
	}
	
	
}
