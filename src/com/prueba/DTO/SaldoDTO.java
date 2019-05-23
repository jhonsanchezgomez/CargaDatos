package com.prueba.DTO;

public class SaldoDTO {

	private Long codigoProducto;
	private String codigoCuenta;
	private Long numeroDocumento;
	private String tipoProducto;
	private Double saldo;
	private Double canje;
	
	public SaldoDTO() {
		super();
	}

	public SaldoDTO(Long codigoProducto, String codigoCuenta, Long numeroDocumento, String tipoProducto, Double saldo,
			Double canje) {
		super();
		this.codigoProducto = codigoProducto;
		this.codigoCuenta = codigoCuenta;
		this.numeroDocumento = numeroDocumento;
		this.tipoProducto = tipoProducto;
		this.saldo = saldo;
		this.canje = canje;
	}

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getCanje() {
		return canje;
	}

	public void setCanje(Double canje) {
		this.canje = canje;
	}

	@Override
	public String toString() {
		return "SaldoDTO [codigoProducto=" + codigoProducto + ", codigoCuenta=" + codigoCuenta + ", numeroDocumento="
				+ numeroDocumento + ", tipoProducto=" + tipoProducto + ", saldo=" + saldo + ", canje=" + canje + "]";
	}
	
	
	
	
}
