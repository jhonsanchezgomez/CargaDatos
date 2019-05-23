package com.prueba.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.prueba.DTO.SabanaAhorroDTO;
import com.prueba.DTO.SaldoDTO;
import com.prueba.DTO.TransaccionDTO;
import com.prueba.connectionConfig.Conexion;

public class JdbcController {

	Connection conexion = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	private static int resultado = 0;
	private static int consultaR = 0;
	private static int consultaS = 0;
	//Inserción de los datos provenientes del CSV a la base de datos
	
	public void insertCSV(SabanaAhorroDTO datosCSV, String fechaA, String fechaB, String fechaC) {
		conexion = Conexion.conectar();
		resultado = 0;
		System.out.println("Hola");
		try {
			preparedStatement = conexion.prepareStatement("INSERT INTO tbl_sabana_ahorros (codigo_producto, codigo_cuenta, codigo_persona, tipo_persona, fecha_constitucion, saldo_capital, saldo_rendimiento, retencion, comision, capital_canje, cod_estadio_anterior, nombre_edo_anterior, rendimiento, saldo_disponible, nombre_sucursal, codigo_sucursal, numero_unidades, serie_inicial, serie_final, direccion_correspon, sucursal, telefono_persona, comision_cuenta, retencion_cuenta, nombre_persona, cod_estadio_corte, nombre_edo_corte, adicion_capital, retiro_capital, ind_desembolso, fecha_ultima_transaccion, ind_inactivo, fecha_activa, usuario_activa, condiciones_manejo, huella, gmf_unidades, ind_debito_automatico, nombre_estadio, codigo_estadio_ya, codigo_ejecutivo, nombre_ejecutivo, tipo_cuenta, estado_cliente, nui, cod_asesor_o, nombre_asesor_o, fuerza_comercial, zona_asignada, segmento, sub_segmento, sub_zona, cod_tipo_cuenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			System.out.println(datosCSV.getCodigoCuenta() + " " + fechaA);
			preparedStatement.setLong(1, datosCSV.getCodigoProducto());
			preparedStatement.setString(2, datosCSV.getCodigoCuenta());
			preparedStatement.setString(3, datosCSV.getCodigoPersona().toString());
			preparedStatement.setString(4, datosCSV.getTipoPersona().toString());
			preparedStatement.setString(5, fechaA);
			preparedStatement.setString(6, datosCSV.getSaldoCapital().toString());
			preparedStatement.setString(7, datosCSV.getSaldoRendimiento().toString());
			preparedStatement.setString(8, datosCSV.getRetencion().toString());
			preparedStatement.setString(9, datosCSV.getComision().toString());
			preparedStatement.setString(10, datosCSV.getCapitalCanje().toString());
			preparedStatement.setString(11, datosCSV.getCodEstadioAnterior().toString());
			preparedStatement.setString(12, datosCSV.getNombreEdoAnterior());
			preparedStatement.setString(13, datosCSV.getRendimiento().toString());
			preparedStatement.setString(14, datosCSV.getSaldoDisponible().toString());
			preparedStatement.setString(15, datosCSV.getNombreSucursal());
			preparedStatement.setString(16, datosCSV.getCodigoSucursal().toString());
			preparedStatement.setString(17, datosCSV.getNumeroUnidades());
			preparedStatement.setString(18, datosCSV.getSerieInicial().toString());
			preparedStatement.setString(19, datosCSV.getSerieFinal().toString());
			preparedStatement.setString(20, datosCSV.getDireccionCorrespon());
			preparedStatement.setString(21, datosCSV.getSucursal());
			preparedStatement.setString(22, datosCSV.getTelefonoPersona().toString());
			preparedStatement.setString(23, datosCSV.getComisionCuenta().toString());
			preparedStatement.setString(24, datosCSV.getRetencionCuenta().toString());
			preparedStatement.setString(25, datosCSV.getNombrePersona());
			preparedStatement.setString(26, datosCSV.getCodEstadioCorte().toString());
			preparedStatement.setString(27, datosCSV.getNombreEdoCorte());
			preparedStatement.setString(28, datosCSV.getAdicionCapital().toString());
			preparedStatement.setString(29, datosCSV.getRetiroCapital().toString());
			preparedStatement.setString(30, datosCSV.getIndDesembolso().toString());
			preparedStatement.setString(31, fechaB);
			preparedStatement.setString(32, datosCSV.getIndInactivo());
			preparedStatement.setString(33, fechaC);
			preparedStatement.setString(34, datosCSV.getUsuarioActiva());
			preparedStatement.setString(35, datosCSV.getCondicionesManejo());
			preparedStatement.setString(36, datosCSV.getHuella().toString());
			preparedStatement.setString(37, datosCSV.getGmfUnidades().toString());
			preparedStatement.setString(38, datosCSV.getIndDebitoAutomatico().toString());
			preparedStatement.setString(39, datosCSV.getNombreEstadio());
			preparedStatement.setString(40, datosCSV.getCodigoEstadioYa().toString());
			preparedStatement.setString(41, datosCSV.getCodigoEjecutivo().toString());
			preparedStatement.setString(42, datosCSV.getNombreEjecutivo().toString());
			preparedStatement.setString(43, datosCSV.getTipoCuenta());
			preparedStatement.setString(44, datosCSV.getEstadoCliente());
			preparedStatement.setString(45, datosCSV.getNui().toString());
			preparedStatement.setString(46, datosCSV.getCodAsesorO().toString());
			preparedStatement.setString(47, datosCSV.getNombreAsesorO().toString());
			preparedStatement.setString(48, datosCSV.getFuerzaComercial());
			preparedStatement.setString(49, datosCSV.getZonaAsignada());
			preparedStatement.setString(50, datosCSV.getSegmento());
			preparedStatement.setString(51, datosCSV.getSubSegmento());
			preparedStatement.setString(52, datosCSV.getSubZona());
			preparedStatement.setString(53, datosCSV.getCodTipoCuenta());
			
			resultado = preparedStatement.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mensajes() {
		if (resultado > 0) {
			JOptionPane.showMessageDialog(null, "Registro del CSV correcto");
			System.out.println("Hola Si");
		}else {
			JOptionPane.showMessageDialog(null, "Error al registrar CSV");
		}
	}

	//Pasa si el resultado fue correcto o de lo contrario se fallo en la carga de datos
	public static int getResultado() {
		return resultado;
	}
	
	//Consulta de la tabla de transacción para generar el CSV de dicha tabla.
	
	public void consultaTransaccion(String ruta) {
		List<TransaccionDTO> listaT = new ArrayList<>();
		conexion = Conexion.conectar();
		TransaccionDTO tDTO;
		ExportController eController = new ExportController();
		try {
			preparedStatement = conexion.prepareStatement("SELECT id_transaccion, codigo_cuenta, no_documento, tipo_producto, operacion, valor_disponible, valor_debitado, valor_acreditado, saldo_total, forma_pago, fecha_transaccion, canje FROM tbl_transacciones");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				consultaR = 1;
				tDTO = new TransaccionDTO();
				tDTO.setIdTransaccion(Long.parseLong(resultSet.getString("id_transaccion")));
				tDTO.setCodigoCuenta(resultSet.getString("codigo_cuenta"));
				tDTO.setNumeroDocumento(Long.parseLong(resultSet.getString("no_documento")));
				tDTO.setTipoProducto(resultSet.getString("tipo_producto"));
				tDTO.setOperacion(resultSet.getString("operacion"));
				tDTO.setValorDisponible(Double.parseDouble(resultSet.getString("valor_disponible")));
				tDTO.setValorDebitado(Double.parseDouble(resultSet.getString("valor_debitado")));
				tDTO.setValorACredito(Double.parseDouble(resultSet.getString("valor_acreditado")));
				tDTO.setSaldoTotal(Double.parseDouble(resultSet.getString("saldo_total")));
				tDTO.setFormaPago(resultSet.getString("forma_pago"));
				tDTO.setFechaTransaccion(resultSet.getString("fecha_transaccion"));
				tDTO.setCanje(Double.parseDouble(resultSet.getString("canje")));
				listaT.add(tDTO);
			}
			eController.generateTransaccionCSV(listaT, ruta);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Se manda el tDTO que contiene la consulta para generar el CSV
	}
	
	public void consultaSaldo(String ruta) {
		List<SaldoDTO> listaSaldo = new ArrayList<SaldoDTO>(); 
		SaldoDTO sDTO;
		conexion = Conexion.conectar();
		ExportController eController = new ExportController();
		try {
			preparedStatement = conexion.prepareStatement("SELECT codigo_producto, codigo_cuenta, no_documento, tipo_producto, saldo, canje FROM tbl_saldos");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				consultaS = 1;
				sDTO = new SaldoDTO();
				sDTO.setCodigoProducto(Long.parseLong(resultSet.getString("codigo_producto")));
				sDTO.setCodigoCuenta(resultSet.getString("codigo_cuenta"));
				sDTO.setNumeroDocumento(Long.parseLong(resultSet.getString("no_documento")));
				sDTO.setTipoProducto(resultSet.getString("tipo_producto"));
				sDTO.setSaldo(Double.parseDouble(resultSet.getString("saldo")));
				sDTO.setCanje(Double.parseDouble(resultSet.getString("canje")));
				listaSaldo.add(sDTO);
			}
			eController.generateSaldoCSV(listaSaldo, ruta);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Pasa los valores que tiene sDTO para generar el CSV de saldos
	}
	
	public void MensajesConsulta() {
		if (consultaR > 0) {
			JOptionPane.showMessageDialog(null, "CSV de la tabla transacción generado Correctamente");
		}else if (consultaS > 0) {
			JOptionPane.showMessageDialog(null, "CSV de la tabla Saldo generado Correctamente");
		}else{
			JOptionPane.showMessageDialog(null, "Error al generar CSV");
		}
	}
	
	

}
