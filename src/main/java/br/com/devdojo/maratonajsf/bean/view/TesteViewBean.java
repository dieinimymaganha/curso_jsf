package br.com.devdojo.maratonajsf.bean.view;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependenteBean;
import br.com.devdojo.maratonajsf.bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
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
    private final TesteDependenteBean dependenteBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteViewBean(TesteDependenteBean dependenteBean, TesteSessionBean sessionBean) {
        this.dependenteBean = dependenteBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        personagens = asList("Naruto", "Hinata", "Yondaime");
    }

    public void selecionarPersonagem() {
//        int index = ThreadLocalRandom.current().nextInt(bound: 3);
        System.out.println(sessionBean.getEstudante().getNome());
        if (sessionBean.getEstudante().getNome().equals("William")) {
            int index = ThreadLocalRandom.current().nextInt(3);
            String personagem = personagens.get(index);
            personagemSelecionado.add(personagem);
            dependenteBean.getPersonagemSelecionado().add(personagem);
        }
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }

    public TesteDependenteBean getDependenteBean() {
        return dependenteBean;
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
