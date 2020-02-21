/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorn
 */
public class Pacient {
  private String nome;
  private String cpf;
  private String telefone;
  private char genero;
  private int idade;

  public Pacient() {
    this.nome = "";
    this.cpf = "";
    this.telefone = "";
    this.genero = 'm';
    this.idade = 0;
  }

  public Pacient(String nome, String cpf, String telefone,
               char genero, int idade) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.genero = genero;
    this.idade = idade;
  }

  public void mostrar(){
    System.out.println("nome"+getNome());
    System.out.println("cpf"+getCpf());
    System.out.println("telefone"+getTelefone());
    System.out.println("genero"+getGenero());
    System.out.println("idade"+getIdade());
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
   * @return the genero
   */
  public char getGenero() {
    return genero;
  }

  /**
   * @param genero the genero to set
   */
  public void setGenero(char genero) {
    this.genero = genero;
  }

  /**
   * @return the idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }
}
