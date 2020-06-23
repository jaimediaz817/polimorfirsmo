/**
 * 
 */
package negocio;

/**
 * @author USUARIO
 *
 */
public class Entrenador extends ASeleccionFutbol {

	/**
	 * @param id
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * 
	 * Entrenador entrenador = new Entrenador(1, "Jaime", "Diaz", 18);
	 */
	public Entrenador(int id, String nombres, String apellidos, int edad) {
		super(id, nombres, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * 
	 * Entrenador entrenador = new Entrenador(1);
	 */
	public Entrenador(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see negocio.IComportamientoSeleccion#entrenar()
	 */
	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("Formación técnica, lecturas, estrategias, etc. :: ENTRENADOR");
	}

	/* (non-Javadoc)
	 * @see negocio.IComportamientoSeleccion#concentrarse()
	 */
	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		System.out.println("Estoy concentrado en un hotel, pero puedo trasnochar un poco más.::: ENTRENADOR");
	}

	/* (non-Javadoc)
	 * @see negocio.IComportamientoSeleccion#viajar()
	 */
	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("Viajo junto al grupo de jugadores :: ENTRENADOR");
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombres() + " - " + this.getApellidos();
	}

	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}	
}
