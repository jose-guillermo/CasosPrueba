/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author joseg
 */
public class Ele36JosBej {
    // Atributos
    protected enum color {
        blanco, negro, rojo, azul, gris
    };

    protected double precioBase;
    protected color colorEle;
    protected char consumoEne;
    protected double peso;

    // Constructores
    public Ele36JosBej() {
        precioBase = 100;
        colorEle = color.blanco;
        consumoEne = 'F';
        peso = 5;
    }

    public Ele36JosBej(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        colorEle = color.blanco;
        consumoEne = 'F';
    }

    public Ele36JosBej(double precioBase, String colorEle, char consumoEne, double peso) {
        this.precioBase = precioBase;
        this.colorEle = comprobarColor(colorEle);
        this.consumoEne = comprobarConsumoEnergetico(consumoEne);
        this.peso = peso;
    }

    // Getters y setters
    public double getPrecioBase() {
        return precioBase;
    }

    public color getColorEle() {
        return colorEle;
    }

    public char getConsumoEne() {
        return consumoEne;
    }

    public double getPeso() {
        return peso;
    }

    // Metodos propios
    /**
     * Comprobara si la letra del consumo energético es correcto
     * 
     * @param letra
     * @return Devuelve la letra si esta entre los valores permitidos y 'F' en caso
     *         contrario
     */
    private char comprobarConsumoEnergetico(char letra) {
        String l = "" + letra;
        l = l.toUpperCase();
        if (l.matches("[A-F]")) {
            return letra;
        }
        return 'F';
    }

    /**
     * Comprobara si el color introducido es correcto
     * 
     * @param colorEle
     * @return Devuelve el color introducido si esta entre los valores permitidos y
     *         blanco en caso contrario
     */
    private color comprobarColor(String colorEle) {
        String colorE = colorEle.toLowerCase();
        switch (colorE) {
            case "azul":
                return color.azul;
            case "gris":
                return color.gris;
            case "negro":
                return color.negro;
            case "rojo":
                return color.rojo;
            default:
                return color.blanco;
        }
    }

    /**
     * Calcula el precioFin del electrodomestico según sus características
     * 
     * @return devuelve el precioFin del electrodomestico
     */
    public double precioFinal() {
        double precioFin = precioBase;
        switch (consumoEne) {
            case 'A':
                precioFin += 100;
                break;
            case 'B':
                precioFin += 80;
                break;
            case 'C':
                precioFin += 60;
                break;
            case 'D':
                precioFin += 50;
                break;
            case 'E':
                precioFin += 30;
                break;
            case 'F':
                precioFin += 10;
                break;
        }
        if (peso >= 80) {
            precioFin += 100;
        } else if (peso >= 50) {
            precioFin += 80;
        } else if (peso >= 20) {
            precioFin += 50;
        } else if (peso >= 0) {
            precioFin += 10;
        }
        return precioFin;

    }
}
