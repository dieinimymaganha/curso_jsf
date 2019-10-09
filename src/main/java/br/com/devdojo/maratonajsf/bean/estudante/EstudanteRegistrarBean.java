package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();


    private String[] nomesArray = {"DevDojo", "eh", "foda"};
    private List<String> nomesList = asList("William", "Wildnei", "Brenon", "Sandy");
    private Set<String> nomesSet = new HashSet<>(asList("Goku", "Luffy", "Naruto", "Kuririm"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("One Piece", "O mais longo");
        nomesMap.put("Naruto", "LengaLenga");
    }

    public void executar(String param) {
        System.out.println("Fazendo um busca no DB com o PARAMETRO: " + param);
        System.out.println("Processamento os dados");
        System.out.println("Exibindo os dados");
    }

    public String irparaIndex2() {
//        Para redirecionar a url utiliza ?faces-redirect=true
        return "index2?faces-redirect=true";

    }

    public  String exibirNotas(){
        this.mostrarNotas = true;
        return "index";
    }


    public String esconderNotas(){
        this.mostrarNotas = false;
        return "index";
    }
    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public String executarRetorno(String param) {
        return "Quem é o lindão " + param;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

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
