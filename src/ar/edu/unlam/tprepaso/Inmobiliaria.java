package ar.edu.unlam.tprepaso;

public class Inmobiliaria {

	private String nombre;
	private String direccion;
	private String eMail;
	private String telefono;
	private Casa casas[];
	private Departamento departamentos[];
	private PH phs[];
	private Terreno terrenos[];
	private Campo campos[];
	private Cliente clientes[];
	private final Integer CANTIDAD_MAXIMA_DE_PROPIEDADES = 100;

	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.casas = new Casa[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.departamentos = new Departamento[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.phs = new PH[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.terrenos = new Terreno[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.campos = new Campo[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.clientes = new Cliente[CANTIDAD_MAXIMA_DE_PROPIEDADES];
	}

	public Boolean agregar(Casa nuevaCasa) {
		for (int i = 0; i < casas.length; i++) {
			if (casas[i] == null) {
				casas[i] = nuevaCasa;
				return true;
			}
		}
		return false;
	}

	public Boolean agregar(Departamento nuevoDepartamento) {
		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] == null) {
				departamentos[i] = nuevoDepartamento;
				return true;
			}
		}
		return false;
	}

	public Boolean agregar(PH nuevoPh) {
		for (int i = 0; i < phs.length; i++) {
			if (phs[i] == null) {
				phs[i] = nuevoPh;
				return true;
			}
		}
		return false;
	}

	public Boolean agregar(Terreno nuevoTerreno) {
		for (int i = 0; i < terrenos.length; i++) {
			if (terrenos[i] == null) {
				terrenos[i] = nuevoTerreno;
				return true;
			}
		}
		return false;
	}

	public Boolean agregar(Campo nuevoCampo) {
		for (int i = 0; i < campos.length; i++) {
			if (campos[i] == null) {
				campos[i] = nuevoCampo;
				return true;
			}
		}
		return false;
	}

	public Integer existe(Integer id) {
		for (int i = 0; i < casas.length; i++) {
			if (casas[i].getId().equals(id) && casas[i] != null) {
				return i;
			}
		}
		return null;
	}

	public Boolean modificar(String calle, Integer id){
		Integer posicion=existe(id);
		if(posicion==null) {
			return false;
		} else casas[posicion].setCalle(calle);
		return true;
	} //REPLICAR ESTO PARA CADA DATO Y CADA TIPO DE INMUEBLE

	public Boolean agregar(Cliente nuevoCliente) {
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i]==null&&existecliente(nuevoCliente.getDni())==false) {
				clientes[i]= nuevoCliente;
				return true;
			}
		}
		return false;
	}
	
	public Boolean existecliente(Integer dni) {
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i].getDni().equals(dni) && clientes[i] != null) {
				return true;
			}
		}
		return false;
	}
	
	public Casa[] ordenarPorPrecio(Casa casas[]) {
        Casa aux = null;
        for (int i = 0; i < casas.length; i++) {
            for (int j = 0; j < casas.length - 1; j++) {
                if (casas[j] != null && casas[j + 1] != null
                        && casas[j].getPrecio() > casas[j + 1].getPrecio()) {
                    aux = casas[j];
                    casas[j] = casas[j + 1];
                    casas[j + 1] = aux;
                }
            }
        }
        return casas;
    }//REPLICAR PARA DEPTO PH ETC
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
