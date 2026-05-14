public class Consulta {
    // Mantendo todas as variáveis da primeira versão
    public String paciente;
    public String profissional;
    public String data;
    public int hora; 
    public String status; 
    public double multa;
    public String justificativa;

    // Construtor 1: Estilo simplificado (usando p, prof, d, h como na segunda)
    public Consulta(String p, String prof, String d, int h) {
        this.paciente = p;
        this.profissional = prof;
        this.data = d;
        this.hora = h;
        this.status = "Agendada";
        this.multa = 0.0;
        this.justificativa = "Nenhuma";
    }

    // Construtor 2: Sobrecarga para incluir justificativa
    public Consulta(String p, String prof, String d, int h, String j) {
        this.paciente = p;
        this.profissional = prof;
        this.data = d;
        this.hora = h;
        this.status = "Agendada";
        this.multa = 0.0;
        this.justificativa = j;
    }

    // Adicionando a função da segunda versão sem mudar a lógica
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
