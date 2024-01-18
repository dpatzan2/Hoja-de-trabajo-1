package model;

import java.util.ArrayList;
import java.util.List;

public class Radio implements interfaces.Radio {
    private boolean estadoRadio;
    private double frecuencia = 530;
    private boolean tipoRadio;
    private List<Double> estacionesGuardadas;

    public Radio() {
        this.estacionesGuardadas = new ArrayList<>();
    }



    @Override
    public void encenderRadio() {
        if (!estadoRadio) {
            System.out.println("Encendiendo el radio...");
            estadoRadio = true;
        } else {
            System.out.println("El radio ya está encendido.");
        }
    }

    @Override
    public void apagarRadio() {
        if (estadoRadio) {
            System.out.println("Apagando el radio...");
            estadoRadio = false;
        } else {
            System.out.println("El radio ya está apagado.");
        }
    }

    @Override
    public void cambiarTipoRadio() {
        if (!tipoRadio) {
            System.out.println("Cambiando radio a FM....");
            tipoRadio = true;
        }else{
            System.out.println("Cambiando radio a AM...");
            tipoRadio = false;
        }
    }

    @Override
    public void cambiarFrecuencia(int direccion) {
        if (estadoRadio) {
            if (direccion == 1 || direccion == 2) {
                if (tipoRadio) {
                    if (direccion == 1) {
                        frecuencia += 0.2;
                        if (frecuencia > 107.9) {
                            frecuencia = 87.9;
                        }
                        System.out.println("Frecuencia aumentada: " + frecuencia);
                    } else if (direccion == 2) {
                        frecuencia -= 0.2;
                        if (frecuencia < 87.9) {
                            frecuencia = 107.9;
                        }
                        System.out.println("Frecuencia disminuida: " + frecuencia);
                    }
                } else { // AM
                    if (direccion == 1) {
                        frecuencia += 10;
                        if (frecuencia > 1610.0) {
                            frecuencia = 530.0;
                        }
                        System.out.println("Frecuencia aumentada: " + frecuencia);
                    } else if (direccion == 2) {
                        frecuencia -= 10;
                        if (frecuencia < 530.0) {
                            frecuencia = 1610.0;
                        }
                        System.out.println("Frecuencia disminuida: " + frecuencia);
                    }
                }
            } else {
                System.out.println("Dirección no válida. Use 1 para aumentar o 2 para disminuir.");
            }
        } else {
            System.out.println("El radio está apagado. Enciéndelo antes de cambiar la frecuencia.");
        }
    }

    @Override
    public void guardarEstacion(int buttonNumber) {
        if (buttonNumber >= 1 && buttonNumber <= 12) {
            if (estadoRadio) {
                System.out.println("Guardando estación en el botón " + buttonNumber + ": " + frecuencia);
                estacionesGuardadas.add(frecuencia);
            } else {
                System.out.println("El radio está apagado. Enciéndelo antes de guardar una estación.");
            }
        } else {
            System.out.println("Número de botón no válido. Use un número del 1 al 12.");
        }
    }


    @Override
    public void seleccionarEstacion(int buttonNumber) {
        if (buttonNumber >= 1 && buttonNumber <= 12) {
            if (estacionesGuardadas.size() >= buttonNumber) {
                double estacionSeleccionada = estacionesGuardadas.get(buttonNumber - 1);
                System.out.println("Seleccionando estación del botón " + buttonNumber + ": " + estacionSeleccionada);
                frecuencia = estacionSeleccionada;
            } else {
                System.out.println("No hay una estación guardada en el botón " + buttonNumber + ".");
            }
        } else {
            System.out.println("Número de botón no válido. Use un número del 1 al 12.");
        }
    }

    public boolean getEstadoRadio() {
        return estadoRadio;
    }

    public boolean isTipoRadio() {
        return tipoRadio;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
}
