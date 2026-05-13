public class Paciente {
    public String nome;
    public String cpf;
    public int idade;
    public String telefone;
    public boolean ativo; // true = pode agendar, false = bloqueado

    // Construtor 1: Cadastro rápido (Exemplo do João e Lucas)
    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.ativo = true; // Todo paciente novo começa ativo
    }

    // Construtor 2: Cadastro completo (Exemplo da Maria e Pedro)
    public Paciente(String nome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.ativo = true;
    }
}
