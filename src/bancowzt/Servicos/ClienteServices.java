package bancowzt.Servicos;
import static bancowzt.Compartilhada.Valores.FormataValor;
import bancowzt.Entidades.Cliente;

public class ClienteServices {
   public static double AnalisarCredito(Cliente cliente) throws Exception {
        if (cliente.getIdade() < 18) {
            throw new Exception("Idade insuficiente para realizar o empréstimo");
        }
        if (cliente.getScore() < 100) {
            throw new Exception("Não é possível receber emprestimo com o seu score!");
        }
        
        if (cliente.getIdade() >= 18 && cliente.getIdade() <= 25) {
            if (cliente.getScore() <= 300) {
                throw new Exception("Não é possível receber emprestimo com o seu score!");
            }
        }

        if (cliente.getScore() >= 100 && cliente.getScore() <= 500) {
            return FormataValor(cliente.getRenda() * 6,2);
        }

        if (cliente.getScore() > 500) {
            return FormataValor(cliente.getRenda() * 12,2);
        }
        return 0;
    }

}
