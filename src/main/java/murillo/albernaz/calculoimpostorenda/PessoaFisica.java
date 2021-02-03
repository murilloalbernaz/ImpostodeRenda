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
public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf, String nome, String endereço) {
        super(nome, endereço);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double valorIR(double valor, int dependentes, double gastoSaude, double gastoEducacao){
        double valorfinal = 0;
        valorfinal += (valor*0.11);
        valorfinal = (((valor-(2*dependentes)-valorfinal)*0.11)-(gastoEducacao+gastoSaude)); 
        return valorfinal;
    };
}
