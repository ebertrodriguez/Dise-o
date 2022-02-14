import java.util.Scanner;

public class principal {
	
	public String nombre;
	public int edad;
	
	// CONSTRUCTORES
	
	public principal() {
		
	}

	public principal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//GETTERS - SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//METODOS

	public void imprimir () {
		System.out.println("Hola mundo");
	}
	
	public void contarNumeros() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("El numero es: " + i);
		}
	}
	
	public void recorrer () {
		int numeros [] = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i <= numeros.length; i++) {
			System.out.println("El numero es: " + i);
		}
	}
	
	public void llenarArreglo () {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		int i;
		System.out.println("Digite la cantidad de elementos");
		n = entrada.nextInt();
		
		int[] numeros = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.println("Digite el elemento " + (i+1));
			numeros[i] = entrada.nextInt();
		}
		
		for(int i1 = 0; i1 <= n; i1++) {
			System.out.println("El numero es: " + numeros[i1]);
		}
	}
}