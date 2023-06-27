package estudos2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Engenheiro eng = new Engenheiro("01245789", "092.865.400-19", "28.088.623-8", "778BA", SetorSec.OPERACOES, 3500, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 9), "Janderson Ferreira", "7894-5612", "jaderson@gmail.com", new Endereco("Residencial", "45g", "Casa", "47804-208", "Barreiras", UnidadeFederativa.BAHIA));
        Medico md = new Medico("3213123","953.605.820-06", "38.145.490-3", "23232FS", SetorSec.SAUDE, 6800, Genero.FEMININO, EstadoCivil.DIVORCIADO, LocalDate.of(1985, Month.MARCH, 10), "Fernanda Luiza", "7532-1598", "fernandinha@gmail.com", new Endereco("casa", "78S", "2 andares", "47802-608", "Barreiras", UnidadeFederativa.BAHIA));
        Motoboy motoBoy = new Motoboy("17901590605", "008.372.290-49", "46.755.532-1", "OAB23", SetorSec.OPERACOES, 3500, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1980, Month.DECEMBER, 13), "Luiz Fernandez", "7778-6669", "fernandes@gmail.com", new Endereco("Apartamento", "854A", "portao alumínio", "47801-190", "Brrs", UnidadeFederativa.BAHIA));
        Diretor diretor = new Diretor("863.433.930-05", "33.822.938-3", "8555OAB", SetorSec.JURIDICO, 5500, Genero.FEMININO, EstadoCivil.VIUVO, LocalDate.of(1995, Month.JUNE, 5), "Mariana Juilia", "1112-3336", "mariana@gmail.com", new Endereco("residencial", "85T", "casa", "47806-022", "Barreiras", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(diretor);
        System.out.println("");                
        diretor.admitir(md);
        System.out.println("");
        diretor.admitir(motoBoy);
        System.out.println("");
        diretor.admitir(eng);
        System.out.println("");
    }
    
           
}
