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
  public String nome;
  public String cpf;
  public String telefone;
  public char genero;
  public int idade;
  
  public void mostrar(){
    System.out.println("nome"+nome);
    System.out.println("cpf"+cpf);
    System.out.println("telefone"+telefone);
    System.out.println("genero"+genero);
    System.out.println("idade"+idade);

  }
}
