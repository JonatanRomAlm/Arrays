package Arrays_Objetos;

public class Array_Objetos {

	public static void main(String[] args) {
		
		if (args.length == 0) {
            System.out.println("Error, debes pasar al menos un nombre como argumento");
        } else {
            System.out.print("Hola ");
            for (String nombre : args) {
                System.out.print(nombre + " ");
            }
            System.out.println();
        }
    }
}