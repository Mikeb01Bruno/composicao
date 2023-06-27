package estudos2;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    protected double PREMIO = 0.2;
    
    //Construtor

    public Diretor(String cpf, String rg, String matricula, SetorSec setorSec, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setorSec, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

   
    
    //Getter e Setter

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }
    
    //Demitir e Contratar

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.toString());
    }
    
    //Salário Final
    
    @Override
    public double getSalarioFinal(){
        return salario + (salario * this.PREMIO);
    }
    
    //toString

    @Override
    public String toString() {
        return "Diretor" + 
                super.toString() +
               "\n Prêmio: " + PREMIO +
               "\n Salário Final: " + Util.formatarBr1(getSalarioFinal());
    }
    
}
