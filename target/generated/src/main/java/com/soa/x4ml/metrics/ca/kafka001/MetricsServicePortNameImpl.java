
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.soa.x4ml.metrics.ca.kafka001;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-04-12T11:13:09.870-04:00
 * Generated source version: 3.4.3
 *
 */

@javax.jws.WebService(
                      serviceName = "Metrics",
                      portName = "MetricsServicePortName",
                      targetNamespace = "http://Metrics.x4ml.soa.com/CA/KAFKA001",
                      wsdlLocation = "file:/Users/jreock/Development/Camel/Solacloud/cxf/solaservice/solametrics/src/main/resources/wsdl/Metrics.wsdl",
                      endpointInterface = "com.soa.x4ml.metrics.ca.kafka001.MetricsPortTypeName")

public class MetricsServicePortNameImpl implements MetricsPortTypeName {

    private static final Logger LOG = Logger.getLogger(MetricsServicePortNameImpl.class.getName());

    /* (non-Javadoc)
     * @see com.soa.x4ml.metrics.ca.kafka001.MetricsPortTypeName#solaMetrics(com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001.SolaMetrics body)*
     */
    public java.lang.Object solaMetrics(com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001.SolaMetrics body) {
        LOG.info("Executing operation solaMetrics");
        System.out.println(body);
        try {
            java.lang.Object _return = new java.lang.Object();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
