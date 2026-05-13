public class Consulta {
    public String paciente;
    public String profissional;
    public String data;
    public int hora;
    public String status;

    // Construtor usado para criar a nova consulta baseada na antiga
    public Consulta(String paciente, String profissional, String data, int hora) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
        this.hora = hora;
        this.status = "Agendada";
    }
}
