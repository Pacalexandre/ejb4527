
package br.com.caelum.loja.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaPorNomeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaPorNomeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Livros" type="{http://session.loja.caelum.com.br/}livro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPorNomeResponse", propOrder = {
    "livros"
})
public class ConsultaPorNomeResponse {

    @XmlElement(name = "Livros")
    protected List<Livro> livros;

    /**
     * Gets the value of the livros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Livro }
     * 
     * 
     */
    public List<Livro> getLivros() {
        if (livros == null) {
            livros = new ArrayList<Livro>();
        }
        return this.livros;
    }

}
