
package cancha;




enum TipoCancha{
    
    Futbol5(1),
    Futbol7(2),
    Futbol9(3),
    Futbol11(4),
    Basket(5),
    Tennis(6),
    Handball(7);
    
    private int codigo;
    
    private TipoCancha(int codigo)
    {
        this.codigo=codigo;
    }
    
    public int getCode()
    {
        return this.codigo;
    }
    
    
}


public class Cancha {
    private String nombre;
    private TipoCancha tipo; 
    public int cantidadJugadores;
    private double precioPorHora;
    private boolean disponible;

    public Cancha(String nombre, TipoCancha tipo, double precioPorHora,int cantidadJugadores) {
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
    

    public TipoCancha getTipo() {
        return tipo;
    }
    

    public void setTipo(TipoCancha tipo) {
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
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(this.nombre).append("\n");
    sb.append("Tipo: ").append(this.tipo).append("\n");
    sb.append("Cantidad de jugadores: ").append(this.cantidadJugadores).append("\n");
    sb.append("Precio por hora: ").append(this.precioPorHora).append("\n");
    sb.append("Disponible: ").append(this.disponible ? "Sí" : "No").append("\n");
    return sb.toString();
}
}

