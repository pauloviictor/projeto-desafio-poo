package br.edu.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    private double xpTotal;

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredirBootcamp(Conteudo conteudo){
        boolean conteudoInscrito = this.conteudosInscritos.contains(conteudo);
        if(conteudoInscrito){
            this.conteudosConcluidos.add(conteudo);
            this.conteudosInscritos.remove(conteudo);
            xpTotal += adicionarXp(conteudo);
        }
    }

    private double adicionarXp(Conteudo conteudo){
        if(this.conteudosInscritos.isEmpty()) System.out.println("Parabéns por concluir o Bootcamp!");
        return conteudo.calcularXp();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public double getXpTotal() {
        return xpTotal;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome +
                "\nConteudos Inscritos: " + conteudosInscritos +
                "\nConteudos Concluidos: " + conteudosConcluidos +
                "\nxpTotal=" + xpTotal + "xp" +
                '}';
    }
}
