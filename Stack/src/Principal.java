/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
   * @InterfazGrafica.java  1.0 06/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 Estructura de Datos
   * Autor: Alejandro Carné: 13082
   *		Ricardo Franco Carné: 13261
   *		Kuk Ho Chung Carné: 13279
   * Stack: saca y guarda datos en la pila
   *
   */
public class Principal{
  public static void main(String[] args) {
    Stack<Integer> miStack = new StackVector<Integer>();
        miStack.push(1);  //1
	miStack.push(2);   //2
      

        int cadena = miStack.pop();
        System.out.println(cadena);	
        int cadena1=miStack.pop();
        System.out.println(cadena1);
  }
}