/**
 * Livro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.loja.session;

public class Livro  implements java.io.Serializable {
    private br.com.caelum.loja.session.Autor[] autores;

    private java.lang.Long id;

    private java.lang.String nome;

    private double preco;

    public Livro() {
    }

    public Livro(
           br.com.caelum.loja.session.Autor[] autores,
           java.lang.Long id,
           java.lang.String nome,
           double preco) {
           this.autores = autores;
           this.id = id;
           this.nome = nome;
           this.preco = preco;
    }


    /**
     * Gets the autores value for this Livro.
     * 
     * @return autores
     */
    public br.com.caelum.loja.session.Autor[] getAutores() {
        return autores;
    }


    /**
     * Sets the autores value for this Livro.
     * 
     * @param autores
     */
    public void setAutores(br.com.caelum.loja.session.Autor[] autores) {
        this.autores = autores;
    }

    public br.com.caelum.loja.session.Autor getAutores(int i) {
        return this.autores[i];
    }

    public void setAutores(int i, br.com.caelum.loja.session.Autor _value) {
        this.autores[i] = _value;
    }


    /**
     * Gets the id value for this Livro.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Livro.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this Livro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Livro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the preco value for this Livro.
     * 
     * @return preco
     */
    public double getPreco() {
        return preco;
    }


    /**
     * Sets the preco value for this Livro.
     * 
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livro)) return false;
        Livro other = (Livro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autores==null && other.getAutores()==null) || 
             (this.autores!=null &&
              java.util.Arrays.equals(this.autores, other.getAutores()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.preco == other.getPreco();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAutores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += new Double(getPreco()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://session.loja.caelum.com.br/", "livro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://session.loja.caelum.com.br/", "autor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
