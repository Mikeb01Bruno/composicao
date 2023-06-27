package estudos2;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;
    
    //Construtor

    public Motoboy(String carteiraDeHabilitacao, String cpf, String rg, String matricula, SetorSec setorSec, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setorSec, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
        
    //Getter e Setter

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
        
    //toString

    @Override
    public String toString() {
        return "Motoboy " + 
                super.toString() +
                "\n Carteira De Habilitacão: " + carteiraDeHabilitacao;
    }
    
            
            
}
