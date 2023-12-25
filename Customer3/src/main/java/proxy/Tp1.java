
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "tp1", targetNamespace = "http://webservice.example.com/", wsdlLocation = "http://localhost:8889/?wsdl")
public class Tp1
    extends Service
{

    private static final URL TP1_WSDL_LOCATION;
    private static final WebServiceException TP1_EXCEPTION;
    private static final QName TP1_QNAME = new QName("http://webservice.example.com/", "tp1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8889/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TP1_WSDL_LOCATION = url;
        TP1_EXCEPTION = e;
    }

    public Tp1() {
        super(__getWsdlLocation(), TP1_QNAME);
    }

    public Tp1(WebServiceFeature... features) {
        super(__getWsdlLocation(), TP1_QNAME, features);
    }

    public Tp1(URL wsdlLocation) {
        super(wsdlLocation, TP1_QNAME);
    }

    public Tp1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TP1_QNAME, features);
    }

    public Tp1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Tp1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebService1
     */
    @WebEndpoint(name = "WebService1Port")
    public WebService1 getWebService1Port() {
        return super.getPort(new QName("http://webservice.example.com/", "WebService1Port"), WebService1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebService1
     */
    @WebEndpoint(name = "WebService1Port")
    public WebService1 getWebService1Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.example.com/", "WebService1Port"), WebService1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TP1_EXCEPTION!= null) {
            throw TP1_EXCEPTION;
        }
        return TP1_WSDL_LOCATION;
    }

}