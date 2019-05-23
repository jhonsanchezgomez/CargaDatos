package com.prueba.DTO;


/**
 * The persistent class for the tbl_sabana_ahorros database table.
 * 
 */

public class SabanaAhorroDTO {
	//1
	private Long codigoProducto;
	//2
	private String codigoCuenta;
	//3
	private Long codigoPersona;
	//4
	private Long tipoPersona;
	//5
	private String fechaConstitucion;
	//6
	private Double saldoCapital;
	//7
	private Double saldoRendimiento;
	
	private Double retencion;

	private Double comision;
	
	private Double capitalCanje;
	
	private Long codEstadioAnterior;
	
	private String nombreEdoAnterior;
	
	private Double rendimiento;
	
	private Double saldoDisponible;
	
	//15
	private String nombreSucursal;
	
	//16
	private Long codigoSucursal;
	
	//17
	private String numeroUnidades;
	
	private Long serieInicial;
	
	//19
	private Long serieFinal;
	
	
	private String direccionCorrespon;
	
	private String sucursal;
	
	private Long telefonoPersona;
	
	private Double comisionCuenta;
	
	//24
	private Double retencionCuenta;
	
	
	private String nombrePersona;
	
	
	private Long codEstadioCorte;
	
	//27
	private String nombreEdoCorte;
	
	
	private Double adicionCapital;
	
	
	private Double retiroCapital;
	
	
	private Long indDesembolso;
	
	//31
	private String fechaUltimaTransaccion;
	
	private String indInactivo;
	
	
	private String fechaActiva;
	
	private String usuarioActiva;
	
	private String condicionesManejo;
	//36
	private Long huella;
	//37
	private Long gmfUnidades;
	//38
	private String indDebitoAutomatico;
	//39
	private String nombreEstadio;
	//40
	private Long codigoEstadioYa;
	//41
	private Long codigoEjecutivo;
	
	//42
	private String nombreEjecutivo;
	//43
	private String tipoCuenta;
	//44
	private String estadoCliente;
	//45
	private Long nui;
	//46
	private Long codAsesorO;
	//47
	private String nombreAsesorO;
	//48
	private String fuerzaComercial;
	//49
	private String zonaAsignada;
	//50
	private String segmento;
	//51
	private String subSegmento;
	
	//-----------------------------------
	private String subZona;
	
	private String codTipoCuenta;
	
//	private String subZona;
//	private String codTipoCuenta;
	
	

	public SabanaAhorroDTO(Long codigoProducto, String codigoCuenta, Long codigoPersona, Long tipoPersona, String fechaConstitucion,
			Double saldoCapital, Double saldoRendimiento, Double retencion, Double comision, Double capitalCanje, Long codEstadioAnterior,
			String nombreEdoAnterior, Double rendimiento, Double saldoDisponible, String nombreSucursal, Long codigoSucursal,
			String numeroUnidades, Long serieInicial, Long serieFinal, String direccionCorrespon, String sucursal, Long telefonoPersona,
			Double comisionCuenta, Double retencionCuenta, String nombrePersona, Long codEstadioCorte, String nombreEdoCorte, Double adicionCapital,
			Double retiroCapital, Long indDesembolso, String fechaUltimaTransaccion, String indInactivo, String fechaActiva,
			String usuarioActiva, String condicionesManejo, Long huella, Long gmfUnidades, String indDebitoAutomatico,
			String nombreEstadio, Long codigoEstadioYa, Long codigoEjecutivo, String nombreEjecutivo, String tipoCuenta, String estadoCliente, Long nui, Long codAsesorO, String nombreAsesorO,
			String fuerzaComercial, String zonaAsignada, String segmento, String subSegmento, String subZona,String codTipoCuenta) {
		this.codigoProducto = codigoProducto;
		this.codigoCuenta = codigoCuenta;
		this.codigoPersona = codigoPersona;
		this.tipoPersona = tipoPersona;
		this.fechaConstitucion = fechaConstitucion;
		this.saldoCapital = saldoCapital;
		this.saldoRendimiento = saldoRendimiento;
		this.retencion = retencion;
		this.comision = comision;
		this.capitalCanje = capitalCanje;
		this.codEstadioAnterior = codEstadioAnterior;
		this.nombreEdoAnterior = nombreEdoAnterior;
		this.rendimiento = rendimiento;
		this.saldoDisponible = saldoDisponible;
		this.nombreSucursal = nombreSucursal;
		this.codigoSucursal = codigoSucursal;
		this.numeroUnidades = numeroUnidades;
		this.serieInicial = serieInicial;
		this.serieFinal = serieFinal;
		this.direccionCorrespon = direccionCorrespon;
		this.sucursal = sucursal;
		this.telefonoPersona = telefonoPersona;
		this.comisionCuenta = comisionCuenta;
		this.retencionCuenta = retencionCuenta;
		this.nombrePersona = nombrePersona;
		this.codEstadioCorte = codEstadioCorte;
		this.nombreEdoCorte = nombreEdoCorte;
		this.adicionCapital = adicionCapital;
		this.retiroCapital = retiroCapital;
		this.indDesembolso = indDesembolso;
		this.fechaUltimaTransaccion = fechaUltimaTransaccion;
		this.indInactivo = indInactivo;
		this.fechaActiva = fechaActiva;
		this.usuarioActiva = usuarioActiva;
		this.condicionesManejo = condicionesManejo;
		this.huella = huella;
		this.gmfUnidades = gmfUnidades;
		this.indDebitoAutomatico = indDebitoAutomatico;
		this.nombreEstadio = nombreEstadio;
		this.codigoEstadioYa = codigoEstadioYa;
		this.codigoEjecutivo = codigoEjecutivo;
		this.nombreEjecutivo = nombreEjecutivo;
		this.tipoCuenta = tipoCuenta;
		this.estadoCliente = estadoCliente;
		this.nui = nui;
		this.codAsesorO = codAsesorO;
		this.nombreAsesorO = nombreAsesorO;
		this.fuerzaComercial = fuerzaComercial;
		this.zonaAsignada = zonaAsignada;
		this.segmento = segmento;
		this.subSegmento = subSegmento;
		this.subZona = subZona;
		this.codTipoCuenta = codTipoCuenta;
	}
	
	public SabanaAhorroDTO() {
	super();
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

	public Long getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(Long codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public Long getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(Long tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(String fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	public Double getSaldoCapital() {
		return saldoCapital;
	}

	public void setSaldoCapital(Double saldoCapital) {
		this.saldoCapital = saldoCapital;
	}

	public Double getSaldoRendimiento() {
		return saldoRendimiento;
	}

	public void setSaldoRendimiento(Double saldoRendimiento) {
		this.saldoRendimiento = saldoRendimiento;
	}

	public Double getRetencion() {
		return retencion;
	}

	public void setRetencion(Double retencion) {
		this.retencion = retencion;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Double getCapitalCanje() {
		return capitalCanje;
	}

	public void setCapitalCanje(Double capitalCanje) {
		this.capitalCanje = capitalCanje;
	}

	public Long getCodEstadioAnterior() {
		return codEstadioAnterior;
	}

	public void setCodEstadioAnterior(Long codEstadioAnterior) {
		this.codEstadioAnterior = codEstadioAnterior;
	}

	public String getNombreEdoAnterior() {
		return nombreEdoAnterior;
	}

	public void setNombreEdoAnterior(String nombreEdoAnterior) {
		this.nombreEdoAnterior = nombreEdoAnterior;
	}

	public Double getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Double rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public Long getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(Long codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getNumeroUnidades() {
		return numeroUnidades;
	}

	public void setNumeroUnidades(String numeroUnidades) {
		this.numeroUnidades = numeroUnidades;
	}

	public Long getSerieInicial() {
		return serieInicial;
	}

	public void setSerieInicial(Long serieInicial) {
		this.serieInicial = serieInicial;
	}

	public Long getSerieFinal() {
		return serieFinal;
	}

	public void setSerieFinal(Long serieFinal) {
		this.serieFinal = serieFinal;
	}

	public String getDireccionCorrespon() {
		return direccionCorrespon;
	}

	public void setDireccionCorrespon(String direccionCorrespon) {
		this.direccionCorrespon = direccionCorrespon;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Long getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Long telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public Double getComisionCuenta() {
		return comisionCuenta;
	}

	public void setComisionCuenta(Double comisionCuenta) {
		this.comisionCuenta = comisionCuenta;
	}

	public Double getRetencionCuenta() {
		return retencionCuenta;
	}

	public void setRetencionCuenta(Double retencionCuenta) {
		this.retencionCuenta = retencionCuenta;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Long getCodEstadioCorte() {
		return codEstadioCorte;
	}

	public void setCodEstadioCorte(Long codEstadioCorte) {
		this.codEstadioCorte = codEstadioCorte;
	}

	public String getNombreEdoCorte() {
		return nombreEdoCorte;
	}

	public void setNombreEdoCorte(String nombreEdoCorte) {
		this.nombreEdoCorte = nombreEdoCorte;
	}

	public Double getAdicionCapital() {
		return adicionCapital;
	}

	public void setAdicionCapital(Double adicionCapital) {
		this.adicionCapital = adicionCapital;
	}

	public Double getRetiroCapital() {
		return retiroCapital;
	}

	public void setRetiroCapital(Double retiroCapital) {
		this.retiroCapital = retiroCapital;
	}

	public Long getIndDesembolso() {
		return indDesembolso;
	}

	public void setIndDesembolso(Long indDesembolso) {
		this.indDesembolso = indDesembolso;
	}

	public String getFechaUltimaTransaccion() {
		return fechaUltimaTransaccion;
	}

	public void setFechaUltimaTransaccion(String fechaUltimaTransaccion) {
		this.fechaUltimaTransaccion = fechaUltimaTransaccion;
	}

	public String getIndInactivo() {
		return indInactivo;
	}

	public void setIndInactivo(String indInactivo) {
		this.indInactivo = indInactivo;
	}

	public String getFechaActiva() {
		return fechaActiva;
	}

	public void setFechaActiva(String fechaActiva) {
		this.fechaActiva = fechaActiva;
	}

	public String getUsuarioActiva() {
		return usuarioActiva;
	}

	public void setUsuarioActiva(String usuarioActiva) {
		this.usuarioActiva = usuarioActiva;
	}

	public String getCondicionesManejo() {
		return condicionesManejo;
	}

	public void setCondicionesManejo(String condicionesManejo) {
		this.condicionesManejo = condicionesManejo;
	}

	public Long getHuella() {
		return huella;
	}

	public void setHuella(Long huella) {
		this.huella = huella;
	}

	public Long getGmfUnidades() {
		return gmfUnidades;
	}

	public void setGmfUnidades(Long gmfUnidades) {
		this.gmfUnidades = gmfUnidades;
	}

	public String getIndDebitoAutomatico() {
		return indDebitoAutomatico;
	}

	public void setIndDebitoAutomatico(String indDebitoAutomatico) {
		this.indDebitoAutomatico = indDebitoAutomatico;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public Long getCodigoEstadioYa() {
		return codigoEstadioYa;
	}

	public void setCodigoEstadioYa(Long codigoEstadioYa) {
		this.codigoEstadioYa = codigoEstadioYa;
	}

	public Long getCodigoEjecutivo() {
		return codigoEjecutivo;
	}

	public void setCodigoEjecutivo(Long codigoEjecutivo) {
		this.codigoEjecutivo = codigoEjecutivo;
	}

	public String getNombreEjecutivo() {
		return nombreEjecutivo;
	}

	public void setNombreEjecutivo(String nombreEjecutivo) {
		this.nombreEjecutivo = nombreEjecutivo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public Long getNui() {
		return nui;
	}

	public void setNui(Long nui) {
		this.nui = nui;
	}

	public Long getCodAsesorO() {
		return codAsesorO;
	}

	public void setCodAsesorO(Long codAsesorO) {
		this.codAsesorO = codAsesorO;
	}

	public String getNombreAsesorO() {
		return nombreAsesorO;
	}

	public void setNombreAsesorO(String nombreAsesorO) {
		this.nombreAsesorO = nombreAsesorO;
	}

	public String getFuerzaComercial() {
		return fuerzaComercial;
	}

	public void setFuerzaComercial(String fuerzaComercial) {
		this.fuerzaComercial = fuerzaComercial;
	}

	public String getZonaAsignada() {
		return zonaAsignada;
	}

	public void setZonaAsignada(String zonaAsignada) {
		this.zonaAsignada = zonaAsignada;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getSubSegmento() {
		return subSegmento;
	}

	public void setSubSegmento(String subSegmento) {
		this.subSegmento = subSegmento;
	}

	

	public String getSubZona() {
		return subZona;
	}

	public void setSubZona(String subZona) {
		this.subZona = subZona;
	}

	public String getCodTipoCuenta() {
		return codTipoCuenta;
	}

	public void setCodTipoCuenta(String codTipoCuenta) {
		this.codTipoCuenta = codTipoCuenta;
	}

	@Override
	public String toString() {
		return "SabanaAhorroDTO [codigoProducto=" + codigoProducto + ", codigoCuenta=" + codigoCuenta
				+ ", codigoPersona=" + codigoPersona + ", tipoPersona=" + tipoPersona + ", fechaConstitucion="
				+ fechaConstitucion + ", saldoCapital=" + saldoCapital + ", saldoRendimiento=" + saldoRendimiento
				+ ", retencion=" + retencion + ", comision=" + comision + ", capitalCanje=" + capitalCanje
				+ ", codEstadioAnterior=" + codEstadioAnterior + ", nombreEdoAnterior=" + nombreEdoAnterior
				+ ", rendimiento=" + rendimiento + ", saldoDisponible=" + saldoDisponible + ", nombreSucursal="
				+ nombreSucursal + ", codigoSucursal=" + codigoSucursal + ", numeroUnidades=" + numeroUnidades
				+ ", serieInicial=" + serieInicial + ", serieFinal=" + serieFinal + ", direccionCorrespon="
				+ direccionCorrespon + ", sucursal=" + sucursal + ", telefonoPersona=" + telefonoPersona
				+ ", comisionCuenta=" + comisionCuenta + ", retencionCuenta=" + retencionCuenta + ", nombrePersona="
				+ nombrePersona + ", codEstadioCorte=" + codEstadioCorte + ", nombreEdoCorte=" + nombreEdoCorte
				+ ", adicionCapital=" + adicionCapital + ", retiroCapital=" + retiroCapital + ", indDesembolso="
				+ indDesembolso + ", fechaUltimaTransaccion=" + fechaUltimaTransaccion + ", indInactivo=" + indInactivo
				+ ", fechaActiva=" + fechaActiva + ", usuarioActiva=" + usuarioActiva + ", condicionesManejo="
				+ condicionesManejo + ", huella=" + huella + ", gmfUnidades=" + gmfUnidades + ", indDebitoAutomatico="
				+ indDebitoAutomatico + ", nombreEstadio=" + nombreEstadio + ", codigoEstadioYa=" + codigoEstadioYa
				+ ", codigoEjecutivo=" + codigoEjecutivo + ", nombreEjecutivo=" + nombreEjecutivo + ", tipoCuenta="
				+ tipoCuenta + ", estadoCliente=" + estadoCliente + ", nui=" + nui + ", codAsesorO=" + codAsesorO
				+ ", nombreAsesorO=" + nombreAsesorO + ", fuerzaComercial=" + fuerzaComercial + ", zonaAsignada="
				+ zonaAsignada + ", segmento=" + segmento + ", subSegmento=" + subSegmento + ", subZona=" + subZona
				+ ", codTipoCuenta=" + codTipoCuenta + "]";
	}


	
	
	
	

}