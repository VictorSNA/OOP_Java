/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Receptionist {
  private String nome;
  private String cpf;
  private String telefone;
  private String senha;

  public Receptionist() {
    this.nome = "";
    this.cpf = "";
    this.telefone = "";
    this.senha = "";
  }

  public Receptionist(String nome, String cpf, String telefone, String senha) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.senha = senha;
  }

  public void mostrar(){
    System.out.println("nome"+getNome());
    System.out.println("cpf"+getCpf());
    System.out.println("telefone"+getTelefone());
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
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
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
