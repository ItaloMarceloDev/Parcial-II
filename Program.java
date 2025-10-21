import java.util.Scanner;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastro c1 = new Cadastro("Italo", "123italo", "02035713445");
        Cadastro c2 = new Cadastro("", "", "");
        Cadastro c3 = new Cadastro("Italo", "italo1", "020abc134b5");

        System.out.println("Teste 1:");
        System.out.println(c1.validarNome(c1.getNome()));
        System.out.println(c1.validarSenha(c1.getSenha()));
        System.out.println(c1.validarCpf(c1.getCpf()));

        System.out.println("\nTeste 2:");
        System.out.println(c1.validarNome(c2.getNome()));
        System.out.println(c1.validarSenha(c2.getSenha()));
        System.out.println(c1.validarCpf(c2.getCpf()));

        System.out.println("\nTeste 3:");
        System.out.println(c1.validarNome(c3.getNome()));
        System.out.println(c1.validarSenha(c3.getSenha()));
        System.out.println(c1.validarCpf(c3.getCpf()));
    }
}
