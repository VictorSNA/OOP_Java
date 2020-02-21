/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Prescription {
  private String consulta;
  private String data;
  private String descritivo;

  public Prescription() {
    this.consulta = "";
    this.data = "";
    this.descritivo = "";
  }

  public Prescription(String consulta, String data, String descritivo) {
    this.consulta = consulta;
    this.data = data;
    this.descritivo = descritivo;
  }

  public void mostrar(){
    System.out.println("consulta"+getConsulta());
    System.out.println("data"+getData());
    System.out.println("descritivo"+getDescritivo());
  }

  public void preescrever(){
    //todo
  }

  public void consultar(){
    //todo
  }

  /**
   * @return the consulta
   */
  public String getConsulta() {
    return consulta;
  }

  /**
   * @param consulta the consulta to set
   */
  public void setConsulta(String consulta) {
    this.consulta = consulta;
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
   * @return the descritivo
   */
  public String getDescritivo() {
    return descritivo;
  }

  /**
   * @param descritivo the descritivo to set
   */
  public void setDescritivo(String descritivo) {
    this.descritivo = descritivo;
  }
}
