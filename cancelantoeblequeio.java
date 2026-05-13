public class Secretaria {

    // Método para desativar o paciente (Exemplo do Lucas)
    public void desativarPaciente(Paciente p) {
        p.ativo = false;
        System.out.println("Paciente " + p.nome + " foi desativado do sistema.");
    }

    // Método de Agendamento com a trava de segurança (Estrutura de Decisão)
    public void agendarConsulta(Paciente p, String medico, String data, int hora) {
        
        // REGRA DE OURO: Verifica se o paciente está ativo
        if (p.ativo == false) {
            System.out.println("ERRO: O paciente " + p.nome + " está INATIVO. Não é permitido agendar.");
            return; // O 'return' encerra o método aqui mesmo e não agenda nada
        }

        // Se passar pelo IF acima, o sistema segue com o agendamento normal
        System.out.println("Consulta agendada com sucesso para " + p.nome);
        // (Aqui entraria a lógica de salvar no array de consultas que vimos na questão 2)
    }
}
