package estudos2;

public enum SetorSec {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    private final String texto;
    
    //Construtor

    private SetorSec(String texto) {
        this.texto = texto;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }
    
}
