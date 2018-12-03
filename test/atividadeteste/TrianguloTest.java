/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maicon Guimaraes de Almeida RA: 31713843
 */
public class TrianguloTest {

    public TrianguloTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of DeterminaTipoTriangulo method, of class Triangulo.
     */
    @Test
    public void testDeterminaTipoTrianguloInexistente() {
        System.out.println("DeterminaTipoTrianguloInexistente");
        int a = 0;
        int b = 0;
        int c = 0;
        Triangulo instance = new Triangulo();
        String expResult = "INEXISTENTE";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloInexistente2() {
        System.out.println("DeterminaTipoTrianguloInexistente2");
        int a = 1;
        int b = 2;
        int c = 3;
        Triangulo instance = new Triangulo();
        String expResult = "INEXISTENTE";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void TrianguloEquilatero() {
        System.out.println("DeterminaTipoTrianguloEquilatero");
        int a = 1;
        int b = 1;
        int c = 1;
        Triangulo instance = new Triangulo();
        String expResult = "EQUILATERO";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void TrianguloIsosceles() {
        System.out.println("DeterminaTipoTrianguloIsosceles");
        int a = 1;
        int b = 2;
        int c = 2;
        Triangulo instance = new Triangulo();
        String expResult = "ISOSCELES";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloIsosceles2() {
        System.out.println("DeterminaTipoTrianguloIsosceles2");
        int a = 2;
        int b = 2;
        int c = 1;
        Triangulo instance = new Triangulo();
        String expResult = "ISOSCELES";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void TrianguloEscaleno() {
        System.out.println("DeterminaTipoTrianguloEscaleno");
        int a = 2;
        int b = 3;
        int c = 4;
        Triangulo instance = new Triangulo();
        String expResult = "ESCALENO";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
}
