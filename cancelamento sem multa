public class Consulta {
    public String paciente;
    public String profissional;
    public String data;
    public int hora; // Vamos usar apenas a hora cheia (ex: 15 para 15h00)
    public String status; // "Agendada", "Realizada", "Cancelada", "Remarcada"
    public double multa;
    public String justificativa;

    // Construtor 1: Cadastro padrão (Assume status "Agendada" e sem multa)
    public Consulta(String paciente, String profissional, String data, int hora) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
        this.hora = hora;
        this.status = "Agendada";
        this.multa = 0.0;
        this.justificativa = "Nenhuma";
    }

    // Construtor 2: Se precisarmos criar uma consulta já com justificativa (Sobrecarga)
    public Consulta(String paciente, String profissional, String data, int hora, String justificativa) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
        this.hora = hora;
        this.status = "Agendada";
        this.multa = 0.0;
        this.justificativa = justificativa;
    }
}
