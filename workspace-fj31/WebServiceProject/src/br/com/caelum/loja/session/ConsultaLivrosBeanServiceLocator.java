/**
 * ConsultaLivrosBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.loja.session;

public class ConsultaLivrosBeanServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.loja.session.ConsultaLivrosBeanService {

    public ConsultaLivrosBeanServiceLocator() {
    }


    public ConsultaLivrosBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultaLivrosBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultaLivrosBeanPort
    private java.lang.String ConsultaLivrosBeanPort_address = "http://localhost:8080/fj31-loja-ejb3/ConsultaLivrosBean";

    public java.lang.String getConsultaLivrosBeanPortAddress() {
        return ConsultaLivrosBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultaLivrosBeanPortWSDDServiceName = "ConsultaLivrosBeanPort";

    public java.lang.String getConsultaLivrosBeanPortWSDDServiceName() {
        return ConsultaLivrosBeanPortWSDDServiceName;
    }

    public void setConsultaLivrosBeanPortWSDDServiceName(java.lang.String name) {
        ConsultaLivrosBeanPortWSDDServiceName = name;
    }

    public br.com.caelum.loja.session.ConsultaLivrosBean getConsultaLivrosBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultaLivrosBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultaLivrosBeanPort(endpoint);
    }

    public br.com.caelum.loja.session.ConsultaLivrosBean getConsultaLivrosBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.loja.session.ConsultaLivrosBeanServiceSoapBindingStub _stub = new br.com.caelum.loja.session.ConsultaLivrosBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConsultaLivrosBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultaLivrosBeanPortEndpointAddress(java.lang.String address) {
        ConsultaLivrosBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.loja.session.ConsultaLivrosBean.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.loja.session.ConsultaLivrosBeanServiceSoapBindingStub _stub = new br.com.caelum.loja.session.ConsultaLivrosBeanServiceSoapBindingStub(new java.net.URL(ConsultaLivrosBeanPort_address), this);
                _stub.setPortName(getConsultaLivrosBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConsultaLivrosBeanPort".equals(inputPortName)) {
            return getConsultaLivrosBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://session.loja.caelum.com.br/", "ConsultaLivrosBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://session.loja.caelum.com.br/", "ConsultaLivrosBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultaLivrosBeanPort".equals(portName)) {
            setConsultaLivrosBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
