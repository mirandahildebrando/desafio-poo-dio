import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        

        //System.out.println(curso1);
        //System.out.println(curso2);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");  
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

      Dev devBrando = new Dev();
      devBrando.setNome("Brando");
      devBrando.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Brando: " + devBrando.getConteudosInscritos());
      devBrando.progredir();
      System.out.println("-");
      System.out.println("Conteudos Inscritos Brando: " + devBrando.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Brando: " + devBrando.getConteudosConcluidos());
      System.out.println("XP: " + devBrando.calcularTotalXp());

      System.out.println("------");


      Dev devNathalia = new Dev();
      devBrando.setNome("Nathalia");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nathalia: " + devNathalia.getConteudosInscritos());
        devNathalia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Nathalia: " + devNathalia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nathalia: " + devBrando.getConteudosConcluidos());
         System.out.println("XP: " + devNathalia.calcularTotalXp());




    }




}
