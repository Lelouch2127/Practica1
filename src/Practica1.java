import java.util.Scanner;		//LIBRERIA PARA ESCANER

public class Practica1 {

	public static void main(String[] args) {
		
		Mapa esce = new Mapa();			//LLAMA A LA CLASE ESCENARIOS Y CREA UNA VARIABLE DE TIPO ESCENARIOS
		Metodos metodo = new Metodos();				//LLAMA A LA CLASE METODO Y CREA UNA VARIABLE DE ESTE TIPO PARA PODER UTILIZAR SUS FUNCIONES
		
		Scanner lector = new Scanner(System.in); 	//CREA UNA VARIABLE TIPO ESCANER PARA EL INGRESO DE DATOS
		int opc;					//DECLARACION DE VARIABLES
		int mod=0;
		
		do {
			System.out.println("==========================");		
            System.out.println(" * ESCAPE DEL LABERINTO * ");
            System.out.println("==========================");
            System.out.println("¡BIENVENIDO! ");
            System.out.println("SELECCIONE LA OPCION QUE DESEE: ");		//MENU PRINCIPAL
            System.out.println("1.- INGRESAR");
            System.out.println("2.- SALIR ");
            System.out.print("opcion -->");
            opc = lector.nextInt();		//LECTOR DE OPCIONES
            if (opc != 2) {
                System.out.println("1.- INICIAR LABERINTO 1");		//SUB MENU
                System.out.println("2.- SALIR");
                mod = lector.nextInt();		//LECTOR DE OPCIONES
            }

            switch (opc) {
                case 1:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenario(), esce.filaJ(esce.escenario()), esce.columna(esce.escenario()));  //SELECCION DE PRIMER CASO PARA LA EJECUCION DEL JUEGO
                    }
                    break;
                case 2:
                    System.out.println("ADIOS...");		//SELECCION DE OPCION SALIR
                    break;
                    
                default:
                    System.out.println("Opcion no valida");	
            }
		}while(opc!=2);		
	
		
	}

}



