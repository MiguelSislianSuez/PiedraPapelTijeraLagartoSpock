package spock;

import java.util.Scanner;

public class Juego {

	// La clase scanner nos permite leer lo que introducimos por teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//A continuación declaramos las variables del juego
		int j;
		int juego;
		String jugador; 
		String maquina;
		
		//Declaramos el Array  de 5 jugadas que vamos a utilizar
		String[] jugadas = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

                
		//haremos un bucle While 
		do {
                    
                    //Imprimimos el menú de jugadas
                    System.out.println("Introduzca jugada\n" + "0. Salir\n" + "1. Piedra\n" + 
                                			"2. Papel\n" + "3. Tijera\n" + 
                                				"4. Lagarto\n" + "5. Spock\n");
                    j = sc.nextInt();
                        
                    if (j == 0) {
                        break;
                    } 
                    
                    if (j > 5) {
                        System.out.println("Opción no valida, introduce un número del 1 al 5");
                    } else {
                        //recordar que los arrays comienza desde cero por eso se resta 1
                        jugador = jugadas[j - 1];
                        //la clase math random nos servirá para hacer la jugada aleatoria
                        maquina = jugadas [(int)(Math.random() * (4 + 1)) ];

                        //------------------*Jugador*----------------------
                        if (("Piedra" == jugador && "Tijera" == maquina)
                                || (jugador == "Papel" && maquina == "Piedra")
                                || (jugador == "Tijera" && maquina == "Papel")
                                || (jugador == "Lagarto" && maquina == "Spock")
                                || (jugador == "Spock" && maquina == "Tijera")

                                || (jugador == "Piedra" && "Lagarto" == maquina)
                                || (jugador == "Papel" && maquina == "Spock")
                                || (jugador == "Tijera" && maquina == "Lagarto")
                                || (jugador == "Lagarto" && maquina == "Papel")
                                || (jugador == "Spock" && maquina == "Piedra")) {
                            System.out.println("Ganaste!!. Máquina jugó: " + maquina + "\n");
                        }

                        //-----------------------*Máquina*----------------
                        if (("Piedra" == maquina && "Tijera" == jugador)
                                || (maquina == "Papel" && jugador == "Piedra")
                                || (maquina == "Tijera" && jugador == "Papel")
                                || (maquina == "Lagarto" && jugador == "Spock")
                                || (maquina == "Spock" && jugador == "Tijera")

                                || (maquina == "Piedra" && "Lagarto" == jugador)
                                || (maquina == "Papel" && jugador == "Spock")
                                || (maquina == "Tijera" && jugador == "Lagarto")
                                || (maquina == "Lagarto" && jugador == "Papel")
                                || (maquina == "Spock" && jugador == "Piedra")) {
                                System.out.println("Perdiste!!. Máquina jugó: " + maquina + "\n");
                        }

                        //--------------*EMPATE*-----------------
                        if (("Piedra" == maquina && "Piedra" == jugador)
                                || (maquina == "Papel" && jugador == "Papel")
                                || (maquina == "Tijera" && jugador == "Tijera")
                                || (maquina == "Lagarto" && jugador == "Lagarto")
                                || (maquina == "Spock" && jugador == "Spock")) {
                            System.out.println("Empate\n" + " Máquina escogió = " + maquina);
                        } 

                        System.out.println("Jugar otra vez\n" + "1. Si\n" + "0. No" );
                        j = sc.nextInt();

                        if (j == 0) {
                            break;
                        } else if (j > 1) {
                            System.out.println("Opción no válida, escoge 0 o 1.");
                            j = sc.nextInt();
                        }
                    
                    }
                  
		} while (j > 0);
		
		
	}

}

