package estudos2;

public enum Setor {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material Contrução"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimentício");
    
    private final String nome;
    
    //Construtor
    private Setor(String nome) {
        this.nome = nome;
    }
    
   //Getter

    public String getNome() {
        return nome;
    }
    
}
