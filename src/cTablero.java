import java.util.Scanner;

public class cTablero {

    Scanner leer = new Scanner(System.in);

    //Variables constates
    private final int FILA = 8;    //Tamaño de la fila en el tablero
    private final int COLUMNA = 8;  //Tamaño de la columna en el tablero

    //Variables


    //Objetos
    cPortaAviones p;    //Tamaño 5
    cBuque b;           //Tamaño 4
    cSubmarino s;       //Tamaño 3
    cCrucero c;         //Tamaño 2
    cLancha l;          //Tamaño 1

    //Arays y matrices
    char[][] ocupados;   //Tablero visual que muestra la posicion de los barcos
    int[][] disparos;   //Tablero que almacena los disparos

    //Constructor de la clase Tablero
    public cTablero() {

        //Inicializacion de variables

        //Inicializacionde arrays y matrices
        ocupados = new char[FILA][COLUMNA];
        disparos = new int[FILA][COLUMNA];
    }

    //Metodo que obtiene la posicion de la fila → 1-8
    public int leerFila() {
        int posFila;
        System.out.println("Introduce la fila (1-8)");
        return posFila = leer.nextInt();
    }

    //metodo que obtiene la posicion de la columna ↓ A-H
    public char leerColumna() {
        char posColumna;
        System.out.println("Introduce la columna (A-H)");
        return posColumna = leer.nextLine().charAt(0);
    }

    public void colocaBarcos() {

    }

    public int dispara(){
        int posDisparo=0;
        return posDisparo;
    }

    //Metodo que mantendra el juego en ejecucion hasta que no queden barcos
    public void jugar(){
        do{
            int posFila = leerFila();
            char posColumna = leerColumna();
            dispara();                          //Dispara(posFila, posColumna)
        }while (false);                         //Barcos undidos = true
    }
}
