package f_composicao;

public enum enum_nivel {
    
    JUNIOR(1),
    PLENO(2),
    SENIOR(3);

    private int codigo;

    enum_nivel(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static enum_nivel fromCodigo(int codigo) {
        for (enum_nivel nivel : enum_nivel.values()) {
            if (nivel.getCodigo() == codigo) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
