
package ServidorWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ServidorWS package. 
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

    private final static QName _GetMonedaByCodigoResponse_QNAME = new QName("http://servidorwebservices/", "getMonedaByCodigoResponse");
    private final static QName _GetZonasResponse_QNAME = new QName("http://servidorwebservices/", "getZonasResponse");
    private final static QName _GetPaisesResponse_QNAME = new QName("http://servidorwebservices/", "getPaisesResponse");
    private final static QName _GetZonaByIdResponse_QNAME = new QName("http://servidorwebservices/", "getZonaByIdResponse");
    private final static QName _GetPaises_QNAME = new QName("http://servidorwebservices/", "getPaises");
    private final static QName _GetMonedaByCodigo_QNAME = new QName("http://servidorwebservices/", "getMonedaByCodigo");
    private final static QName _GetMonedas_QNAME = new QName("http://servidorwebservices/", "getMonedas");
    private final static QName _GetMonedasResponse_QNAME = new QName("http://servidorwebservices/", "getMonedasResponse");
    private final static QName _GetPaisesMoneda_QNAME = new QName("http://servidorwebservices/", "getPaisesMoneda");
    private final static QName _GetZonas_QNAME = new QName("http://servidorwebservices/", "getZonas");
    private final static QName _GetPaisesMonedaResponse_QNAME = new QName("http://servidorwebservices/", "getPaisesMonedaResponse");
    private final static QName _GetZonaById_QNAME = new QName("http://servidorwebservices/", "getZonaById");
    private final static QName _GetPaisesZona_QNAME = new QName("http://servidorwebservices/", "getPaisesZona");
    private final static QName _GetPaisesZonaResponse_QNAME = new QName("http://servidorwebservices/", "getPaisesZonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ServidorWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaises }
     * 
     */
    public GetPaises createGetPaises() {
        return new GetPaises();
    }

    /**
     * Create an instance of {@link GetZonaByIdResponse }
     * 
     */
    public GetZonaByIdResponse createGetZonaByIdResponse() {
        return new GetZonaByIdResponse();
    }

    /**
     * Create an instance of {@link GetPaisesResponse }
     * 
     */
    public GetPaisesResponse createGetPaisesResponse() {
        return new GetPaisesResponse();
    }

    /**
     * Create an instance of {@link GetMonedaByCodigoResponse }
     * 
     */
    public GetMonedaByCodigoResponse createGetMonedaByCodigoResponse() {
        return new GetMonedaByCodigoResponse();
    }

    /**
     * Create an instance of {@link GetZonasResponse }
     * 
     */
    public GetZonasResponse createGetZonasResponse() {
        return new GetZonasResponse();
    }

    /**
     * Create an instance of {@link GetPaisesZonaResponse }
     * 
     */
    public GetPaisesZonaResponse createGetPaisesZonaResponse() {
        return new GetPaisesZonaResponse();
    }

    /**
     * Create an instance of {@link GetPaisesZona }
     * 
     */
    public GetPaisesZona createGetPaisesZona() {
        return new GetPaisesZona();
    }

    /**
     * Create an instance of {@link GetPaisesMonedaResponse }
     * 
     */
    public GetPaisesMonedaResponse createGetPaisesMonedaResponse() {
        return new GetPaisesMonedaResponse();
    }

    /**
     * Create an instance of {@link GetZonaById }
     * 
     */
    public GetZonaById createGetZonaById() {
        return new GetZonaById();
    }

    /**
     * Create an instance of {@link GetMonedas }
     * 
     */
    public GetMonedas createGetMonedas() {
        return new GetMonedas();
    }

    /**
     * Create an instance of {@link GetMonedasResponse }
     * 
     */
    public GetMonedasResponse createGetMonedasResponse() {
        return new GetMonedasResponse();
    }

    /**
     * Create an instance of {@link GetPaisesMoneda }
     * 
     */
    public GetPaisesMoneda createGetPaisesMoneda() {
        return new GetPaisesMoneda();
    }

    /**
     * Create an instance of {@link GetZonas }
     * 
     */
    public GetZonas createGetZonas() {
        return new GetZonas();
    }

    /**
     * Create an instance of {@link GetMonedaByCodigo }
     * 
     */
    public GetMonedaByCodigo createGetMonedaByCodigo() {
        return new GetMonedaByCodigo();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link Zona }
     * 
     */
    public Zona createZona() {
        return new Zona();
    }

    /**
     * Create an instance of {@link Moneda }
     * 
     */
    public Moneda createMoneda() {
        return new Moneda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonedaByCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getMonedaByCodigoResponse")
    public JAXBElement<GetMonedaByCodigoResponse> createGetMonedaByCodigoResponse(GetMonedaByCodigoResponse value) {
        return new JAXBElement<GetMonedaByCodigoResponse>(_GetMonedaByCodigoResponse_QNAME, GetMonedaByCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getZonasResponse")
    public JAXBElement<GetZonasResponse> createGetZonasResponse(GetZonasResponse value) {
        return new JAXBElement<GetZonasResponse>(_GetZonasResponse_QNAME, GetZonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaisesResponse")
    public JAXBElement<GetPaisesResponse> createGetPaisesResponse(GetPaisesResponse value) {
        return new JAXBElement<GetPaisesResponse>(_GetPaisesResponse_QNAME, GetPaisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZonaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getZonaByIdResponse")
    public JAXBElement<GetZonaByIdResponse> createGetZonaByIdResponse(GetZonaByIdResponse value) {
        return new JAXBElement<GetZonaByIdResponse>(_GetZonaByIdResponse_QNAME, GetZonaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaises")
    public JAXBElement<GetPaises> createGetPaises(GetPaises value) {
        return new JAXBElement<GetPaises>(_GetPaises_QNAME, GetPaises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonedaByCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getMonedaByCodigo")
    public JAXBElement<GetMonedaByCodigo> createGetMonedaByCodigo(GetMonedaByCodigo value) {
        return new JAXBElement<GetMonedaByCodigo>(_GetMonedaByCodigo_QNAME, GetMonedaByCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonedas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getMonedas")
    public JAXBElement<GetMonedas> createGetMonedas(GetMonedas value) {
        return new JAXBElement<GetMonedas>(_GetMonedas_QNAME, GetMonedas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMonedasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getMonedasResponse")
    public JAXBElement<GetMonedasResponse> createGetMonedasResponse(GetMonedasResponse value) {
        return new JAXBElement<GetMonedasResponse>(_GetMonedasResponse_QNAME, GetMonedasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaisesMoneda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaisesMoneda")
    public JAXBElement<GetPaisesMoneda> createGetPaisesMoneda(GetPaisesMoneda value) {
        return new JAXBElement<GetPaisesMoneda>(_GetPaisesMoneda_QNAME, GetPaisesMoneda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getZonas")
    public JAXBElement<GetZonas> createGetZonas(GetZonas value) {
        return new JAXBElement<GetZonas>(_GetZonas_QNAME, GetZonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaisesMonedaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaisesMonedaResponse")
    public JAXBElement<GetPaisesMonedaResponse> createGetPaisesMonedaResponse(GetPaisesMonedaResponse value) {
        return new JAXBElement<GetPaisesMonedaResponse>(_GetPaisesMonedaResponse_QNAME, GetPaisesMonedaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZonaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getZonaById")
    public JAXBElement<GetZonaById> createGetZonaById(GetZonaById value) {
        return new JAXBElement<GetZonaById>(_GetZonaById_QNAME, GetZonaById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaisesZona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaisesZona")
    public JAXBElement<GetPaisesZona> createGetPaisesZona(GetPaisesZona value) {
        return new JAXBElement<GetPaisesZona>(_GetPaisesZona_QNAME, GetPaisesZona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaisesZonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorwebservices/", name = "getPaisesZonaResponse")
    public JAXBElement<GetPaisesZonaResponse> createGetPaisesZonaResponse(GetPaisesZonaResponse value) {
        return new JAXBElement<GetPaisesZonaResponse>(_GetPaisesZonaResponse_QNAME, GetPaisesZonaResponse.class, null, value);
    }

}
