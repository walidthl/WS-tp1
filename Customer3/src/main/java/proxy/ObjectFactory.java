
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEurtoDh_QNAME = new QName("http://webservice.example.com/", "conversionEurtoDh");
    private static final QName _ConversionEurtoDhResponse_QNAME = new QName("http://webservice.example.com/", "conversionEurtoDhResponse");
    private static final QName _GetCompte_QNAME = new QName("http://webservice.example.com/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://webservice.example.com/", "getCompteResponse");
    private static final QName _Listcomptes_QNAME = new QName("http://webservice.example.com/", "listcomptes");
    private static final QName _ListcomptesResponse_QNAME = new QName("http://webservice.example.com/", "listcomptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEurtoDh }
     * 
     * @return
     *     the new instance of {@link ConversionEurtoDh }
     */
    public ConversionEurtoDh createConversionEurtoDh() {
        return new ConversionEurtoDh();
    }

    /**
     * Create an instance of {@link ConversionEurtoDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEurtoDhResponse }
     */
    public ConversionEurtoDhResponse createConversionEurtoDhResponse() {
        return new ConversionEurtoDhResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Listcomptes }
     * 
     * @return
     *     the new instance of {@link Listcomptes }
     */
    public Listcomptes createListcomptes() {
        return new Listcomptes();
    }

    /**
     * Create an instance of {@link ListcomptesResponse }
     * 
     * @return
     *     the new instance of {@link ListcomptesResponse }
     */
    public ListcomptesResponse createListcomptesResponse() {
        return new ListcomptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEurtoDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEurtoDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "conversionEurtoDh")
    public JAXBElement<ConversionEurtoDh> createConversionEurtoDh(ConversionEurtoDh value) {
        return new JAXBElement<>(_ConversionEurtoDh_QNAME, ConversionEurtoDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEurtoDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEurtoDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "conversionEurtoDhResponse")
    public JAXBElement<ConversionEurtoDhResponse> createConversionEurtoDhResponse(ConversionEurtoDhResponse value) {
        return new JAXBElement<>(_ConversionEurtoDhResponse_QNAME, ConversionEurtoDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listcomptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listcomptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "listcomptes")
    public JAXBElement<Listcomptes> createListcomptes(Listcomptes value) {
        return new JAXBElement<>(_Listcomptes_QNAME, Listcomptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListcomptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListcomptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.com/", name = "listcomptesResponse")
    public JAXBElement<ListcomptesResponse> createListcomptesResponse(ListcomptesResponse value) {
        return new JAXBElement<>(_ListcomptesResponse_QNAME, ListcomptesResponse.class, null, value);
    }

}
