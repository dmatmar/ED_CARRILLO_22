package ejercicios_recursividad;

public class Ejer3_recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5};
		int elementoBuscar=23;
		int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar, 0);
		System.out.println(posElementoEncontrado);
		
	}

	public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice) {
		
		if (indice==array.length || array[indice]==elementoBuscar) {
			//si no existe el elemento a buscar
			if (indice==array.length) { 
			return -1;
		}else {
			return indice;
		}
		
		}else {
			return posicionElementoRecursivo(array, elementoBuscar, indice +1);
		}
	}

}
