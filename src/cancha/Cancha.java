
package cancha;


public class Cancha {
    private String nombre;
    private String tipo; 
    public int cantidadJugadores;
    private double precioPorHora;
    private boolean disponible;

    public Cancha(String nombre, String tipo, double precioPorHora,int cantidadJugadores) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioPorHora = precioPorHora;
        this.cantidadJugadores=cantidadJugadores;
        this.disponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getTipo() {
        return tipo;
    }
    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Cancha [nombre=" + nombre + ", tipo=" + tipo + ", precioPorHora=" + precioPorHora + ", disponible=" + disponible + "]";
    }
}

