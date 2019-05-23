package com.prueba.controller;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.swing.JOptionPane;

import com.prueba.DTO.SaldoDTO;
import com.prueba.DTO.TransaccionDTO;

public class ExportController {
	
	JdbcController jc = new JdbcController();
	
	public void exportFileCSV(Object selectTable, String ruta) {
		if (selectTable.equals(1)) {
			//TRANSACCIÓN
			jc.consultaTransaccion(ruta);
		}else {
			jc.consultaSaldo(ruta);
		}

		
	}
	
	//Genera el CSV de transacción
	public void generateTransaccionCSV(List<TransaccionDTO> listaT, String ruta) {
		try {
			System.out.println(listaT.size());
			FileWriter csv = new FileWriter(new File(ruta+"/transaccion.csv"));
			
			for (int i = 0; i < listaT.size(); i++) {
				csv.write(listaT.get(i).getIdTransaccion().toString()+",");
				csv.write(listaT.get(i).getCodigoCuenta()+",");
				csv.write(listaT.get(i).getNumeroDocumento()+",");
				csv.write(listaT.get(i).getTipoProducto()+",");
				csv.write(listaT.get(i).getOperacion()+",");
				csv.write(listaT.get(i).getValorDisponible()+",");
				csv.write(listaT.get(i).getValorDebitado()+",");
				csv.write(listaT.get(i).getValorACredito()+",");
				csv.write(listaT.get(i).getSaldoTotal()+",");
				csv.write(listaT.get(i).getFormaPago()+",");
				csv.write(listaT.get(i).getFechaTransaccion()+",");
				csv.write(listaT.get(i).getCanje().toString());
				csv.write("\n");
			}
			jc.MensajesConsulta();
			csv.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fallo al generar el CSV");
		}
	}
	
	//Genera el CSV del Saldo CSV
	public void generateSaldoCSV(List<SaldoDTO> saldosDTO, String ruta) {
		try {
			System.out.println(saldosDTO.size());
			FileWriter csv = new FileWriter(new File(ruta+"/saldo.csv"));
			
			for (int i = 0; i < saldosDTO.size(); i++) {
				csv.write(saldosDTO.get(i).getCodigoProducto().toString()+",");
				csv.write(saldosDTO.get(i).getCodigoCuenta()+",");
				csv.write(saldosDTO.get(i).getNumeroDocumento().toString()+",");
				csv.write(saldosDTO.get(i).getTipoProducto().toString()+",");
				csv.write(saldosDTO.get(i).getSaldo().toString()+",");
				csv.write(saldosDTO.get(i).getCanje().toString());
				csv.write("\n");
			}
			jc.MensajesConsulta();
			csv.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fallo al generar el CSV");
		}
	}

}
