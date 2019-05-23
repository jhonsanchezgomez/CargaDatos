package com.prueba.DTO;

public class TransaccionDTO {
	
	private Long idTransaccion;
	private String codigoCuenta;
	private Long numeroDocumento;
	private String tipoProducto;
	private String operacion;
	private Double valorDisponible;
	private Double valorDebitado;
	private Double valorACredito;
	private Double saldoTotal;
	private String formaPago;
	private String fechaTransaccion;
	private Double canje;
	
	public TransaccionDTO() {
		super();
	}

	public TransaccionDTO(Long idTransaccion, String codigoCuenta, Long numeroDocumento, String tipoProducto,
			String operacion, Double valorDisponible, Double valorDebitado, Double valorACredito, Double saldoTotal,
			String formaPago, String fechaTransaccion, Double canje) {
		super();
		this.idTransaccion = idTransaccion;
		this.codigoCuenta = codigoCuenta;
		this.numeroDocumento = numeroDocumento;
		this.tipoProducto = tipoProducto;
		this.operacion = operacion;
		this.valorDisponible = valorDisponible;
		this.valorDebitado = valorDebitado;
		this.valorACredito = valorACredito;
		this.saldoTotal = saldoTotal;
		this.formaPago = formaPago;
		this.fechaTransaccion = fechaTransaccion;
		this.canje = canje;
	}

	public Long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
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

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Double getValorDisponible() {
		return valorDisponible;
	}

	public void setValorDisponible(Double valorDisponible) {
		this.valorDisponible = valorDisponible;
	}

	public Double getValorDebitado() {
		return valorDebitado;
	}

	public void setValorDebitado(Double valorDebitado) {
		this.valorDebitado = valorDebitado;
	}

	public Double getValorACredito() {
		return valorACredito;
	}

	public void setValorACredito(Double valorACredito) {
		this.valorACredito = valorACredito;
	}

	public Double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(String fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Double getCanje() {
		return canje;
	}

	public void setCanje(Double canje) {
		this.canje = canje;
	}

	@Override
	public String toString() {
		return "TransaccionDTO [idTransaccion=" + idTransaccion + ", codigoCuenta=" + codigoCuenta
				+ ", numeroDocumento=" + numeroDocumento + ", tipoProducto=" + tipoProducto + ", operacion=" + operacion
				+ ", valorDisponible=" + valorDisponible + ", valorDebitado=" + valorDebitado + ", valorACredito="
				+ valorACredito + ", saldoTotal=" + saldoTotal + ", formaPago=" + formaPago + ", fechaTransaccion="
				+ fechaTransaccion + ", canje=" + canje + "]";
	}
	
	
	
	
}
