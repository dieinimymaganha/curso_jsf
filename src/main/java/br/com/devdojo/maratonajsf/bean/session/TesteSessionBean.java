package br.com.devdojo.maratonajsf.bean.session;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private Estudante estudante;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do SessionScoped");
        personagens = asList("Goku", "Vegeta", "Gohan");
        logar();
    }

    public void logar(){
        //Fez a consulta, verificou se esta OK
        estudante = new Estudante();
    }

    public void selecionarPersonagem() {
//        int index = ThreadLocalRandom.current().nextInt(bound: 3);
        int index = ThreadLocalRandom.current().nextInt();
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
