/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author joseg
 */
public class TienJosBej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ele36JosBej[] arrEle = new Ele36JosBej[10];
        
        arrEle[0] = new TvJosBej();
        arrEle[1] = new TvJosBej(300, 15);
        arrEle[2] = new TvJosBej(500, "rojo", 'B', 20, 50, true);
        arrEle[3] = new TvJosBej(800, "negro", 'A', 30, 30, true);
        arrEle[4] = new LavJosBej();
        arrEle[5] = new LavJosBej(100, 50);
        arrEle[6] = new LavJosBej(150, "BlaNco", 'b', 30, 40);
        arrEle[7] = new LavJosBej(200, "gRiS", 'c', 30, 50);
        arrEle[8] = new Ele36JosBej();
        arrEle[9] = new Ele36JosBej(400, "Marron", 'B', 30);

        double precioFinTv = 0, precioFinLav = 0, precioFinEle = 0;
        TvJosBej tv;
        LavJosBej lav;

        for (int i = 0; i < arrEle.length; i++) {
            if(arrEle[i] instanceof TvJosBej){
                tv = (TvJosBej)arrEle[i];
                precioFinTv += tv.precioFinal();
            } else if(arrEle[i] instanceof LavJosBej){
                lav = (LavJosBej)arrEle[i];
                precioFinLav += lav.precioFinal();
            } else {
                precioFinEle += arrEle[i].precioFinal();
            }
        }

        System.out.println("Precio Television: " + precioFinTv);
        System.out.println("Precio Lavadora: " + precioFinLav);
        System.out.println("Precio Electrodoméstico: " + precioFinEle);
        System.out.println("Precio total: " + (precioFinEle + precioFinTv + precioFinLav));
    }
}