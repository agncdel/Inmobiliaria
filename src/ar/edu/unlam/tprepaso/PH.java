package ar.edu.unlam.tprepaso;

public class PH {
	private String calle;
	private Integer numero;
	private Integer piso;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private TipoDeOperacion tipo;
	
	public PH(String calle, Integer numero, Integer piso, String ciudad, Double precio,
			Boolean estaDisponible, TipoDeOperacion tipo) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.tipo = tipo;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(Boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	public TipoDeOperacion getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeOperacion tipo) {
		this.tipo = tipo;
	}
}
