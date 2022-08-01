package br.com.dio.desafio.dominion;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso c++");
        curso2.setDescricao("descrição curso c++");
        curso2.setCargaHoraria(6);




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas:" + devLucas.getConteudoInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Lucas:" + devLucas.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Joao:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Joao:" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}
