/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author joseg
 */
public class TvJosBej extends Ele36JosBej {
    //Atributos
    private int resolucion;
    private boolean sinTDT;

    //Constructores
    public TvJosBej(){
        resolucion = 20;
        sinTDT = false;
    }

    public TvJosBej(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion = 20;
        sinTDT = false;
    }

    public TvJosBej(double precioBase, String colorEle, char consumoEne, double peso, int resolucion, boolean sinTDT) {
        super(precioBase, colorEle, consumoEne, peso);
        this.resolucion = resolucion;
        this.sinTDT = sinTDT;
    }


    //Getters y setters
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSinTDT() {
        return sinTDT;
    }

    //Metodos sobrescritos
    @Override
    public double precioFinal() {
        double precioFin = super.precioFinal();
        if(resolucion > 40){
            precioFin *= 1.3;
        } if (sinTDT == true){
            precioFin += 50;
        }
        return precioFin;        
    }    
}
