package br.edu.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data = LocalDate.now();

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Título: '" + super.getTitulo() + "\n" +
                "Descrição: '" + super.getDescricao() + "\n" +
                "Data: " + this.data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 80d;
    }
}
