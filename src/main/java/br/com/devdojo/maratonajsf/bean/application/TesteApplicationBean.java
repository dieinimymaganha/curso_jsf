package br.com.devdojo.maratonajsf.bean.application;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependenteBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped

public class TesteApplicationBean implements Serializable {
    private final TesteDependenteBean dependenteBean;
    private List<String> categoriaList;

    @Inject
    public TesteApplicationBean(TesteDependenteBean dependenteBean) {
        this.dependenteBean = dependenteBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        categoriaList = asList("RPG", "SCI-FI","Terror");
        dependenteBean.getCategoriasList().addAll(asList("Comedia", "Romance"));

    }
    public void mudarLista(){
        categoriaList = asList("RPG", "SCI-FI","Terror", "Porn");


    }

    public TesteDependenteBean getDependenteBean() {
        return dependenteBean;
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
