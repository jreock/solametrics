package com.soa.x4ml.metrics.ca.kafka001;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-04-12T10:55:34.343-04:00
 * Generated source version: 3.4.3
 *
 */
@WebServiceClient(name = "Metrics",
                  wsdlLocation = "file:/Users/jreock/Development/Camel/Solacloud/cxf/solaservice/solametrics/src/main/resources/wsdl/Metrics.wsdl",
                  targetNamespace = "http://Metrics.x4ml.soa.com/CA/KAFKA001")
public class Metrics extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Metrics.x4ml.soa.com/CA/KAFKA001", "Metrics");
    public final static QName MetricsServicePortName = new QName("http://Metrics.x4ml.soa.com/CA/KAFKA001", "MetricsServicePortName");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/jreock/Development/Camel/Solacloud/cxf/solaservice/solametrics/src/main/resources/wsdl/Metrics.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Metrics.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/jreock/Development/Camel/Solacloud/cxf/solaservice/solametrics/src/main/resources/wsdl/Metrics.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Metrics(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Metrics(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Metrics() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Metrics(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Metrics(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Metrics(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MetricsPortTypeName
     */
    @WebEndpoint(name = "MetricsServicePortName")
    public MetricsPortTypeName getMetricsServicePortName() {
        return super.getPort(MetricsServicePortName, MetricsPortTypeName.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MetricsPortTypeName
     */
    @WebEndpoint(name = "MetricsServicePortName")
    public MetricsPortTypeName getMetricsServicePortName(WebServiceFeature... features) {
        return super.getPort(MetricsServicePortName, MetricsPortTypeName.class, features);
    }

}
