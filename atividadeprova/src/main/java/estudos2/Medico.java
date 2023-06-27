package estudos2;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crn;
    
    //Construtor
    public Medico(String crn, String cpf, String rg, String matricula, SetorSec setorSec, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setorSec, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crn = crn;
    }   

    //Getter e Setter
    public void setCrn(String crn) {
        this.crn = crn;
    }
    public String getCrn() {    
        return crn ;
    }

    //toString
    @Override
    public String toString() {
        return "Medico" + 
                super.toString() +
                "\n crn: " + crn ;
    }
    
    
    
}
