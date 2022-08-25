/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author Rodrigo
 */
public class Smartphone extends Celular{
    //atributos
    private float pixelesCamara;
    private float tamanoMemoriaInterna;
    private float tamanoMemoriaExterna;
    
    //constructores por defecto
    public Smartphone(){
        
    }
    
    //constructores de los atributos de la clase ademas de los heredaros
    public Smartphone (String marca, String modelo, String color, 
            float pixCamara, float memInterna, float memExterna){
        super (marca, modelo, color);
        
        this.pixelesCamara = pixCamara;
        this.tamanoMemoriaInterna = memInterna;
        this.tamanoMemoriaExterna = memExterna;
        
    }
    
    public void informarCaracteristicas (){
        super.informarcaracteristicas();
        System.out.println(String.format("Smartphone calidad camara: %s pixeles", pixelesCamara));
        System.out.println(String.format("Smartphone tamaño memoria interna: %s gigabyte", tamanoMemoriaInterna));
        System.out.println(String.format("Smartphone tamaño memoria externa: %s gigabyte", tamanoMemoriaExterna));
    }
    
    //getters y setters
    public float getPixelesCamara(){
        return pixelesCamara;
    }
    public void setPixelesCamara(float pixCamara){
        this.pixelesCamara = pixCamara;
    }
    
    public float getTamanoInterna(){
        return tamanoMemoriaInterna;
    }
    public void setTamanoInterna(float tamInt){
        this.tamanoMemoriaInterna = tamInt;
    }
    public float getTamanoExterna(){
        return tamanoMemoriaExterna;
    }
    public void setTamanoExterna(float tamExt){
        this.tamanoMemoriaExterna = tamExt;
    }
}
