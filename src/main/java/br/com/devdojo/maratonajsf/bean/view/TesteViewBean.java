package br.com.devdojo.maratonajsf.bean.view;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        personagens = asList("Naruto", "Hinata", "Yondaime");
    }

    public void selecionarPersonagem() {
//        int index = ThreadLocalRandom.current().nextInt(bound: 3);
        int index = ThreadLocalRandom.current().nextInt();
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }


    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
