package Array_Objetos;

public class Empleado {
	
	private String dni;
	private String nombre;
	private String apellido;
	private double sueldo;
	
	
	
	public Empleado() {
		super();
	}

	


	public Empleado(String dni, String nombre, String apellido, double sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public double getSueldo() {
		return sueldo;
	}




	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}




	


}
