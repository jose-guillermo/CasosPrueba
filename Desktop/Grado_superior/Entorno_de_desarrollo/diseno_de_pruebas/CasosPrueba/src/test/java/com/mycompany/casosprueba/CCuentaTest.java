/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.casosprueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author joseg
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of asignarNombre method, of class CCuenta.
     */
    @Test
    public void testAsignarNombre() {
        System.out.println("asignarNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.asignarNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombre method, of class CCuenta.
     */
    @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estado method, of class CCuenta.
     */
    @Test
    public void testEstado() {
        System.out.println("estado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.estado();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = -300;
        CCuenta instance = new CCuenta("Jose", "0234142", 100);
        try{
            instance.ingresar(cantidad); 
        } catch(Exception e){
            
        }
    }
    
    @ParameterizedTest
    @ValueSource (ints = {200, -300, 500})
    public void parameterizedTestRetirar(int number) throws Exception {
        System.out.println("retirar");
        double cantidad = number;
        CCuenta instance = new CCuenta("Jose", "0234142", 400);
        try{
             instance.retirar(cantidad);
        } catch(Exception e){
            
        }

    }

    @ParameterizedTest
    @CsvSource({"300, 200", "-200, -300", "-200, 500", "300, -200", "300, 800", "-200, 200"})
    public void testIngresarRetirar(int cantidadI, int cantidadR) throws Exception {
        System.out.println("ingresar");
        double ingresar = cantidadI;
        double retirar = cantidadR;
        CCuenta instance = new CCuenta("Jose", "0234142", 400);
        
        try{
            instance.ingresar(ingresar);   
            instance.retirar(retirar);
        } catch(Exception e){
        }
    }
    
    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 200;
        CCuenta instance = new CCuenta("Jose", "0234142", 300);

        instance.retirar(cantidad);
    }
    
    /**
     * Test of obtenerCuenta method, of class CCuenta.
     */
    @Test
    public void testObtenerCuenta() {
        System.out.println("obtenerCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
