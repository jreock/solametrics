package com.soa.x4ml.metrics.ca.kafka001;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-04-12T10:48:32.846-04:00
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://Metrics.x4ml.soa.com/CA/KAFKA001", name = "MetricsPortTypeName")
@XmlSeeAlso({com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MetricsPortTypeName {

    @WebMethod(operationName = "SolaMetrics", action = "/CA/KAFKA001/SM#D001/CCP:UTF-8/HCP:037")
    @WebResult(name = "SolaMetricsResponse", targetNamespace = "http://SolaMetrics.Metrics.x4ml.soa.com/CA/KAFKA001/SM#D001", partName = "body")
    public java.lang.Object solaMetrics(

        @WebParam(partName = "body", name = "SolaMetrics", targetNamespace = "http://SolaMetrics.Metrics.x4ml.soa.com/CA/KAFKA001/SM#D001")
        com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001.SolaMetrics body
    );
}
