import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso sobre a linguagem Java");
        cursoJava.setCargaHoraria(100);

        Curso cursoGo = new Curso();
        cursoGo.setTitulo("Curso GO");
        cursoGo.setDescricao("Curso sobre a linguagem GO");
        cursoGo.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para linguagem Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoGo);
        bootcamp.getConteudos().add(mentoria);

        Dev devJennifer  = new Dev();
        devJennifer.setNome("Jennifer");
        devJennifer.inscrever(bootcamp);
        System.out.println("Conteúdos inscritos Jennifer: " + devJennifer.getConteudosInscritos());
        devJennifer.progredir();
        devJennifer.progredir();
        System.out.println("XP: " + devJennifer.calcularTotalXP());
        System.out.println("Conteúdos concluidos Jennifer: " + devJennifer.getConteudosConcluidos());


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscrever(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("XP: " + devMaria.calcularTotalXP());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
    }
}
