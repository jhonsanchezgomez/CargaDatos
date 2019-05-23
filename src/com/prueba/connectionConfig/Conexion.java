package com.prueba.connectionConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static String url = "jdbc:mysql://localhost:3306/db";
	private static String user = "root";
	private static String password = "";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			System.out.println("Ocurrio un error en la base de datos");
		}
		return conexion;
	}
}
