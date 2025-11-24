package codigos.modulo01_basico.aula02_modicadores_acesso.exercicios;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login= login;
        this.senha = senha;

        System.out.println("Usuario "+this.login+" Criando com sucesso");
    }

    void logar(String senha, String login){
        if (this.senha.equals(senha) && this.login.equals(login)){
            System.out.println("Acesso concedido!");
        }
        else{
            System.out.println("Acesso Negado!");
        }
    }

    void trocarSenha(String senhaNova, String senhaAntiga){
        if (this.senha.equals(senhaAntiga)){
            this.senha = senhaNova;
            System.out.println(senhaAntiga + " trocada com sucesso para " + this.senha);
        }
        else{
            System.out.println("'Permissão NEGADA', Senha atual Incorreta");
        }
    }


}
