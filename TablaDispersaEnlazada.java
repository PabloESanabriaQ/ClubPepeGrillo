public class TablaDispersaEnlazada {
	static final int M = 101;
	private Elemento[] tabla;
	private int numElementos;

	static final Double R = 0.6180334;

    static int dispersarClave(int clave){
        int claveSinDecimales;
        clave*= R;
        claveSinDecimales = (int) (Math.round(clave));
        clave-= claveSinDecimales;
        clave*= M;
        claveSinDecimales = (int) (Math.round(clave));
        
        return claveSinDecimales;
    }

	public TablaDispersaEnlazada() {
		tabla = new Elemento[M];
		for (int k = 0; k < M; k++) {
			tabla[k] = null;
			numElementos = 0;
		}
	}

	public void insertar(TipoSocio tipoSocio) {
		int posicion;
		Elemento nuevo;

		posicion = dispersarClave(tipoSocio.getCodigo());
		nuevo = new Elemento(tipoSocio);
		nuevo.siguiente = tabla[posicion];
		tabla[posicion] = nuevo;
		numElementos++;
	}

	boolean conforme(TipoSocio a){
		return true;
	};

public void eliminar(int codigo){
	int posicion;
	posicion = dispersarClave(codigo);
	 // no está vacía
	if (tabla[posicion] != null)
	{
		 Elemento anterior, actual;
		
		 anterior = null;
		 actual = tabla[posicion];
		 while ((actual.siguiente != null) &&
				 actual.getSocio().getCodigo() != codigo)
		 {
			 anterior = actual;
			 actual = actual.siguiente;
		 }
		 if (actual.getSocio().getCodigo() != codigo)
			 System.out.println("No se encuentra en la tabla el socio "+ codigo);
		 else if (conforme (actual.getSocio()))		 //se retira el nodo		
		 {								
			 if (anterior == null)							 // primer nodo
				 tabla[posicion] = actual.siguiente;  
    
	} else {
		anterior.siguiente = actual.siguiente;
		actual = null;
		numElementos--;
		}
	}
	}

	public Elemento buscar(int codigo) {
		Elemento p = null;
		int posicion;
		posicion = dispersarClave(codigo);
		if (tabla[posicion] != null){
		 p = tabla[posicion];
		 while ((p.siguiente != null) && p.socio.codigo != codigo)
			 p = p.siguiente;
		 if (p.socio.codigo != codigo)
			 p = null;
			}
			return p;
		}
}
