import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develeper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWalter = new Dev();
        devWalter.setNome("Walter");
        devWalter.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Walter:" + devWalter.getConteudosInscritos());
        devWalter.progredir();
        devWalter.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Walter:" + devWalter.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Walter:" + devWalter.getConteudosConcluidos());
        System.out.println("XP:" + devWalter.calcularTotalXp());

        System.out.println("-----------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devWalter.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}
