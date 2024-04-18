package ar.edu.unlam.tprepaso;

public class Campo {
	private String calle;
	private Integer numero;
	private Integer metrosCuadrados;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private TipoDeOperacion tipo;
	
	public Campo(String calle, Integer numero, Integer metrosCuadrados, String ciudad, Double precio,
			Boolean estaDisponible, TipoDeOperacion tipo) {
		this.calle = calle;
		this.numero = numero;
		this.metrosCuadrados = metrosCuadrados;
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

	public Integer getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(Integer metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
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
