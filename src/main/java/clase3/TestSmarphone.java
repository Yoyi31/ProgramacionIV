/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author Rodrigo
 */
public class TestSmarphone {
    public static void main (String[]args){
        //crea un objeto de tipo smartphone
        Smartphone smart = new Smartphone ();
        
        smart.setmarca("xiaomi");
        smart.setmodelo("Note 9");
        smart.setcolor("Negro");
        smart.setPixelesCamara(20);
        smart.setTamanoInterna(164);
        smart.setTamanoExterna(64);
        
        smart.llamar("Jefa");
        smart.cortarLlamadas();
        
        System.out.println();
        
        smart.informarCaracteristicas();
        
    }
}
