/**
 * 
 */
package negocio;

/**
 * @author USUARIO
 *
 */
public class PreparadorFisico extends ASeleccionFutbol {

	/**
	 * @param id
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 */
	public PreparadorFisico(int id, String nombres, String apellidos, int edad) {
		super(id, nombres, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 */
	public PreparadorFisico(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Nombre: " + this.getNombres() + " - " + this.getApellidos();
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("Entrenamiento del preparador físico, lecturas :: ENTRENADOR");
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}	
}
