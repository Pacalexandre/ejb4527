
package br.com.caelum.loja.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConsultaLivrosBean", targetNamespace = "http://session.loja.caelum.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultaLivrosBean {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<br.com.caelum.loja.ws.Livro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaLivro", targetNamespace = "http://session.loja.caelum.com.br/", className = "br.com.caelum.loja.ws.BuscaLivro")
    @ResponseWrapper(localName = "buscaLivroResponse", targetNamespace = "http://session.loja.caelum.com.br/", className = "br.com.caelum.loja.ws.BuscaLivroResponse")
    public List<Livro> buscaLivro(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
