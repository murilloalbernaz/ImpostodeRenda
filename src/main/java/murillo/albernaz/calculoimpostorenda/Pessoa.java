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
public abstract class Pessoa {
    private String nome;
    private String endereço;

    public Pessoa(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
