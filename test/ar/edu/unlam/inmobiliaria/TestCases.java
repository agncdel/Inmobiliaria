package ar.edu.unlam.inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		Boolean valorObtenido = inmobiliaria.agregarCasa(casa);
		Boolean valorEsperado = Boolean.TRUE;
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		Casa casa2 = new Casa(2, "Santa Fe", 1425, "Morón", 85000.00, true, dueño);
		Boolean valorCasa = inmobiliaria.agregarCasa(casa);
		Boolean valorCasa2 = inmobiliaria.agregarCasa(casa2);
		assertEquals(valorCasa, valorCasa2);
	}

	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		Casa casa2 = new Casa(2, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		inmobiliaria.agregarCasa(casa);
		Boolean valorObtenido = inmobiliaria.agregarCasa(casa2);
		Boolean valorEsperado = Boolean.FALSE;
		assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Departamento depto = new Departamento(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño, 'A', 2);
		Boolean valorObtenido = inmobiliaria.agregarDepto(depto);
		Boolean valorEsperado = Boolean.TRUE;
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Departamento depto = new Departamento(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño, 'A', 2);
		Departamento depto2 = new Departamento(2, "Santa Fe", 1422, "Morón", 80000.00, true, dueño, 'B', 2);
		Boolean valorDepto = inmobiliaria.agregarDepto(depto);
		Boolean valorDepto2 = inmobiliaria.agregarDepto(depto2);
		assertEquals(valorDepto, valorDepto2);
	}

	@Test
	public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Departamento depto = new Departamento(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño, 'A', 2);
		Departamento depto2 = new Departamento(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño, 'A', 2);
		inmobiliaria.agregarDepto(depto);
		Boolean valorObtenido = inmobiliaria.agregarDepto(depto2);
		Boolean valorEsperado = Boolean.FALSE;
		assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1423, "Morón", 80000.00, true, dueño);
		Casa casa2 = new Casa(2, "Santa Fe", 1424, "Morón", 120000.00, true, dueño);
		Casa casa3 = new Casa(2, "Santa Fe", 1425, "Morón", 40000.00, true, dueño);
		inmobiliaria.agregarCasa(casa);
		inmobiliaria.agregarCasa(casa2);
		inmobiliaria.agregarCasa(casa3);
		Double valorEsperado = 80000.00;
		Double promedio = inmobiliaria.promedioCasa();
		assertEquals(valorEsperado, promedio);
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamento() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Departamento depto = new Departamento(1, "Santa Fe", 1422, "Morón", 65000.00, true, dueño, 'A', 2);
		Departamento depto2 = new Departamento(2, "Santa Fe", 1423, "Morón", 75000.00, true, dueño, 'B', 2);
		Departamento depto3 = new Departamento(3, "Santa Fe", 1424, "Morón", 55000.00, true, dueño, 'C', 2);
		inmobiliaria.agregarDepto(depto);
		inmobiliaria.agregarDepto(depto2);
		inmobiliaria.agregarDepto(depto3);
		Double valorEsperado = 65000.00;
		Double promedio = inmobiliaria.promedioDepto();
		assertEquals(valorEsperado, promedio);
	}

	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNoNuloSiAplicanResultados() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1422, "Morón", 51000.00, true, dueño);
		Casa casa2 = new Casa(2, "Santa Fe", 1422, "Morón", 70000.00, true, dueño);
		Casa casa3 = new Casa(3, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		inmobiliaria.agregarCasa(casa);
		inmobiliaria.agregarCasa(casa2);
		inmobiliaria.agregarCasa(casa3);
		Double min = 50000.00;
		Double max = 75000.00;
		ArrayList<Casa> casasFiltradas = new ArrayList<Casa>();
		casasFiltradas = inmobiliaria.filtrarCasa(min, max);
		assertNotNull(casasFiltradas);
	}

	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("LAR");
		Cliente dueño = new Cliente(41137440, "Agustín");
		Casa casa = new Casa(1, "Santa Fe", 1422, "Morón", 80000.00, true, dueño);
		Casa casa2 = new Casa(2, "Santa Fe", 1423, "Morón", 81000.00, true, dueño);
		Casa casa3 = new Casa(3, "Santa Fe", 1424, "Morón", 82000.00, true, dueño);
		inmobiliaria.agregarCasa(casa);
		inmobiliaria.agregarCasa(casa2);
		inmobiliaria.agregarCasa(casa3);
		Double min = 50000.00;
		Double max = 75000.00;
		ArrayList<Casa> casasFiltradas = new ArrayList<Casa>();
		casasFiltradas = inmobiliaria.filtrarCasa(min, max);
		ArrayList<Casa> array = new ArrayList<Casa>();
		assertEquals(casasFiltradas, array);
	}
}
