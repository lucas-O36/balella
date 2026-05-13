public class GestaoConsulta {
    
    // MÉTODO 1: Cancelamento Simples (Sem justificativa)
    // "Carla cancela às 08h uma consulta das 15h"
    public void cancelar(Consulta c, int horaAtual) {
        // Verifica se faltam menos de 2 horas
        if ((c.hora - horaAtual) < 2) {
            c.multa = 50.0;
            System.out.println("Cancelamento tardio! Multa de R$ 50,00 aplicada.");
        } else {
            System.out.println("Cancelado sem multa.");
        }
        
        c.status = "Cancelada"; // Atualiza o status da consulta
    }

    // MÉTODO 2: Cancelamento com Justificativa (Sobrecarga)
    // "Marcos cancela às 13h30 uma consulta das 15h com justificativa"
    public void cancelar(Consulta c, int horaAtual, String motivo) {
        c.justificativa = motivo; // Grava o motivo
        
        // Reutiliza a lógica do método acima para não repetir código
        this.cancelar(c, horaAtual); 
        
        System.out.println("Motivo registrado: " + motivo);
    }
}
