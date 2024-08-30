/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cancha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class GestionTurnos {
    
    ArrayList<Turno> turnos;
    
    public GestionTurnos(ArrayList<Turno> turnos)
    {
        this.turnos= turnos;
    }
    
    public void agregarTurno(Turno turno) {
    this.turnos.add(turno);  
    }
    
    public void eliminarTurno(Turno turno) {
    this.turnos.remove(turno);
    }
    
    
    public ArrayList<Turno> turnosPorCliente(Cliente cliente) {
    ArrayList<Turno> resultados = new ArrayList<>();
    for (Turno turno : turnos) {
        if (turno.getIdCliente()==cliente.getId()) 
        {
            resultados.add(turno);
        }
    }
    return resultados;
    }
    
    public boolean verificarDisponibilidad(Cancha cancha, LocalDateTime inicio, LocalDateTime fin) {
    for (Turno turno : turnos) {
        if (turno.getCancha().equals(cancha) && 
            ((inicio.isBefore(turno.getFechaHoraFin()) && fin.isAfter(turno.getFechaHoraInicio())))) {
            return false; // La cancha no está disponible en este rango de tiempo
        }
    }
    return true; // La cancha está disponible
}
    
    public ArrayList<Turno> buscarTurnosPorFecha(LocalDate fecha) {
    ArrayList<Turno> resultados = new ArrayList<>();
    for (Turno turno : turnos) {
        if (turno.getFecha().equals(fecha)) {
            resultados.add(turno);
        }
    }
    return resultados;
    }

    

    
    
}
