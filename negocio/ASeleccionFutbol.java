/**
 * 
 */
package negocio;

/**
 * @author JDIAZ
 * 
 * 
 * Esta clase NO se puede instanciar, ¡OJO!
 *
 */
public abstract class ASeleccionFutbol implements IComportamientoSeleccion
{
	protected int id;
	protected String nombres;
	protected String apellidos;
	protected int edad;
	
	
	/**
	 * Constructor con argumentos
	 * 
	 * @param id
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 */
	public ASeleccionFutbol(int id, String nombres, String apellidos, int edad) 
	{
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	/**
	 * 
	 * @param id
	 */
	public ASeleccionFutbol(int id) {
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Puedo al igual que las interfaces, definir métodos sin implementarse.
	 */
	public abstract void metodoAbstracto();	

}
