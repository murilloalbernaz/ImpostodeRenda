/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.calculoimpostorenda;

/**
 *
 * @author murillo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica p = new PessoaFisica("3241", "murillo", "704");
        System.out.println(p.valorIR(10000, 2, 1000, 2000));
    }
    
}
