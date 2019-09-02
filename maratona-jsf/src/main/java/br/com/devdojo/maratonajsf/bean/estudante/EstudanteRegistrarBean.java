package br.com.devdojo.maratonajsf.bean.estudante;


import br.com.devdojo.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
public class EstudanteRegistrarBean  implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nome = {"Joana","Marcos","Tânia","Fernando","Dalila"};
    private List<String> nomeList = asList("Joana","Marcos","Tânia","Fernando","Dalila");

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public List<String> getNomeList() {
        return nomeList;
    }

    public void setNomeList(List<String> nomeList) {
        this.nomeList = nomeList;
    }
}
