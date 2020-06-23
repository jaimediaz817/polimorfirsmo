/**
 * 
 */
package fabrica;

import java.util.ArrayList;
import java.util.Iterator;

import negocio.ASeleccionFutbol;
import negocio.Entrenador;
import negocio.Futbolista;
import negocio.IComportamientoSeleccion;
import negocio.PreparadorFisico;

/**
 * @author USUARIO
 *
 */
public class FabricaMain {

	// tipo de array específico para Java:
	public static ArrayList<ASeleccionFutbol> integrantes = 
			new ArrayList<ASeleccionFutbol>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("********************************");
		
		// tipo por inclusión:
		ASeleccionFutbol guardiola = new Entrenador(1, "Guardiola", "apellidos", 45); 
		ASeleccionFutbol iniesta   = new Futbolista(1, "Andres", "Iniesta", 39);
		ASeleccionFutbol diesan    = new PreparadorFisico(1, "Diesan", "Romero", 30);
		
		// a partir de la estructura de datos definida, voy a agregar los objetos 
		// creados.		
		integrantes.add(guardiola);
		integrantes.add(iniesta);
		integrantes.add(diesan);
		
		// for(int i=0; i< cantidad; i++) {}		
		for (ASeleccionFutbol integrante: integrantes) 
		{			
			integrante.entrenar();
			System.out.println("\n" + integrante);
		}
		
		System.out.println("********************************");		
	}
}
