package com.prueba.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.prueba.DTO.SabanaAhorroDTO;

public class UploadController {
	
	public void registryCSV(String ruta, String codTipoCuenta) {
		//Ruta del Archivo
		String r = ruta;
		String t = null;
		String subZona = null;
		BufferedReader bf = null;
		//Instancia del DTO
		JdbcController jController = new JdbcController();
		SabanaAhorroDTO sA = new SabanaAhorroDTO();
		//Instanccia de Controlador para la inserción y manejo de las bases de datos.
		
		//Convertir de String a Date
		SimpleDateFormat convertDate = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//Dar formato de MYSQL a la fecha
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//
		//SE DEBE DAR FORMATO AL STRING VAL[4], VAL[30], VAL[32] PARA INSERTAR EN LA BASE DE DATOS.
		//
		
		//
		try {
			bf = new BufferedReader(new FileReader(r));
			String line = bf.readLine();
			//Validación, Mientras el CSV tenga lineas sigue recoriendo.
			while (line != null) {
				String[] val = line.split(",");
				t = codTipoCuenta;
				subZona = "";
				//Constructor del DTO, en caso de que la longitud de las lineas del CSV sea de 52, lo que se seteara al constructor sera esto.
				if (val.length == 52) {
					sA = new SabanaAhorroDTO(Long.parseLong(val[0]), val[1], Long.parseLong(val[2]),Long.parseLong(val[3]), val[4], Double.parseDouble(val[5]), Double.parseDouble(val[6]), Double.parseDouble(val[7]),Double.parseDouble(val[8]),Double.parseDouble(val[9]),
							Long.parseLong(val[10]),val[11], Double.parseDouble(val[12]),Double.parseDouble(val[13]),val[14],Long.parseLong(val[15]),val[16],Long.parseLong(val[17]),Long.parseLong(val[18]),val[19],val[20],Long.parseLong(val[21]),Double.parseDouble(val[22]),Double.parseDouble(val[23]),
							val[24],Long.parseLong(val[25]),val[26],Double.parseDouble(val[27]),Double.parseDouble(val[28]),Long.parseLong(val[29]),val[30],val[31],val[32],val[33],val[34],Long.parseLong(val[35]),Long.parseLong(val[36]),val[37],val[38],Long.parseLong(val[39]),Long.parseLong(val[40]),val[41],
							val[42],val[43], Long.parseLong(val[44]),Long.parseLong(val[45]),val[46],val[47],val[48],val[49],val[50],val[51],t);
					sA.toString();
					try {

						Date fechaA = convertDate.parse(sA.getFechaConstitucion());
						String fechaConsitucion = formatDate.format(fechaA);
						Date fechaB = convertDate.parse(sA.getFechaUltimaTransaccion());
						String fechaUltimaT = formatDate.format(fechaB);
						Date fechaC = convertDate.parse(sA.getFechaActiva());
						String fechaActiva = formatDate.format(fechaC);
						System.out.println(fechaConsitucion + fechaUltimaT + fechaActiva);
						
						//Insertamos datos
						jController.insertCSV(sA, fechaConsitucion, fechaUltimaT, fechaActiva);
						//
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					
				}else{
					//Si la longitud del CSV es inferior al 52, en este caso 51. Lo que hara se seteara al DTO sera esto.
					sA = new SabanaAhorroDTO(Long.parseLong(val[0]), val[1], Long.parseLong(val[2]),Long.parseLong(val[3]), val[4], Double.parseDouble(val[5]), Double.parseDouble(val[6]), Double.parseDouble(val[7]),Double.parseDouble(val[8]),Double.parseDouble(val[9]),
							Long.parseLong(val[10]),val[11], Double.parseDouble(val[12]),Double.parseDouble(val[13]),val[14],Long.parseLong(val[15]),val[16],Long.parseLong(val[17]),Long.parseLong(val[18]),val[19],val[20],Long.parseLong(val[21]),Double.parseDouble(val[22]),Double.parseDouble(val[23]),
							val[24],Long.parseLong(val[25]),val[26],Double.parseDouble(val[27]),Double.parseDouble(val[28]),Long.parseLong(val[29]),val[30],val[31],val[32],val[33],val[34],Long.parseLong(val[35]),Long.parseLong(val[36]),val[37],val[38],Long.parseLong(val[39]),Long.parseLong(val[40]),val[41],
							val[42],val[43], Long.parseLong(val[44]),Long.parseLong(val[45]),val[46],val[47],val[48],val[49],val[50],subZona,t);
					sA.toString();
					try {

						Date fechaA = convertDate.parse(sA.getFechaConstitucion());
						String fechaConsitucion = formatDate.format(fechaA);
						Date fechaB = convertDate.parse(sA.getFechaUltimaTransaccion());
						String fechaUltimaT = formatDate.format(fechaB);
						Date fechaC = convertDate.parse(sA.getFechaActiva());
						String fechaActiva = formatDate.format(fechaC);
						System.out.println(fechaConsitucion + fechaUltimaT + fechaActiva);

						//Insertamos datos
						jController.insertCSV(sA, fechaConsitucion, fechaUltimaT, fechaActiva);
						//
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				line = bf.readLine();
				t = codTipoCuenta;
				System.out.println(sA.toString());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Mensajes
		jController.mensajes();
	}

}
