package codigos.modulo01_basico.aula02_modicadores_acesso;

    public class ContaBancaria {
        public String titular;
        private double saldo;

        public ContaBancaria(String titular){
            this.titular = titular;
            this.saldo = 0;
        }

        void depositar(int valor){
            if (valor >= 0){
                this.saldo += valor;
                System.out.println(valor + " Foi inserido na sua conta, Deposito realizado com SUCESSO");
            }
            else{
                System.out.println("Valores negativos não são permitidos, deposito NÃO! realizado");
            }
        }
        
        void sacar(int valor){
            if (valor >= 0 && this.saldo >= valor){
                this.saldo -= valor;
                System.out.println(valor + " Foi removido da sua conta, Saque realizado com SUCESSO!");
            }
            else if (valor <= 0 && this.saldo >= valor){
                System.out.println("Não foi possivel sacar, valor solicitado é negativo, insira um valor POSITIVO");
            }
            else if (valor >= 0 && this.saldo <= valor){
                System.out.println("Não foi possivel sacar, saldo da conta INSUFICIENTE");
            }
            else{
                System.out.println("Não foi possivel sacar, saldo INSUFICIENTE e valor solicitado NEGATIVO");
            }
        }

        void exibirDetalhes(){
            System.out.println("Nome: " + this.titular + " Saldo: " + this.saldo);
        }
    }