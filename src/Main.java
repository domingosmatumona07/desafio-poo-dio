import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatumona = new Dev();
        devMatumona.setNome("Matumona");
        devMatumona.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Matumona " + devMatumona.getConteudosInscritos());

        devMatumona.progredir();
        devMatumona.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Matumona " + devMatumona.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Matumona " + devMatumona.getConteudosConcluidos());
        System.out.println("XP: " + devMatumona.calcularXp());

        System.out.println("-----------------");

        Dev devSuzana = new Dev();
        devSuzana.setNome("Suzana");
        devSuzana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Suzana " + devSuzana.getConteudosInscritos());

        devSuzana.progredir();
        devSuzana.progredir();
        devSuzana.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Suzana " + devSuzana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Suzana " + devSuzana.getConteudosConcluidos());
        System.out.println("XP: " + devSuzana.calcularXp());
    }
}
