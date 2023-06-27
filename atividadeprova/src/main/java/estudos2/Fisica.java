package estudos2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa{
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    //Construtor
    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    //Getter e Setter
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    //Idade
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n Gênero: " + genero + 
                "\n Estado Civil: " + estadoCivil + 
                "\n Data Nascimento: " + Util.formatarData(dataNascimento)+
                "\n Idade: " + getIdade();  
    }
    
    
}
