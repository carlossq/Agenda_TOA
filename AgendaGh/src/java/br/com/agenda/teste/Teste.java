/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.teste;

import br.com.agenda.model.Contatos;
import br.com.agenda.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Carlos
 */
public class Teste {
    public static void main(String[] args){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        Contatos contato = new Contatos();
        contato.setNome(JOptionPane.showInputDialog("INGRESE NOMBRE"));
        contato.setEmail(JOptionPane.showInputDialog("INGRESE EMAIL"));
        contato.setTelefone(JOptionPane.showInputDialog("INGRESE TELEFONO"));
        contato.setCelular(JOptionPane.showInputDialog("INGRESE CELULAR"));
        
        session.save(contato);
        t.commit();
        //name = JOptionPane.showInputDialog(frame, "What's your name?");
    }
}

