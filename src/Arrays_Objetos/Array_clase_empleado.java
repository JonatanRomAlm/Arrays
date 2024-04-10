package Arrays_Objetos;

import java.util.*;

public class Array_clase_empleado {
	
	// se declara static para poder utilizarlo en toda la clase.
	static	Scanner  sc = new Scanner(System.in);
	static int i = 0;
	
	public static void main(String[] args) {

	
	
	 Empleado[] empleados = new Empleado[5];
	

     int opcion;

     do {
         System.out.println("Menú:");
         System.out.println("1. ALTA");
         System.out.println("2. CONSULTA");
         System.out.println("3. SALIR");
         System.out.print("Selecciona una opción: ");
         opcion = sc.nextInt();

         switch (opcion) {
             case 1:
                 altaEmpleado(empleados);                 
                 break;
             case 2:
                 consultaEmpleados(empleados);
                 break;
             case 3:
                 System.out.println("Saliendo del programa...");
                 break;
             default:
                 System.out.println("Opción no válida. Inténtalo de nuevo.");
         }

     } while (opcion != 3);
     sc.close();
 }

 private static void altaEmpleado(Empleado[] empleados) {
     
         if (i < empleados.length) {
             
             System.out.println("ALTA DE EMPLEADO");
             System.out.print("DNI: ");
             String dni = sc.next();
             
             System.out.print("Nombre: ");
             String nombre = sc.next();
             
             System.out.print("Apellido: ");
             String apellido = sc.next();
             
             System.out.print("Sueldo: ");
             double sueldo = sc.nextDouble();

             empleados[i] = new Empleado(dni, nombre, apellido, sueldo);
             i++;
             System.out.println("Empleado dado de alta correctamente.");
             
         }else {
     
        	 System.out.println("No hay espacio para más empleados.");
      } 
 }

 private static void consultaEmpleados(Empleado[] empleados) {
	 
     System.out.println("Consulta de Empleados:");
     
     for (Empleado empleado : empleados) {
         //if (empleado != null) {
    	  if (!Objects.isNull(empleados)) {// con objects se comprueba si es nulo o no. en este caso se comprueba si no es nulo
    		  
             System.out.println("DNI: " + empleado.getDni());
             System.out.println("Nombre: " + empleado.getNombre());
             System.out.println("Apellido: " + empleado.getApellido());
             System.out.println("Sueldo: " + empleado.getSueldo()
            		 );
             System.out.println("------------------------");
             
         }
         
     }
     
 }
}
