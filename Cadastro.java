import java.util.regex.*;

public class Cadastro {
    private String nome;
    private String senha;
    private String cpf;

    public Cadastro(String nome, String senha, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String validarNome(String nome){
        if(nome != null && !(nome.length() <= 0)){
           return "Nome validado";
        }
        return "Nome Inválido.";
        
    }

    public String validarSenha(String email){
        if(email.length() >= 8 && email.matches("^[a-zA-Z0-9]+$")){
            return "Senha validada";
        }

        return "Senha Inválida";
    }

    public String validarCpf(String cpf){
        if(cpf.matches("^\\d{11}$")){
            return "Cpf no formato válido";
        }

        return "Cpf Inválido";
    }
}

