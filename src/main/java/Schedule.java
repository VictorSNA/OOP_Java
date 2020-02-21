/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Schedule {
  private String data;
  private String hora;
  private String medico;
  private String paciente;

  public Schedule() {
    this.data = "";
    this.hora = "";
    this.medico = "";
    this.paciente = "";
  }

  public Schedule(String data, String hora, String medico, String paciente) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
  }

  public void mostrar(){
    System.out.println("data"+getData());
    System.out.println("medico"+getHora());
    System.out.println("paciente"+getMedico());
    System.out.println("idade"+getPaciente());
  }

  public void consultar(){
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
}
