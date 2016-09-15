package DefaultNamespace;

public class ProductCatalogProxy implements DefaultNamespace.ProductCatalog {
  private String _endpoint = null;
  private DefaultNamespace.ProductCatalog productCatalog = null;
  
  public ProductCatalogProxy() {
    _initProductCatalogProxy();
  }
  
  public ProductCatalogProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductCatalogProxy();
  }
  
  private void _initProductCatalogProxy() {
    try {
      productCatalog = (new DefaultNamespace.ProductCatalogServiceLocator()).getProductCatalog();
      if (productCatalog != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productCatalog)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productCatalog != null)
      ((javax.xml.rpc.Stub)productCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.ProductCatalog getProductCatalog() {
    if (productCatalog == null)
      _initProductCatalogProxy();
    return productCatalog;
  }
  
  public java.lang.Object[] getProductCategories() throws java.rmi.RemoteException{
    if (productCatalog == null)
      _initProductCatalogProxy();
    return productCatalog.getProductCategories();
  }
  
  
}