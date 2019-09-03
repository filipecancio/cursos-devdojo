package br.com.devdojo.maratonajsf.bean.scopes;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TestViewBean implements Serializable {
    private String nome = "Maratona JSF - Aula 14: Escopos pt 03, ViewScoped";
    private List<String> oferta = asList("Amostra Avon","Amostra OBoticário","Amostra Natura");
    private List<String> ofertaSelecionado = new ArrayList<>();

    public void  selecionarOferta(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String off = oferta.get(index);
        ofertaSelecionado.add(off);
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
