public class Main {
    public static void main(String[] args) {
        Sorvete sorvete = new Sorvete.Builder("Baunilha", "Chocolate")
                .acompanhamento("Waffer")
                .acompanhamento2("Brigadeiro")
                .build();
        sorvete.exibirSorvete();
    }
}