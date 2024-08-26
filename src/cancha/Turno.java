package cancha;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private Cancha cancha;
    private LocalDate fecha;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String nombreCliente;
    private double precioTotal;

    public Turno(Cancha cancha, LocalDate fecha, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, String nombreCliente) {
        this.cancha = cancha;
        this.fecha = fecha;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.nombreCliente = nombreCliente;
        this.precioTotal = this.calcularPrecio();
        this.cancha.setDisponible(false); 
    }

    private double calcularPrecio() {
        return this.cancha.getPrecioPorHora() * (this.fechaHoraFin.getHour() - this.fechaHoraInicio.getHour());
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

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    @Override
    public String toString() {
        return "Turno [cancha=" + this.cancha.getNombre() + ", fecha=" + this.fecha + ", fechaHoraInicio=" + this.fechaHoraInicio 
                + ", fechaHoraFin=" + this.fechaHoraFin + ", nombreCliente=" + this.nombreCliente + ", precioTotal=" + this.precioTotal + "]";
    }
}