package ejercicios_recursividad;

public class Ejer1_recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		//guardamos el resultado en una variable
		int resultado=sumaRecursiva(n);
		//mostramos resultado
		System.out.println(resultado);
	
	}

	public static int sumaRecursiva(int numero) {
		int res;
		
		if (numero==1) {
			//se termina la recursión
			return 1;
		} else {
			//se llama a sí misma la función con el parámetro número menos 1
			res = numero+sumaRecursiva(numero-1);
		}
		//devuelve el resultado
		return res;
	}
	
}
