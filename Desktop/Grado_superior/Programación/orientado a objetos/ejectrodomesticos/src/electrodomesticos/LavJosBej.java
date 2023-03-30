/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author joseg
 */
public class LavJosBej extends Ele36JosBej{
    // Atributos
    private double carga;

    // Constructores
    public LavJosBej (){
        carga = 5;
    }

    public LavJosBej(double precioBase, double peso) {
        super(precioBase, peso);
        carga = 5;
    }

    public LavJosBej(double precioBase, String colorEle, char consumoEne, double peso, double carga) {
        super(precioBase, colorEle, consumoEne, peso);
        this.carga = carga;
    }

    // Getters
    public double getCarga() {
        return carga;
    }

    // Métodos sobreescritos
    @Override
    public double precioFinal() {
        double precioFin = super.precioFinal();
        if (carga > 30){
            precioFin += 50; 
        } 
        return precioFin;
    }    
}
