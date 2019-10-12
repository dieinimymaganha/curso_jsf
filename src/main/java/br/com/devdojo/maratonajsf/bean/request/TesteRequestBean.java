package br.com.devdojo.maratonajsf.bean.request;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {
    private  List<String> personagens = asList("Yusuke", "Hiei", "Kurama");
    private List<String> personagemSelecionado = new ArrayList<>();


    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do RequestScoped");
        personagens = asList("Goku", "Vegeta", "Gohan");
    }


    public void selecionarPersonagem(){
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
