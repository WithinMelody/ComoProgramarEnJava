/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.tres;

/**
 *
 * @author mari2
 */
public class Cap3_12 {

    String nPieza, descPieza;
    int articulos;
    double precio;

    public Cap3_12(String numPieza, String dPieza, int art, double prc) {
        nPieza = numPieza;
        descPieza = dPieza;
        articulos = art;
        precio = prc;
    }

    public String getnPieza() {
        return this.nPieza;
    }

    public void setnPieza(String nPieza) {
        this.nPieza = nPieza;
    }

    public String getdescPieza() {
        return this.descPieza;
    }

    public void setdescPieza(String descPieza) {
        this.descPieza = descPieza;
    }

    public int getArticulo() {
        return this.articulos;
    }

    public void setArticulo(int articulos) {
        this.articulos = articulos;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerMontoFactura() {
        double valor = (precio * articulos);
        if (valor < 0) {
            valor = 0;
        }
        if (precio < 0) {
            precio = 0.0;
        }
        return valor;
    }
}
