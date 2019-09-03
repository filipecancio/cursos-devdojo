package br.com.devdojo.maratonajsf.bean.scopes;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TestSectionBean implements Serializable {
    private String nome = "Maratona JSF - Aula 13: Escopos pt 02, SessionScoped";
    private List<String> oferta = asList("40% de desconto.","10x sem juros.","primeira parcela grátis.");
    private List<String> ofertaSelecionado = new ArrayList<>();

    public void  selecionarOferta(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String off = oferta.get(index);
        ofertaSelecionado.add(off);
    }
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "page01?faces-redirect=true";
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
