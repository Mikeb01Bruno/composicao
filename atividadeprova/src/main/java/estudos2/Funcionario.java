package estudos2;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica implements SalarioFinal{
    protected String cpf;
   protected String rg;
   protected String matricula;
   protected SetorSec setorSec;
   protected double salario;
    
   
   //Construtor

    public Funcionario(String cpf, String rg, String matricula, SetorSec setorSec, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setorSec = setorSec;
        this.salario = salario;
    }
   
    //Getter e Setter

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public SetorSec getSetorSec() {
        return setorSec;
    }

    public void setSetorSec(SetorSec setorSec) {
        this.setorSec = setorSec;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Salário Final
    @Override
    public double getSalarioFinal() {
        return salario;
    }
    
    //toString
    @Override
    public String toString() {
        return  super.toString() +
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Matrícula: " + matricula + 
                "\n Setor: " + setorSec + 
                "\n Salário: " + Util.formatarBr1(salario) ;
                
    }

}
