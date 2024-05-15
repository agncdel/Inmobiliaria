package ar.edu.unlam.inmobiliaria;

public class Propietario extends Cliente {
	private Integer cantidadPropiedades;

	public Propietario(Integer dni, String nombre, Integer cantidadPropiedades) {
		super(dni, nombre);
		this.cantidadPropiedades = cantidadPropiedades;
	}

}
