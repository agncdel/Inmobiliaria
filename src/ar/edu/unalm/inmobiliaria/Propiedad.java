package ar.edu.unalm.inmobiliaria;

public class Propiedad {
	protected Integer idCasa;
	protected String calle;
	protected Integer numero;
	protected String localidad;
	protected Double precio;
	protected Boolean estaDisponible;
	protected Cliente dueño;

	public Propiedad(Integer idCasa, String calle, Integer numero, String localidad, Double precio,
			Boolean estaDisponible, Cliente dueño) {
		this.idCasa = idCasa;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.dueño = dueño;
	}

	public Integer getIdCasa() {
		return idCasa;
	}

	public String getCalle() {
		return calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}

	public Cliente getDueño() {
		return dueño;
	}
}
