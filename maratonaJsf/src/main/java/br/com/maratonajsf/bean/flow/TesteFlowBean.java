package br.com.maratonajsf.bean.flow;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "registration")
public class TesteFlowBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String endereco;

    public void salvar() {
        System.out.println("Salvando no banco de dados");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(endereco);
//        return "exitToInicio";
//        return "exitToIndex";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
