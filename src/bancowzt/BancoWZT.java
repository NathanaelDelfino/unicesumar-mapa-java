/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancowzt;
import java.util.Scanner;
import javax.swing.*;
import bancowzt.Telas.Tela;
/**
 *
 * @author natha
 */
public class BancoWZT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tela tela = new Tela();
       tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       tela.pack();
       tela.setLocationRelativeTo(null);
       tela.setTitle("Analise de Crédito");
       tela.setVisible(true);
    }
    
}
