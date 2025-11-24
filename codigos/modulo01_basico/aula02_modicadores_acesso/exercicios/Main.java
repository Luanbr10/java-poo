package codigos.modulo01_basico.aula02_modicadores_acesso.exercicios;

public class Main {
    public static void main(String args[]){
        Usuario novoUsuario = new Usuario("luan", "1234");

        //novoUsuario.senha = "luan1234"; IMPOSSÍVEL, comentei que não é permitido, apenas para deixar evidente aqui. (E para me lembrar)
        novoUsuario.logar("4321", "naul");
        novoUsuario.logar("1234", "luan");

        novoUsuario.trocarSenha("admin1234", "4321");
        novoUsuario.trocarSenha("admin1234", "1234");

        novoUsuario.logar("1234", "luan"); // Troquei a senha acima, vai dar erro.

        
    }
}
