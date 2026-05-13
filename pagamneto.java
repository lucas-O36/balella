public class Pagamento {
    public String paciente;
    public double valorFinal;
    public int parcelas;
    public String tipo; // "Dinheiro", "Cartão" ou "Convênio"

    // Construtor 1: Pagamento à vista ou Convênio (Sobrecarga)
    public Pagamento(String paciente, double valor, String tipo) {
        this.paciente = paciente;
        this.valorFinal = valor;
        this.tipo = tipo;
        this.parcelas = 1;
    }

    // Construtor 2: Pagamento parcelado no Cartão (Sobrecarga)
    public Pagamento(String paciente, double valor, int parcelas) {
        this.paciente = paciente;
        this.valorFinal = valor;
        this.tipo = "Cartão";
        this.parcelas = parcelas;
    }
}
