package Ultimo_examen.Vehiculo;

public class Camion extends Comercial {

    /*Atributos */
    private boolean volquete;
    private boolean cerrado;
    private static int totalCamiones = 0;
    private int KMLIMITE = 2500;;

    /* Constructor */
    public Camion(String matricula, String marca, String modelo, String cargaMaz, double volumen, boolean volquete,
            boolean cerrado, long kmRecorridos) {
        super(matricula, marca, modelo, cargaMaz, volumen, kmRecorridos);
        this.volquete = volquete;
        this.cerrado = cerrado;
        totalCamiones ++;
    }

    /*Métodos */
    public boolean isVolquete() {
        return volquete;
    }

    public void setVolquete(boolean volquete) {
        this.volquete = volquete;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Camion.totalCamiones = totalCamiones;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("El camión ha sido devuelto");
            alquilado = false;
            kmRecorridos += 1000;
            if (kmRecorridos > KMLIMITE) {
                System.out.println("¡Ha superado el límite de kilómetros del camión!");
            }else{
                System.out.println("Has realizado " + kmRecorridos + "km");
            }
        } else {
            System.out.println("El camión no se puede devolver porque no está alquilado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Volquete: " + volquete + " Cerrado: " + cerrado;
    }
}
