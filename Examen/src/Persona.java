
/**
 * @author LinetteJuarez
 */
public class Persona {
	private String nombre="";
	private float altura=0;
	private short edad=0;
	
	//Se agrega constructor por defecto para generar objetos con propiedades default
	public Persona() {
		
	}
	
	public Persona(String nombre, float altura, short edad) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
	}
	
	public String getNombre() {
		nombre="Sr. " + nombre;
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public short getEdad() {
		return edad;
	}
	public void setEdad(short edad) {
		this.edad = edad;
	}
	
	public void mostrarNombre() {
		System.out.println(this.nombre);
	}

}
