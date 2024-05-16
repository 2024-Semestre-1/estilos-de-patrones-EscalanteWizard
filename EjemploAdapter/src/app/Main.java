package app;
import motores.Motor;
import motores.MotorCombustion;
import motores.MotorElectrico;
import motores.MotorElectricoAdapter;

import java.util.Scanner;

public abstract class Main {
    private static Scanner s = new Scanner(System.in);
    private static Motor motor;

    public static void main(String[] args) {
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion){
                case 1 -> {
                    motor = new MotorCombustion();
                    usarMotor();
                }
                case 2 -> {
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                }
                case 3 -> System.out.println("Cerrando el programa....");
                default -> System.out.println("La opcion ingresada no es valida...");
            }
            System.out.println("\n\n");
        }while(opcion!=3);
    }
    private static int preguntarOpcion(){
        System.out.print(
            "MENU DE OPCIONES\n"
            +"--------------------\n"
            +"1 Encender motor de combustion\n"
            +"2 Encender motor Electrico\n"
            +"3 Salir.\n"
            +"Seleccione su opcion: \n"
        );
        return Integer.parseInt(s.nextLine());
    }
    private static void usarMotor(){
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
    
}