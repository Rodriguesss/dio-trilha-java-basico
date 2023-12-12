import lombok.Data;

import java.util.List;

@Data
public class Banco {
    public String nome;
    public List<Conta> contas;
}
