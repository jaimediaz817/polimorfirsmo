/**
 * 
 */
package negocio;

/**
 * @author USUARIO
 *
 */
public class Futbolista extends ASeleccionFutbol {


	public Futbolista(int id, String nombres, String apellidos, int edad) {
		super(id, nombres, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy entrenando De cierta manera según mi posición :: FUTBOLISTA");
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		System.out.println("M estoy concentrando en un hotel. ::: FUTBOLISTA");
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy viajando vía aérea. :: FUTBOLISTA");
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
