package estudos2;

import java.time.LocalDate;

public class PrestacaoServico extends Juridica{
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoIncio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoIncio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoIncio() {
        return contratoInicio;
    }

    public void setContratoIncio(LocalDate contratoIncio) {
        this.contratoInicio = contratoIncio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n Contrato Início: " + Util.formatarData(contratoInicio) + 
                "\n Contrato Fim: " + Util.formatarData(contratoFim) ;
    }
    
    
}
