package ejercicios_recursividad;

public class Ejer2_recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5}; //Creamos un array
		mostrarArrayRecursivo(array, 0); //pasamos el array y la posicion donde empieza

		
	}

	public static void mostrarArrayRecursivo(int [] array, int indice) {
		
		if (indice == array.length-1) {
			System.out.println(array[indice]);
		}else {
			System.out.println(array[indice]);
			mostrarArrayRecursivo(array, indice+1);
		}
		
	}
	

}
