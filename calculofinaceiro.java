public class CalculadoraFinanceira {

    // MÉTODO 1: Cálculo simples (Valor cheio)
    public double calcular(double valorBase) {
        return valorBase;
    }

    // MÉTODO 2: Cálculo com Desconto de Retorno e Convênio (Sobrecarga)
    public double calcular(double valorBase, boolean ehRetorno, boolean temConvenio) {
        double descontoRetorno = 0;
        double coberturaConvenio = 0;

        if (ehRetorno) {
            descontoRetorno = valorBase * 0.20; // 20% de desconto
        }
        if (temConvenio) {
            coberturaConvenio = valorBase * 0.40; // Convênio cobre 40%
        }

        double total = valorBase - descontoRetorno - coberturaConvenio;
        
        if (total < 0) return 0; // Regra: valor nunca fica negativo
        return total;
    }

    // MÉTODO 3: Cálculo completo (Descontos + Multas pendentes) (Sobrecarga)
    public double calcular(double valorBase, boolean ehRetorno, boolean temConvenio, double multa) {
        // Chama o método anterior para pegar o valor com descontos
        double valorComDescontos = this.calcular(valorBase, ehRetorno, temConvenio);
        
        return valorComDescontos + multa; // Soma a multa de R$ 50 se houver
    }
}
