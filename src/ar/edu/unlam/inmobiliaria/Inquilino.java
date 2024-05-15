package ar.edu.unlam.inmobiliaria;

public class Inquilino extends Cliente {
	private Integer cantidadAlquileres;

	public Inquilino(Integer dni, String nombre, Integer cantidadAlquileres) {
		super(dni, nombre);
		this.cantidadAlquileres = cantidadAlquileres;
	}

}
