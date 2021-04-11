package Clases;
import java.util.*;


public class main {
	static Scanner leer = new Scanner(System.in);
    static int a,b;
	public static void main(String[] args) {
		
       System.out.println(potencia(5, 3));
		
	}
	static int suma(int a, int b){
        return a+b;
}
static int resta(int a, int b){
	return b;
        
}
static int muiltiplicacion(int a, int b){
	return b;
        
}
static int division(int a, int b){
     return a;   
}
static int potencia(int a, int b){
	int respuesta=1;
	for (int i = 0; i < b; i++) {
		System.out.println(respuesta);
		respuesta=respuesta*a;
	}
	return respuesta;
        
}
static int raizcuadrada(int a){
	return a;
        
}

}
