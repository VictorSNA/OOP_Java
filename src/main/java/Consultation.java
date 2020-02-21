/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Consultation {
  private String data;
  private String hora;
  private String medico;
  private String paciente;
  private String motivo;
  private String historico;
  
  public Consultation() {
    this.data = "";
    this.hora = "";
    this.medico = "";
    this.paciente = "";
    this.motivo = "";
    this.historico = "";
  }

    public Consultation(String data, String hora, String medico,
                        String paciente, String motivo, String historico) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
    this.motivo = motivo;
    this.historico = historico;
  }

  public void mostrar(){
    System.out.println("data"+getData());
    System.out.println("hora"+getHora());
    System.out.println("medico"+getMedico());
    System.out.println("paciente"+getPaciente());
    System.out.println("motivo"+getMotivo());
    System.out.println("historico"+getHistorico());
  }

  public void acessar(){
    //todo
  }

  public void marcar(){
    //todo
  }

  public void cancelar(){
    //todo
  }

  public void consultar(){
    //todo
  }

  public void realizar(){
    //todo
  }

  public void atualizar(){
    //todo
  }

  /**
   * @return the data
   */
  public String getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(String data) {
    this.data = data;
  }

  /**
   * @return the hora
   */
  public String getHora() {
    return hora;
  }

  /**
   * @param hora the hora to set
   */
  public void setHora(String hora) {
    this.hora = hora;
  }

  /**
   * @return the medico
   */
  public String getMedico() {
    return medico;
  }

  /**
   * @param medico the medico to set
   */
  public void setMedico(String medico) {
    this.medico = medico;
  }

  /**
   * @return the paciente
   */
  public String getPaciente() {
    return paciente;
  }

  /**
   * @param paciente the paciente to set
   */
  public void setPaciente(String paciente) {
    this.paciente = paciente;
  }

  /**
   * @return the motivo
   */
  public String getMotivo() {
    return motivo;
  }

  /**
   * @param motivo the motivo to set
   */
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   * @return the historico
   */
  public String getHistorico() {
    return historico;
  }

  /**
   * @param historico the historico to set
   */
  public void setHistorico(String historico) {
    this.historico = historico;
  }
}
