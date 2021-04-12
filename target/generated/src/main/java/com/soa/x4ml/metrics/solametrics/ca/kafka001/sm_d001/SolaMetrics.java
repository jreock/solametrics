
package com.soa.x4ml.metrics.solametrics.ca.kafka001.sm_d001;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MetricsData" maxOccurs="214" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TOR-TASK-NO" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
 *                         &amp;lt;totalDigits value="7"/&amp;gt;
 *                         &amp;lt;fractionDigits value="0"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="TOR-SYS-ID" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="4"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="TOR-TRAN-ID" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="4"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="AOR-SYS-ID" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="4"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="AOR-TASK-NO" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
 *                         &amp;lt;totalDigits value="7"/&amp;gt;
 *                         &amp;lt;fractionDigits value="0"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="METHOD-NM" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="35"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="PROG-NM" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="8"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="PROG-TY-CD" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="35"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="CLIENT-IP-ADDR" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="15"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="START-DT" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="10"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="START-TM" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="8"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="ELPS-TM-AOR" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="ELPS-TM-TSK" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="COMP-CD" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="ABEND-CD" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;minLength value="0"/&amp;gt;
 *                         &amp;lt;maxLength value="4"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="REQ-SZ" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="RESP-SZ" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metricsData"
})
@XmlRootElement(name = "SolaMetrics")
public class SolaMetrics {

    @XmlElement(name = "MetricsData")
    protected List<SolaMetrics.MetricsData> metricsData;

    /**
     * Gets the value of the metricsData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the metricsData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMetricsData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SolaMetrics.MetricsData }
     * 
     * 
     */
    public List<SolaMetrics.MetricsData> getMetricsData() {
        if (metricsData == null) {
            metricsData = new ArrayList<SolaMetrics.MetricsData>();
        }
        return this.metricsData;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="TOR-TASK-NO" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
     *               &amp;lt;totalDigits value="7"/&amp;gt;
     *               &amp;lt;fractionDigits value="0"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="TOR-SYS-ID" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="4"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="TOR-TRAN-ID" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="4"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="AOR-SYS-ID" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="4"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="AOR-TASK-NO" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
     *               &amp;lt;totalDigits value="7"/&amp;gt;
     *               &amp;lt;fractionDigits value="0"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="METHOD-NM" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="35"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="PROG-NM" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="8"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="PROG-TY-CD" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="35"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="CLIENT-IP-ADDR" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="15"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="START-DT" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="10"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="START-TM" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="8"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="ELPS-TM-AOR" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="ELPS-TM-TSK" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="COMP-CD" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="ABEND-CD" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *               &amp;lt;minLength value="0"/&amp;gt;
     *               &amp;lt;maxLength value="4"/&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="REQ-SZ" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="RESP-SZ" minOccurs="0"&amp;gt;
     *           &amp;lt;simpleType&amp;gt;
     *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *             &amp;lt;/restriction&amp;gt;
     *           &amp;lt;/simpleType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tortaskno",
        "torsysid",
        "tortranid",
        "aorsysid",
        "aortaskno",
        "methodnm",
        "prognm",
        "progtycd",
        "clientipaddr",
        "startdt",
        "starttm",
        "elpstmaor",
        "elpstmtsk",
        "compcd",
        "abendcd",
        "reqsz",
        "respsz"
    })
    public static class MetricsData {

        @XmlElement(name = "TOR-TASK-NO")
        protected BigDecimal tortaskno;
        @XmlElement(name = "TOR-SYS-ID")
        protected String torsysid;
        @XmlElement(name = "TOR-TRAN-ID")
        protected String tortranid;
        @XmlElement(name = "AOR-SYS-ID")
        protected String aorsysid;
        @XmlElement(name = "AOR-TASK-NO")
        protected BigDecimal aortaskno;
        @XmlElement(name = "METHOD-NM")
        protected String methodnm;
        @XmlElement(name = "PROG-NM")
        protected String prognm;
        @XmlElement(name = "PROG-TY-CD")
        protected String progtycd;
        @XmlElement(name = "CLIENT-IP-ADDR")
        protected String clientipaddr;
        @XmlElement(name = "START-DT")
        protected String startdt;
        @XmlElement(name = "START-TM")
        protected String starttm;
        @XmlElement(name = "ELPS-TM-AOR")
        protected Integer elpstmaor;
        @XmlElement(name = "ELPS-TM-TSK")
        protected Integer elpstmtsk;
        @XmlElement(name = "COMP-CD")
        protected Short compcd;
        @XmlElement(name = "ABEND-CD")
        protected String abendcd;
        @XmlElement(name = "REQ-SZ")
        protected Integer reqsz;
        @XmlElement(name = "RESP-SZ")
        protected Integer respsz;

        /**
         * Gets the value of the tortaskno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTORTASKNO() {
            return tortaskno;
        }

        /**
         * Sets the value of the tortaskno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTORTASKNO(BigDecimal value) {
            this.tortaskno = value;
        }

        /**
         * Gets the value of the torsysid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTORSYSID() {
            return torsysid;
        }

        /**
         * Sets the value of the torsysid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTORSYSID(String value) {
            this.torsysid = value;
        }

        /**
         * Gets the value of the tortranid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTORTRANID() {
            return tortranid;
        }

        /**
         * Sets the value of the tortranid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTORTRANID(String value) {
            this.tortranid = value;
        }

        /**
         * Gets the value of the aorsysid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAORSYSID() {
            return aorsysid;
        }

        /**
         * Sets the value of the aorsysid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAORSYSID(String value) {
            this.aorsysid = value;
        }

        /**
         * Gets the value of the aortaskno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAORTASKNO() {
            return aortaskno;
        }

        /**
         * Sets the value of the aortaskno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAORTASKNO(BigDecimal value) {
            this.aortaskno = value;
        }

        /**
         * Gets the value of the methodnm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMETHODNM() {
            return methodnm;
        }

        /**
         * Sets the value of the methodnm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMETHODNM(String value) {
            this.methodnm = value;
        }

        /**
         * Gets the value of the prognm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROGNM() {
            return prognm;
        }

        /**
         * Sets the value of the prognm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROGNM(String value) {
            this.prognm = value;
        }

        /**
         * Gets the value of the progtycd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROGTYCD() {
            return progtycd;
        }

        /**
         * Sets the value of the progtycd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROGTYCD(String value) {
            this.progtycd = value;
        }

        /**
         * Gets the value of the clientipaddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTIPADDR() {
            return clientipaddr;
        }

        /**
         * Sets the value of the clientipaddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTIPADDR(String value) {
            this.clientipaddr = value;
        }

        /**
         * Gets the value of the startdt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTARTDT() {
            return startdt;
        }

        /**
         * Sets the value of the startdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTARTDT(String value) {
            this.startdt = value;
        }

        /**
         * Gets the value of the starttm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTARTTM() {
            return starttm;
        }

        /**
         * Sets the value of the starttm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTARTTM(String value) {
            this.starttm = value;
        }

        /**
         * Gets the value of the elpstmaor property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getELPSTMAOR() {
            return elpstmaor;
        }

        /**
         * Sets the value of the elpstmaor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setELPSTMAOR(Integer value) {
            this.elpstmaor = value;
        }

        /**
         * Gets the value of the elpstmtsk property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getELPSTMTSK() {
            return elpstmtsk;
        }

        /**
         * Sets the value of the elpstmtsk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setELPSTMTSK(Integer value) {
            this.elpstmtsk = value;
        }

        /**
         * Gets the value of the compcd property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCOMPCD() {
            return compcd;
        }

        /**
         * Sets the value of the compcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCOMPCD(Short value) {
            this.compcd = value;
        }

        /**
         * Gets the value of the abendcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getABENDCD() {
            return abendcd;
        }

        /**
         * Sets the value of the abendcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setABENDCD(String value) {
            this.abendcd = value;
        }

        /**
         * Gets the value of the reqsz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getREQSZ() {
            return reqsz;
        }

        /**
         * Sets the value of the reqsz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setREQSZ(Integer value) {
            this.reqsz = value;
        }

        /**
         * Gets the value of the respsz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRESPSZ() {
            return respsz;
        }

        /**
         * Sets the value of the respsz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRESPSZ(Integer value) {
            this.respsz = value;
        }

    }

}
