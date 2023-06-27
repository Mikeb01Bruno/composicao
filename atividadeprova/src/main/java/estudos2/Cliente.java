package estudos2;

import java.time.LocalDate;

public class Cliente extends Fisica{
 private int protocoloAtendimento;

 //Construtor
    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
 
 //Getter e Setter

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }


 //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
  
 
}
