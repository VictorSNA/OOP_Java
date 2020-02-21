/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Pacient maria = new Pacient();
    maria.nome = "maria";
    maria.cpf = "000000000-00";
    maria.telefone = "20003000";
    maria.genero = 'F';
    maria.idade = 20;
    maria.mostrar();

    Medic joao = new Medic();
    joao.nome = "joao";
    joao.crm = "000000000-00";
    joao.telefone = "20003000";
    joao.especialidade = "Geriatria";
    joao.senha = "abacaxi";
    joao.mostrar();

    Receptionist ana = new Receptionist();
    ana.nome = "ana";
    ana.cpf = "000000000-00";
    ana.telefone = "99999999";
    ana.senha = "banana";
    ana.mostrar();

    Schedule marcos = new Schedule();
    marcos.data = "10/03/2020";
    marcos.hora = "14";
    marcos.medico = "Joana";
    marcos.paciente = "Marcos";
    marcos.mostrar();

    Consultation pediatra = new Consultation();
    pediatra.data = "12/03/2020";
    pediatra.hora = "14";
    pediatra.medico = "Joana";
    pediatra.paciente = "Marcos";
    pediatra.motivo = "Consulta mensal";
    pediatra.historico = "Sem Historico";
    pediatra.mostrar();

    Prescription receita = new Prescription();
    receita.consulta = "Pediatra";
    receita.data = "11/04/2020";
    receita.descritivo = "Colic Kids 5 gotas/dia";
    receita.mostrar();

    Exam exame = new Exam();
    exame.consulta = "Gastro";
    exame.data = "11/04/2020";
    exame.descritivo = "Endoscopia Digestiva Alta";
    exame.mostrar();
  }
}
