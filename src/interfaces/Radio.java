package interfaces;

public interface Radio {
    void encenderRadio();
    void apagarRadio();
    void cambiarTipoRadio();
    void cambiarFrecuencia();
    void estaciones();
    void guardarEstacion(int buttonNumber);
    void seleccionarEstacion(int buttonNumber);
}
