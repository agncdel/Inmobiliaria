package ar.edu.unalm.inmobiliaria;

public class Inquilino extends Cliente {
	private Integer cantidadAlquileres;

	public Inquilino(Integer dni, String nombre, Integer cantidadAlquileres) {
		super(dni, nombre);
		this.cantidadAlquileres = cantidadAlquileres;
	}

}
