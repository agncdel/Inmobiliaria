package ar.edu.unalm.inmobiliaria;

public class Departamento extends Propiedad {
	private Character departamento;
	private Integer piso;

	public Departamento(Integer idCasa, String calle, Integer numero, String localidad, Double precio,
			Boolean estaDisponible, Cliente dueño, Character departamento, Integer piso) {
		super(idCasa, calle, numero, localidad, precio, estaDisponible, dueño);
		this.departamento = departamento;
		this.piso = piso;
	}

	public Character getDepartamento() {
		return departamento;
	}

	public Integer getPiso() {
		return piso;
	}

}
