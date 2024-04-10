package Insertar_Eliminar_Arrays;

import java.util.*;

public class Alumno_Main {

static	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Alumno [] Alum = new Alumno[0];
		
		int opcion;
		
		do {
			System.out.println("Menu");
			System.out.println("1-Alta");
			System.out.println("2-Bajas");
			System.out.println("3-Listar");
			System.out.println("4-Fin");
			System.out.println("Selecciona una opción");
			opcion = sc.nextInt();
		
		
		switch (opcion) {
			case 1 :
				altaAlumno (Alum);
			case 2 :
				bajaAlumno (Alum);
			case 3 :
				listarAlumno (Alum);
			default:
				System.out.println("FIN");
				
		}
	} while (opcion != 4) ;
		sc.close();
	}
	
private static void altaAlumno(Alumno [] Alum) {
		Alumno alu = new Alumno();
		boolean salir = false;
	for (int i = 0; i < Alum.length && !salir; i++) {
		if (Alum[i]==null) {
			
		System.out.println("ALTA EMPLEADO");
		
		System.out.println("Introduce nombre");
		alu.setNombre(sc.next());
		
		System.out.println("Introduce edad");
		alu.setEdad(sc.nextInt());
		Alum[i] = alu;
		
		} else if (i == Alum.length-1) {
			System.out.println("");
		}
	}
}
// Pide el nombre del alumno a borrar. Lo borro almacenando null en esa posicion.
private static void bajaAlumno(Alumno [] Alum) {
	
	System.out.println("BAJA EMPLEADO");

			System.out.println("Introduce el nombre para dar de baja");
			String baja = sc.next();
			boolean encontrado = false;
			
			//Recorre el array y sale del for cuando encuentra el elmento o cuando llega al final.
			for (int i = 0; i < Alum.length && !encontrado; i++) {				
				if(Objects.nonNull(Alum) && (baja.equals(Alum[i].getNombre()))) {
					encontrado = true;
	}
}	
			if (encontrado) {
				int i = 0;
				Alum[i-1] = null; // almacena null para borrar el elemento.
			}else {
				System.out.println("No existe alumno");
			}
}	
	private static void listarAlumno(Alumno [] Alum) {
			
		for (Alumno al : Alum) {
			if(Objects.nonNull(al)) {
				System.out.println(al.getNombre());
				System.out.println(al.getEdad());
			}
		}
			
			

			
			
			
			
}			
}
