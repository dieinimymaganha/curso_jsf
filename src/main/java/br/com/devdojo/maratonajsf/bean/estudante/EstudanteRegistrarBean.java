package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();


    private String[] nomesArray = {"DevDojo", "eh", "foda"};
    private List<String> nomesList = asList("William", "Wildnei", "Brenon", "Sandy");
    private Set<String> nomesSet = new HashSet<>(asList("Goku", "Luffy", "Naruto", "Kuririm"));

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
