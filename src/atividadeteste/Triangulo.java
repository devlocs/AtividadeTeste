/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeteste;

/**
 *
 * @author Leonardo Oliveira Correia da Silva RA: 317126722
 */
public class Triangulo {

    public String DeterminaTipoTriangulo(int a, int b, int c) {
        String tipo = "ESCALENO";
        if (a <= 0 || b <= 0 || c <= 0) {
            tipo = "INEXISTENTE";
        } else if (!((a + b > c) && (a + c > b) && (b + c > a))) {
            tipo = "INEXISTENTE";
        } else if (a == b) {

            tipo = "ISOSCELES";

            if (b == c) {
                tipo = "EQUILATERO";
            }
        } else if (b == c || a == c) {
            tipo = "ISOSCELES";
        }

        return tipo;
    }
}
