package org.servicios.proceso.metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BusquedaFichero {

	 public BufferedReader getBuffered(String link){

		    FileReader lector  = null;
		    BufferedReader br = null;
		    try {
		         File Arch=new File(link);
		        if(!Arch.exists()){
		           System.out.println("0");
		          
		        }else{
		        	  System.out.println("1");
		           lector = new FileReader(link);
		           br = new BufferedReader(lector);
//		           separaDatos(link);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return br;
		}
	
}
