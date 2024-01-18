package UI;

import model.Radio;

import java.util.Scanner;

public class ConsoleUI {

    static Radio radio = new Radio();


    public static void MenuRadio(Scanner scanner){
        if (!radio.getEstadoRadio()){
            siEstaApagado(scanner);
        }else{
            siEstaEncendido(scanner);
        }
    }
    public static void siEstaApagado(Scanner scanner){
        int option = 0;
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                        Radio UVG                          |");
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                                                           |");
        System.out.println("|                       Radio apagado                       |");
        System.out.println("|          Encender? Apacha 1 ; Cerrar radio: Apacha 2      |");
        System.out.println("|                                                           |");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Seleccione una opción: ");
        option = scanner.nextInt();
        switch (option){
            case 1:
                radio.encenderRadio();
                siEstaEncendido(scanner);
                break;
            case 2:
                break;
        }
    }

    public static void siEstaEncendido(Scanner scanner){
        int option = 0;
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("|                        Radio UVG                          |");
            System.out.println("-------------------------------------------------------------");
            System.out.println(String.format("|Radio en: %-34s  Estacion: %s|", radio.isTipoRadio() ? "AM" : "FM", radio.getFrecuencia()));
            System.out.println("-------------------------------------------------------------");
        }while (option != 0);
    }
}