package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Marco");
        a1.setIdade(45);

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());

        System.out.println("Olá Gradle!!!");
    }
}