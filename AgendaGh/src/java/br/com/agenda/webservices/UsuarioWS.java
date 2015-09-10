/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.webservices;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.model.Contatos;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos
 */
@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarContacto")
    public List<Contatos> ConsultarContacto() {
        ContatosDao contatoDao = new ContatosDao();
        List<Contatos> listaContatos = contatoDao.lista();
        return listaContatos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarContacto")
    public String IngresarContacto(@WebParam(name = "contatos") Object contatos) {
        //TODO write your implementation code here:
       //Contatos p = new Contatos(contatos);
        //ContatosDao contatosDao = new ContatosDao();
       // contatosDao.salvar(p);
        return "Producto ingresado";

       
    }
    
    @WebMethod(operationName = "IngresarContacto2")
    public String IngresarContacto2(@WebParam(name = "nombre") String nombre, @WebParam(name = "email") String email, @WebParam(name = "telefono") String telefono, @WebParam(name = "celular") String celular)  {
        //TODO write your implementation code here:
        //Contatos cont = new Contatos(nombre,email,telefono,celular);
        ContatosDao contatosDao = new ContatosDao();
        //contatosDao.salvar(cont);
        return "Producto ingresado";

       
    }
    
}
