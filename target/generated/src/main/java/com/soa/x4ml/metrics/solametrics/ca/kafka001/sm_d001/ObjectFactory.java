
package com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001 package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _SolaMetricsResponse_QNAME = new QName("http://SolaMetrics.Metrics.x4ml.soa.com/CA/KAFKA001/SM#D001", "SolaMetricsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolaMetrics }
     * 
     */
    public SolaMetrics createSolaMetrics() {
        return new SolaMetrics();
    }

    /**
     * Create an instance of {@link SolaMetrics.MetricsData }
     * 
     */
    public SolaMetrics.MetricsData createSolaMetricsMetricsData() {
        return new SolaMetrics.MetricsData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://SolaMetrics.Metrics.x4ml.soa.com/CA/KAFKA001/SM#D001", name = "SolaMetricsResponse")
    public JAXBElement<Object> createSolaMetricsResponse(Object value) {
        return new JAXBElement<Object>(_SolaMetricsResponse_QNAME, Object.class, null, value);
    }

}
