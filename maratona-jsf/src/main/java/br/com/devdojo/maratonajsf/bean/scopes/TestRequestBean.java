package br.com.devdojo.maratonajsf.bean.scopes;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TestRequestBean implements Serializable {
    private String nome = "Maratona JSF - Aula 12: Escopos pt 01, RequestScoped";
    private List<String> ofertas = asList("10 reais","20 reais","40 reais");
    private List<String> ofertaSelecionado = new ArrayList<>();

    public void  selecionarOferta(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = ofertas.get(index);
        ofertaSelecionado.add(personagem);
    }

    public List<String> getOfertaSelecionado() {
        return ofertaSelecionado;
    }

    public void setOfertaSelecionado(List<String> ofertaSelecionado) {
        this.ofertaSelecionado = ofertaSelecionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
