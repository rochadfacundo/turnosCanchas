/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cancha10;
import cancha.Cancha;
import cancha.Turno;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author PC
 */

public class Cancha10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Crear una instancia de Cancha
        Cancha cancha1 = new Cancha("Cancha 1", "Fútbol 5", 500.0,8);

        // Crear una instancia de Turno
        LocalDate fecha = LocalDate.of(2024, 8, 26);
        LocalDateTime horaInicio = LocalDateTime.of(2024, 8, 26, 14, 0);
        LocalDateTime horaFin = LocalDateTime.of(2024, 8, 26, 16, 0);
        Turno turno1 = new Turno(cancha1, fecha, horaInicio, horaFin, "Juan Pérez");

        // Imprimir los detalles del turno
        System.out.println(turno1);

        // Verificar la disponibilidad de la cancha
        System.out.println("¿Está disponible la cancha? " + cancha1.isDisponible());

        // Probar un segundo turno en la misma cancha (debería estar no disponible)
        LocalDateTime horaInicio2 = LocalDateTime.of(2024, 8, 26, 17, 0);
        LocalDateTime horaFin2 = LocalDateTime.of(2024, 8, 26, 18, 0);

        if (cancha1.isDisponible()) {
            Turno turno2 = new Turno(cancha1, fecha, horaInicio2, horaFin2, "Carlos López");
            System.out.println(turno2);
        } else {
            System.out.println("La cancha no está disponible para otro turno.");
        }
    }
    
}
