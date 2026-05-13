public class Agenda {
    // Array fixo para armazenar todas as consultas da clínica
    public Consulta[] listaDeConsultas = new Consulta[500];
    public int totalConsultas = 0;

    // MÉTODO 1: Remarcar apenas o HORÁRIO (Mantém o mesmo dia)
    // Exemplo da Sofia: "Mudar das 10h para as 14h do mesmo dia"
    public void remarcar(Consulta antiga, int novaHora) {
        // 1. Verifica se o médico está livre nesse horário (Repetição)
        if (estaLivre(antiga.profissional, antiga.data, novaHora)) {
            
            // 2. Marca a antiga como "Remarcada"
            antiga.status = "Remarcada";
            
            // 3. Cria a nova consulta no array usando o contador
            listaDeConsultas[totalConsultas] = new Consulta(antiga.paciente, antiga.profissional, antiga.data, novaHora);
            totalConsultas++;
            
            System.out.println("Sucesso: Horário alterado para " + novaHora + "h.");
        } else {
            System.out.println("Erro: Médico já possui compromisso neste horário.");
        }
    }

    // MÉTODO 2: Remarcar DATA e HORÁRIO (Sobrecarga)
    // Exemplo do Antônio: "Mudar de quarta para sexta às 09h"
    public void remarcar(Consulta antiga, String novaData, int novaHora) {
        // Mesma lógica, mas validando a nova data
        if (estaLivre(antiga.profissional, novaData, novaHora)) {
            
            antiga.status = "Remarcada";
            
            listaDeConsultas[totalConsultas] = new Consulta(antiga.paciente, antiga.profissional, novaData, novaHora);
            totalConsultas++;
            
            System.out.println("Sucesso: Consulta movida para o dia " + novaData);
        } else {
            System.out.println("Erro: Médico indisponível nesta nova data/horário.");
        }
    }

    // Função auxiliar para varrer o array (Regra de Repetição)
    public boolean estaLivre(String medico, String data, int hora) {
        for (int i = 0; i < totalConsultas; i++) {
            // Regra 5: Comparar Strings com .equals()
            if (listaDeConsultas[i].profissional.equals(medico) && 
                listaDeConsultas[i].data.equals(data) && 
                listaDeConsultas[i].hora == hora && 
                listaDeConsultas[i].status.equals("Agendada")) {
                return false; // Encontrou um conflito!
            }
        }
        return true; // Horário vago
    }
}
