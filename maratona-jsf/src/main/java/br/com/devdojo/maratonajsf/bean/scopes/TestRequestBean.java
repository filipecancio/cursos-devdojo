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
    private List<String> personagens = asList("Yusuke","Hiei","Kurama");
    private List<String> personagenSelecionado = new ArrayList<>();

    public void  selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagenSelecionado.add(personagem);
    }

    public List<String> getPersonagenSelecionado() {
        return personagenSelecionado;
    }

    public void setPersonagenSelecionado(List<String> personagenSelecionado) {
        this.personagenSelecionado = personagenSelecionado;
    }
}
