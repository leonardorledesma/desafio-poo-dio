import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição de Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev dev1 = new Dev();
        String nome;


        System.out.println("Deseja realizar seu cadastro na plataforma? (s/n)");
        char resposta =sc.next().charAt(0);
        if (resposta == 's'){
            System.out.println("Digite seu nome: ");
            nome = sc.next();
            dev1.setNome(nome);
            System.out.println("Deseja se inscrever no Boobtcamp? (s/n)");
            char resposta1 = sc.next().charAt(0);

            if(resposta1 =='s'){
                dev1.inscreverBootcamp(bootcamp);
                System.out.println("Conteudos inscritos de Leonardo: " + dev1.getConteudosInscritos());

                System.out.println("Curso concluido? ");
                char resposta2 = sc.next().charAt(0);

                if(resposta2 == 's') {
                    dev1.progredir();
                    System.out.println("Conteudos inscritos de Leonardo: " + dev1.getConteudosInscritos());
                    System.out.println("Conteudos concluidos de Leonardo: " + dev1.getConteudosConcluidos());
                    System.out.println("Xp total: " + dev1.calcularTotalXp());
                }else {
                    System.out.println("Conteudos inscritos de Leonardo: " + dev1.getConteudosInscritos());
                    System.out.println("Conteudos concluidos de Leonardo: " + dev1.getConteudosConcluidos());
                    System.out.println("Xp total: " + dev1.calcularTotalXp());}

            }else System.out.println("Dev não inscrito no Bootcamp!!");

        }else System.out.println("Cadastramento cancelado!");





    }
}
