package Array_Objetos;

public class EmpleadoMain {
	
	/*
	 * Crea la clase Empleado cuyos atributos son dni,
	nombre, apellido y sueldo. En la clase principal,
	crea un array de empleados e inicialízalo con 4
	empleados. Recórrelo para aumentar el salario
	un 5% y muestra luego el nombre de cada
	empleado con el nuevo salario
	 */

	public static void main(String[] args) {

		// Se crean los 4 objetos de empleado y se pone los atributos.
		Empleado personas1 = new Empleado ("2342", "Juan", " jj" ,3000);
		Empleado personas2 = new Empleado ("1234", "Manuel", " jj" ,4000);
		Empleado personas3 = new Empleado ("4321", "Oscar", " jj" ,5000);
		Empleado personas4 = new Empleado ("0000", "Pepe", " jj" ,6000);
		
		Empleado [] personas = {personas1,personas2,personas3,personas4};
		
		// Se crea un for para incrementar el suedo un 5%.
		for (int i = 0; i < personas.length; i++) {
			
			personas[i].setSueldo(personas[i].getSueldo()* 1.05);
		}
		
		// Se crea un array para visualizar el nombre y el sueldo.
		for (int i = 0; i < personas.length; i++) {
			
			System.out.println(" el empleado " + personas[i].getNombre()
					+ " y el sueldo " + personas[i].getSueldo());
			
		}
			
			
		}
	}


