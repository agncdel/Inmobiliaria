package ar.edu.unlam.inmobiliaria;

public class Casa extends Propiedad {

	public Casa(Integer idCasa, String calle, Integer numero, String localidad, Double precio, Boolean estaDisponible,
			Cliente dueño) {
		super(idCasa, calle, numero, localidad, precio, estaDisponible, dueño);
	}
}
