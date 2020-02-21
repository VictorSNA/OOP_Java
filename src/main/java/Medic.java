/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Medic {
  private String nome;
  private String crm;
  private String telefone;
  private String especialidade;
  private String senha;
  
  public Medic() {
    this.nome = "";
    this.crm = "";
    this.telefone = "";
    this.especialidade = "";
    this.senha = "";
  }

  public Medic(String nome, String crm, String telefone,
               String especialidade, String senha) {
    this.nome = nome;
    this.crm = crm;
    this.telefone = telefone;
    this.especialidade = especialidade;
    this.senha = senha;
  }

  public void mostrar(){
    System.out.println("nome"+getNome());
    System.out.println("crm"+getCrm());
    System.out.println("telefone"+getTelefone());
    System.out.println("especialidade"+getEspecialidade());
    System.out.println("senha"+getSenha());
  }

  public void acessar(){
    //todo
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the crm
   */
  public String getCrm() {
    return crm;
  }

  /**
   * @param crm the crm to set
   */
  public void setCrm(String crm) {
    this.crm = crm;
  }

  /**
   * @return the telefone
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone the telefone to set
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return the especialidade
   */
  public String getEspecialidade() {
    return especialidade;
  }

  /**
   * @param especialidade the especialidade to set
   */
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  /**
   * @return the senha
   */
  public String getSenha() {
    return senha;
  }

  /**
   * @param senha the senha to set
   */
  public void setSenha(String senha) {
    this.senha = senha;
  }
}
