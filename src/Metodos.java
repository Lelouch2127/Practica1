import java.util.Scanner;

public class Metodos {

	Scanner lector = new Scanner(System.in);
	public void Avanzar(String[][] matriz, int filas,int colum) {
		
		String labe = "S";
        int golpes = 0;
        Mapa S = new Mapa();		//LLAMADO A LA CLASE ESCENARIOS CREANDO UNA VARIABLE DE ESTE TIPO
        int []arreglo = S.posS(matriz);
        //LOGICA DE JUEGO 
        while (golpes < 5) {	//MIENTRAS LOS GOLPES SEAN MENORES A CINCO SE EJECUTA EL JUEGO											
            if (matriz[filas][colum] == matriz[arreglo[0]][arreglo[1]]) {	// SI LA "J" TIENE LA UBICACION QUE "S" IMPRIME EN PANTALLA: HAS GANADO !!		
                System.out.println("HAS GANADO !!");
                golpes += 5;
            } else {
                imprimirMatriz(matriz);			//IMPRIME JUEGO
                System.out.print("Mover -> ");		//MENSAJE PARA INGRESAR LETRA
                String cara = lector.next();		//LECTURA DE MOVIMIENTO
                //Derecha
                if (cara.equalsIgnoreCase("E")) {		//MOVIMIENTO PARA DESPLEGARSE A LA DERECHA
                    if (!matriz[filas][colum + 1].equals("#")){
                        matriz[filas][colum + 1] = "J";
                        matriz[filas][colum] = "O";
                        colum++;
                    } else {
                        golpes++;			//SI NO SE CUMPLE LA CONDICION DE MOVIMIENTO AUMENTARA UN GOLPE Y MOSTRARA EN PANTALLA LA CANTIDAD DE GOLPES QUE LLEVA
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //izquierda
                if (cara.equalsIgnoreCase("O")) {		//MOVIMIENTO PARA DESPLEGARSE A LA IZQUIERDA
                    if (!matriz[filas][colum - 1].equals("#")){
                        matriz[filas][colum - 1] = "J";
                        matriz[filas][colum] = "O";
                        colum--;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //arriba
                if (cara.equalsIgnoreCase("N")) {		//MOVIMIENTO PARA DESPLEGARSE HACIA EL NORTE
                    if (!matriz[filas - 1][colum].equals("#")){
                        matriz[filas - 1][colum] = "J";
                        matriz[filas][colum] = "O";
                        filas--;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }

                //abajo
                if (cara.equalsIgnoreCase("S")) {			//MOVIMIENTO PARA DESPLEGARSE HACIA EL SUR
                    if (!matriz[filas + 1][colum].equals("#")){
                        matriz[filas + 1][colum] = "J";
                        matriz[filas][colum] = "O";
                        filas++;
                    } else {
                        golpes++;
                        System.out.println("Has golpeado " + golpes + " de 5 con la pared ");
                    }
                }
            }
        }
    }

		public void imprimirMatriz(String[][] matriz) {			//FUNCION CON FOR ANIDADO PARA IMPRIMIR LA MATRIZ EN PANTALLA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
		
}

