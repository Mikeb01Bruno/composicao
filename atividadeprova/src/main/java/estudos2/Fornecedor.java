package estudos2;

public class Fornecedor extends Juridica{
    private Setor setor;
    private Produto produto;

    public Fornecedor(Setor setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }
    
    
}
