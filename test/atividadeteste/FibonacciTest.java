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
public class FibonacciTest {

    public FibonacciTest() {
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
     * Test of DeterminaPosicaoFibonacci method, of class Fibonacci.
     */
    @Test
    public void PosicaoFibonacci() {
        System.out.println("DeterminaPosicaoFibonacci");
        int posicao = 6;
        Fibonacci instance = new Fibonacci();
        int expResult = 8;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
    }

    @Test
        public void Negativo() {
        System.out.println("DeterminaPosicaoFibonacciNegativo");
        int posicao = -2;
        Fibonacci instance = new Fibonacci();
        int expResult = 0;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
        fail("ERROR: posicao deve ser maior que 0.");
    }

    @Test
        public void Letra() {
        System.out.println("DeterminaPosicaoFibonacciLetra");
        int posicao = "a";
        Fibonacci instance = new Fibonacci();
        int expResult = 0;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
        fail("ERROR: Entre com um numero inteiro positivo.");
    }

}
