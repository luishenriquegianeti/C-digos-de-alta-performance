package app;

import java.util.Calendar;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Marco");
        a1.setIdade(45);

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());

        System.out.println("Olá Gradle!!!");

        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Estruturas de Dados");
        t1.setConcluido(true);

        Tarefa t2 = t1;
        t2.setConcluido(false);

        System.out.println(t1.getDescricao());
        System.out.println(t1.isConcluido());

        Atividade[] objetos = new Atividade[3];

        Calendar c = Calendar.getInstance();
        c.set(2025, 8, 28);

        objetos[0] = new Compromisso("Novo Compromisso",c ,c);
        objetos[1] = new Tarefa("Nova Tarefa" , true);

        System.out.println(objetos[0].getDetalhes());
        System.out.println(objetos[1].getDetalhes());
    }
}