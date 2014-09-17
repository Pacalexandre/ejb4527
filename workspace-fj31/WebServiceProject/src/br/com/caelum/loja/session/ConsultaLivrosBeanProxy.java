package br.com.caelum.loja.session;

public class ConsultaLivrosBeanProxy implements br.com.caelum.loja.session.ConsultaLivrosBean {
  private String _endpoint = null;
  private br.com.caelum.loja.session.ConsultaLivrosBean consultaLivrosBean = null;
  
  public ConsultaLivrosBeanProxy() {
    _initConsultaLivrosBeanProxy();
  }
  
  public ConsultaLivrosBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaLivrosBeanProxy();
  }
  
  private void _initConsultaLivrosBeanProxy() {
    try {
      consultaLivrosBean = (new br.com.caelum.loja.session.ConsultaLivrosBeanServiceLocator()).getConsultaLivrosBeanPort();
      if (consultaLivrosBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaLivrosBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaLivrosBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaLivrosBean != null)
      ((javax.xml.rpc.Stub)consultaLivrosBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.loja.session.ConsultaLivrosBean getConsultaLivrosBean() {
    if (consultaLivrosBean == null)
      _initConsultaLivrosBeanProxy();
    return consultaLivrosBean;
  }
  
  public br.com.caelum.loja.session.Livro[] buscaLivro(java.lang.String arg0) throws java.rmi.RemoteException{
    if (consultaLivrosBean == null)
      _initConsultaLivrosBeanProxy();
    return consultaLivrosBean.buscaLivro(arg0);
  }
  
  
}