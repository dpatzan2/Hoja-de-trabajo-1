package model;

public class Radio implements interfaces.Radio {
    private boolean estadoRadio;
    private double frecuencia;
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
        if (tipoRadio) {
            System.out.println("Cambiando radio a FM....");
            tipoRadio = true;
        }else{
            System.out.println("Cambiando radio a AM...");
            tipoRadio = false;
        }
    }

    @Override
    public void cambiarFrecuencia() {
        if (estadoRadio) {
            frecuencia += 10;
            if (frecuencia > 1610) {
                frecuencia = 530;
            } else if (frecuencia > 107.9) {
                frecuencia = 87.9;
            }

            System.out.println("Frecuencia actual: " + frecuencia);
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
