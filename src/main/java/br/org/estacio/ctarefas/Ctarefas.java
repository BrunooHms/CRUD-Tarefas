/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.org.estacio.ctarefas;

import br.org.estacio.ctarefas.view.FrmMain;

/**
 *
 * @author bruno
 */
public class Ctarefas {

    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
}
