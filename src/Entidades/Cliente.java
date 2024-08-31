
package Entidades;

public class Cliente {
    
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    
    public Cliente(int id,String nombre,String apellido,int dni)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
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
        
    public int getDNI()
    {
        return this.dni;
    }
    
    public void setDNI(int dni)
    {
        this.dni=dni;
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
