package br.edu.dio.desafio.dominio;

public class Curso  extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "Titulo: '" + super.getTitulo() + "\n" +
                "Descrição: '" + super.getDescricao() + "\n" +
                "Carga Horária: " + cargaHoraria + " horas" +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
