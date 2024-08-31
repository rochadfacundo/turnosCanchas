/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CanchaSQL;

import Entidades.Cancha;
import Entidades.Cliente;
import Entidades.Turno;
import enums.TipoCancha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class TurnoBD {
    
       private Connection connection;
        

  public TurnoBD() {
    try {
        // Configura la conexión a la base de datos MySQL
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cancha10", "root", "Boca7414");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
     public void guardarTurno(Turno turno) {
        String sql = "INSERT INTO turnos (cancha, fecha, inicio, fin, cliente, precio) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, turno.getCancha().getNombre());
            stmt.setDate(2, java.sql.Date.valueOf(turno.getFecha()));
            stmt.setTimestamp(3, java.sql.Timestamp.valueOf(turno.getFechaHoraInicio()));
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(turno.getFechaHoraFin()));
            stmt.setInt(5, turno.getIdCliente());
            stmt.setDouble(6, turno.getPrecioTotal());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     
       public ArrayList<Turno> cargarTurnos() {
        ArrayList<Turno> turnos = new ArrayList<>();
        String sql = "SELECT * FROM turnos";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) 
        {
            while (rs.next()) {
                // Ejemplo de cómo usar los métodos en TurnoBD
                String nombreCancha = rs.getString("cancha");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                LocalDateTime inicio = rs.getTimestamp("inicio").toLocalDateTime();
                LocalDateTime fin = rs.getTimestamp("fin").toLocalDateTime();
                int idCliente = rs.getInt("id_cliente"); // Asegúrate de que el nombre del campo en la base de datos sea correcto
                double precio = rs.getDouble("precio");

                // Obtener la cancha y el cliente usando los métodos implementados
                Cancha cancha = obtenerCanchaPorNombre(nombreCancha);
                Cliente clienteObj = obtenerClientePorId(idCliente);

                Turno turno = new Turno(idCliente, cancha, fecha, inicio, fin);
                turno.setPrecioTotal(precio);
                turnos.add(turno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return turnos;
       }
       
        private Cancha obtenerCanchaPorNombre(String nombre) 
        {
         // Implementar lógica para obtener la cancha de la base de datos
         // Por ahora, te doy un ejemplo estático, pero debes conectar con la base de datos
         return new Cancha(nombre, TipoCancha.Futbol5, 100.0, 5); // Ejemplo
        }
       
       // Método para obtener un cliente por nombre (debe implementarse según tu lógica)
        private Cliente obtenerClientePorId(int idCliente) 
        {
       // Implementar lógica para obtener el cliente de la base de datos
       // Por ahora, te doy un ejemplo estático, pero debes conectar con la base de datos
            return null; // Ejemplo
    }
     
     
       
    
}
