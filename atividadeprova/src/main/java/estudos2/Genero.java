package estudos2;

public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private final String texto;
    private final char caracter;

    //Contrutor
    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    //Getter
    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
     
    
}
