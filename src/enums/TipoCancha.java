/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;


public enum TipoCancha{
    
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
