package ar.edu.unalm.inmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	private ArrayList<Casa> casas = new ArrayList<Casa>();
	private ArrayList<Departamento> deptos = new ArrayList<Departamento>();

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarCasa(Casa casa) {
		String calle = casa.getCalle();
		Integer numero = casa.getNumero();
		String localidad = casa.getLocalidad();
		for (Casa casa1 : casas) {
			if (casa1.getCalle().equals(calle) && casa1.getNumero().equals(numero)
					&& casa1.getLocalidad().equals(localidad)) {
				return false;
			}
		}
		casas.add(casa);
		return true;
	}

	public Boolean agregarDepto(Departamento depto) {
		String calle = depto.getCalle();
		Integer numero = depto.getNumero();
		String localidad = depto.getLocalidad();
		Character departamento = depto.getDepartamento();
		Integer piso = depto.getPiso();

		for (Departamento depto1 : deptos) {
			if (depto1.getCalle().equals(calle) && depto1.getNumero().equals(numero)
					&& depto1.getLocalidad().equals(localidad) && depto1.getDepartamento().equals(departamento)
					&& depto1.getPiso().equals(piso)) {
				return false;
			}
		}
		deptos.add(depto);
		return true;
	}

	public ArrayList<Casa> filtrarCasa(Double min, Double max) {
		ArrayList<Casa> array = new ArrayList<Casa>();
		for (Casa casa : casas) {
			if (casa.getPrecio() >= min && casa.getPrecio() <= max) {
				array.add(casa);
			}
		}
		return array;
	}

	public Double promedioCasa() {
		Double total = 0.00;
		for (Casa casa : casas) {
			total += casa.getPrecio();
		}
		Double promedio = total / casas.size();
		return promedio;
	}

	public Double promedioDepto() {
		Double total = 0.00;
		for (Departamento depto : deptos) {
			total += depto.getPrecio();
		}
		Double promedio = total / deptos.size();
		return promedio;
	}

}
