/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;


/**
 *
 * @author mari2
 */
public class Cap8_4 {

    float longitud =1;
    float anchura = 1;

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        if(longitud>=0 | longitud<=20){
            this.longitud = longitud;
        }else{
            this.longitud = 1;
         }
    }

    public float getAnchura() {
        return anchura;
    }

    public void setAnchura(float anchura) {
        if(anchura>=0 | anchura<=20){
            this.anchura = anchura;
        }else{
            this.anchura = 1;
        }
        
    }
    
    public float obtenerArea(float anchura, float longitud){
        return anchura*longitud;
    }
    
    public float obtenerPer (float anchura, float longitud){
        return (2*anchura)+(2*longitud);
    }
    
}
