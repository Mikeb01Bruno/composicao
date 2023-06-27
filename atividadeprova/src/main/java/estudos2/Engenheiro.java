package estudos2;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;
    
    //Construtor

    public Engenheiro(String crea, String cpf, String rg, String matricula, SetorSec setorSec, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setorSec, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }
    
    //Getter e Setter

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "\n CREA: " + crea;
    }
    
}
