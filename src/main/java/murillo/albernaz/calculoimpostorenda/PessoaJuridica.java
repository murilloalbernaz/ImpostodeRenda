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
public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, String endereço) {
        super(nome, endereço);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double valorIR(double valor){
        double valorFinal;
        if(valor<= 20000)
            valorFinal = valor*0.15;
        else
            valorFinal = (valor*0.15) + ((valor-20000)*0.10);
        valorFinal += valor*0.09;
        valorFinal += valor*0.05;
        return valorFinal;
    }
}
