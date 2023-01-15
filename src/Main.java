import java.sql.SQLOutput;
import java.time.LocalDate;

import br.edu.dio.desafio.dominio.Bootcamp;
import br.edu.dio.desafio.dominio.Curso;
import br.edu.dio.desafio.dominio.Dev;
import br.edu.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setCargaHoraria(8);
        cursoJava.setDescricao("Curso ofertado pela DIO para aprender Java do zero");

        Curso cursoAngular = new Curso();
        cursoAngular.setTitulo("Curso de Angular");
        cursoAngular.setCargaHoraria(16);
        cursoAngular.setDescricao("Se você já conhece JS venha aprender mais sobre esse framework");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Mentoria para te guiar nos seus estudos Java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp OrangeTech Java Developer Backend");
        bootcamp.setDescricao("Se torne um backend developer Java com a trilha de estudos desse bootcamp");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoAngular);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredirBootcamp(cursoJava);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.getXpTotal());

        System.out.println("*******************************");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
        devPaulo.progredirBootcamp(cursoJava);
        devPaulo.progredirBootcamp(cursoAngular);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo:" + devPaulo.getConteudosConcluidos());
        System.out.println("XP:" + devPaulo.getXpTotal());


    }

}
