package cancha;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class Turno {
    private Cancha cancha;
    private int idCliente;
    private LocalDate fecha;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    private double precioTotal;

    public Turno(int idCliente,Cancha cancha, LocalDate fecha, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        
        this.cancha = cancha;
        this.fecha = fecha;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.idCliente = idCliente;
        this.precioTotal = this.calcularPrecio();
        this.cancha.setDisponible(false); 
    }

private double calcularPrecio() {
    long minutos = java.time.Duration.between(this.fechaHoraInicio, this.fechaHoraFin).toMinutes();
    return this.cancha.getPrecioPorHora() * (minutos / 60.0);
}

    public Cancha getCancha() {
        return this.cancha;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechaHoraInicio() {
        return this.fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.precioTotal = this.calcularPrecio();
    }



    public LocalDateTime getFechaHoraFin() {
        return this.fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
        this.precioTotal = this.calcularPrecio();
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public double getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(double precioTotal)
    {
        this.precioTotal=precioTotal;
    }
    
    
    
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancha: ").append(this.cancha.getNombre()).append("\n");
        sb.append("Cliente: ").append(this.getIdCliente()).append("\n");
        sb.append("Fecha: ").append(this.fecha).append("\n");
        sb.append("Hora de inicio: ").append(this.fechaHoraInicio).append("\n");
        sb.append("Hora de fin: ").append(this.fechaHoraFin).append("\n");
        sb.append("Precio Total: ").append(this.precioTotal).append("\n");
        return sb.toString();
    }
    
    

}