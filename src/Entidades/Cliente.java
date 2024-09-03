
package Entidades;

public class Cliente {
    
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String dni;
    
    public Cliente(int id,String nombre,String apellido,String dni,String email,String telefono)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.telefono=telefono;
        this.email=email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    public int getId()
    {
        return this.id;
    }
    
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
     public String getApellido()
    {
        return this.apellido;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
       
    
    
    
    
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(this.nombre).append("\n");
    sb.append("Apellido: ").append(this.apellido).append("\n");
    sb.append("DNI: ").append(this.dni).append("\n");
    return sb.toString();
}

    
}
