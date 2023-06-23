public class Sorvete {
    private String sabor;
    private String cobertura;
    private String acompanhamento;
    private String acompanhamento2;

    private Sorvete(Builder builder) {
        this.sabor = builder.sabor;
        this.cobertura = builder.cobertura;
        this.acompanhamento = builder.acompanhamento;
        this.acompanhamento2 = builder.acompanhamento2;
    }
    public void exibirSorvete(){
        System.out.println( this.sabor + " " + this.cobertura + " " + this.acompanhamento + " " + this.acompanhamento2 );
    }
    public static class Builder {
        private String sabor;
        private String cobertura;
        private String acompanhamento;
        private String acompanhamento2;

        public Builder(String sabor, String cobertura) {
            this.sabor = sabor;
            this.cobertura = cobertura;
        }

        public Builder acompanhamento(String acompanhamento) {
            this.acompanhamento = acompanhamento;
            return this;
        }

        public Builder acompanhamento2(String acompanhamento2) {
            this.acompanhamento2 = acompanhamento2;
            return this;
        }

        public Sorvete build() {
            return new Sorvete(this);
        }
    }

}