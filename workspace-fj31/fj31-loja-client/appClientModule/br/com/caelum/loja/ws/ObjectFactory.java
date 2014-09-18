
package br.com.caelum.loja.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.loja.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaPorNome_QNAME = new QName("http://session.loja.caelum.com.br/", "ConsultaPorNome");
    private final static QName _ConsultaPorNomeResponse_QNAME = new QName("http://session.loja.caelum.com.br/", "ConsultaPorNomeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.loja.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPorNome }
     * 
     */
    public ConsultaPorNome createConsultaPorNome() {
        return new ConsultaPorNome();
    }

    /**
     * Create an instance of {@link ConsultaPorNomeResponse }
     * 
     */
    public ConsultaPorNomeResponse createConsultaPorNomeResponse() {
        return new ConsultaPorNomeResponse();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPorNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.loja.caelum.com.br/", name = "ConsultaPorNome")
    public JAXBElement<ConsultaPorNome> createConsultaPorNome(ConsultaPorNome value) {
        return new JAXBElement<ConsultaPorNome>(_ConsultaPorNome_QNAME, ConsultaPorNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPorNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.loja.caelum.com.br/", name = "ConsultaPorNomeResponse")
    public JAXBElement<ConsultaPorNomeResponse> createConsultaPorNomeResponse(ConsultaPorNomeResponse value) {
        return new JAXBElement<ConsultaPorNomeResponse>(_ConsultaPorNomeResponse_QNAME, ConsultaPorNomeResponse.class, null, value);
    }

}
