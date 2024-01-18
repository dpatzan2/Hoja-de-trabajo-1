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
        System.out.println("|          Encender? Escribir 1 ; Cerrar radio: Escribir 2  |");
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
            System.out.println("|                        Radio UVG            Apagar?: 4    |");
            System.out.println("-------------------------------------------------------------");
            System.out.println(String.format("|Radio en: %-32s  Estacion: %s|", radio.isTipoRadio() ? "AM" : "FM", radio.getFrecuencia()));
            System.out.println("-------------------------------------------------------------");
            System.out.println("| Estación:                                 Tipo radio:     |");
            System.out.println("| +: Presiona 1                         AM<->FM: presiona 3 |");
            System.out.println("| -: Presiona 2                                             |");
            System.out.println("|                                                           |");
            System.out.println("| Guardar Radio: Presionar: 5                               |");
            System.out.println("| Cargar Radios Guardadas: 6                                |");
            System.out.println("|                                                           |");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    radio.cambiarFrecuencia(option);
                    break;
                case 2:
                    radio.cambiarFrecuencia(option);
                    break;
                case 3:
                    radio.cambiarTipoRadio();
                    break;
                case 5:
                    radio.guardarEstacion(option);
                    break;
                case 4:
                    radio.apagarRadio();
                    siEstaApagado(scanner);
                    break;
                case 6:
                    radio.seleccionarEstacion(option);
                    break;
            }
        }while (option != 0);
    }
}
