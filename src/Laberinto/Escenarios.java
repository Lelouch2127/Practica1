package Laberinto;


public class Escenarios {
	
		
	public String[][] escenario(){						//METODO PARA PROYECTAR EL MAPA EN EL JUEGO
		String [][] matriz = {							//MATRIZ DECLARADA PARA EL GRAFICO
				   {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "O", "O", "O", "O", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "O", "#", "#", "O", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "O", "#", "#", "O", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "J", "O", "O", "#", "#", "O", "O", "O", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "O", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "O", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "O", "#", "#", "O", "O", "O", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "O", "O", "O", "O", "#", "O", "O", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "O", "S", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
		            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};
		        return matriz;		
		
	}
	public int filaJ(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {					//UBICACION I EN LA MATRIZ
                if (matriz[i][j].equals("J")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    public int columna(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {				//UBICACION J EN LA MATRIZ
                if (matriz[i][j].equals("J")) {
                    fila = j;
                }
            }
        }
        return fila;
    }
     int [] arreglo= new int[2];
     public int [] posS(String [][]matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[0].length; j++) {				//UBICACION DE LA PUERTA "S" EN EL MAPA
                 if (matriz[i][j].equals("S")) {
                     arreglo[0]=i;
                     arreglo[1]=j;
                 }
             }
         }
         return arreglo;
     }
}
