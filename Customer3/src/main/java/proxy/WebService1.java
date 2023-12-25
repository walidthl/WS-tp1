
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "WebService1", targetNamespace = "http://webservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService1 {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://webservice.example.com/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://webservice.example.com/", className = "proxy.GetCompteResponse")
    @Action(input = "http://webservice.example.com/WebService1/getCompteRequest", output = "http://webservice.example.com/WebService1/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listcomptes", targetNamespace = "http://webservice.example.com/", className = "proxy.Listcomptes")
    @ResponseWrapper(localName = "listcomptesResponse", targetNamespace = "http://webservice.example.com/", className = "proxy.ListcomptesResponse")
    @Action(input = "http://webservice.example.com/WebService1/listcomptesRequest", output = "http://webservice.example.com/WebService1/listcomptesResponse")
    public List<Compte> listcomptes();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEurtoDh", targetNamespace = "http://webservice.example.com/", className = "proxy.ConversionEurtoDh")
    @ResponseWrapper(localName = "conversionEurtoDhResponse", targetNamespace = "http://webservice.example.com/", className = "proxy.ConversionEurtoDhResponse")
    @Action(input = "http://webservice.example.com/WebService1/conversionEurtoDhRequest", output = "http://webservice.example.com/WebService1/conversionEurtoDhResponse")
    public double conversionEurtoDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}