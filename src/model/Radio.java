package model;

public class Radio implements interfaces.Radio {
    private boolean estadoRadio;
    private double frecuencia = 530;
    private boolean tipoRadio;

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
        System.out.println(direccion);
        if (estadoRadio) {
            if (direccion == 1) {
                frecuencia += 10;
                if (tipoRadio){
                    if(frecuencia <107.9){
                        frecuencia +=0.2;
                    } else {
                        frecuencia = 87.9;
                    }
                }else{
                    if(frecuencia < 1610.0){
                        frecuencia +=10;
                    } else {
                        frecuencia = 530.0;
                    }
                }
                System.out.println("Frecuencia aumentada: " + frecuencia);
            } else if (direccion == 2) {
                frecuencia -= 10;
                if (tipoRadio){
                    if(frecuencia <107.9){
                        frecuencia -=0.2;
                    } else {
                        frecuencia = 87.9;
                    }
                }else{
                    if(frecuencia < 1610.0){
                        frecuencia -=10;
                    } else {
                        frecuencia = 530.0;
                    }
                }
                System.out.println("Frecuencia disminuida: " + frecuencia);
            } else {
                System.out.println("Dirección no válida. Use 1 para aumentar o 2 para disminuir.");
            }
        } else {
            System.out.println("El radio está apagado. Enciéndelo antes de cambiar la frecuencia.");
        }

    }

    @Override
    public void estaciones() {

    }

    @Override
    public void guardarEstacion(int buttonNumber) {

    }

    @Override
    public void seleccionarEstacion(int buttonNumber) {

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
