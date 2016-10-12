//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.11 at 02:40:10 PM CST 
//


package cn.edu.ynu.web_service_ceair.validate_person;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERSON complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERSON">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USR_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USR_PWD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PERSON_INFO_LIST">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERSON_INFO" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PASS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PASS_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PERSON_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="UNIV_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERSON", propOrder = {
    "usrid",
    "usrpwd",
    "personinfolist"
})
public class PERSON {

    @XmlElement(name = "USR_ID", required = true)
    protected String usrid;
    @XmlElement(name = "USR_PWD", required = true)
    protected String usrpwd;
    @XmlElement(name = "PERSON_INFO_LIST", required = true)
    protected PERSON.PERSONINFOLIST personinfolist;

    /**
     * Gets the value of the usrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRID() {
        return usrid;
    }

    /**
     * Sets the value of the usrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRID(String value) {
        this.usrid = value;
    }

    /**
     * Gets the value of the usrpwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRPWD() {
        return usrpwd;
    }

    /**
     * Sets the value of the usrpwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRPWD(String value) {
        this.usrpwd = value;
    }

    /**
     * Gets the value of the personinfolist property.
     * 
     * @return
     *     possible object is
     *     {@link PERSON.PERSONINFOLIST }
     *     
     */
    public PERSON.PERSONINFOLIST getPERSONINFOLIST() {
        return personinfolist;
    }

    /**
     * Sets the value of the personinfolist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERSON.PERSONINFOLIST }
     *     
     */
    public void setPERSONINFOLIST(PERSON.PERSONINFOLIST value) {
        this.personinfolist = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERSON_INFO" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PASS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PASS_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PERSON_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UNIV_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personinfo"
    })
    public static class PERSONINFOLIST {

        @XmlElement(name = "PERSON_INFO")
        protected List<PERSON.PERSONINFOLIST.PERSONINFO> personinfo;

        /**
         * Gets the value of the personinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERSONINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PERSON.PERSONINFOLIST.PERSONINFO }
         * 
         * 
         */
        public List<PERSON.PERSONINFOLIST.PERSONINFO> getPERSONINFO() {
            if (personinfo == null) {
                personinfo = new ArrayList<PERSON.PERSONINFOLIST.PERSONINFO>();
            }
            return this.personinfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SORT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PASS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PASS_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PERSON_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="UNIV_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sortid",
            "passtype",
            "passno",
            "personnm",
            "univid"
        })
        public static class PERSONINFO {

            @XmlElement(name = "SORT_ID", required = true)
            protected String sortid;
            @XmlElement(name = "PASS_TYPE", required = true)
            protected String passtype;
            @XmlElement(name = "PASS_NO", required = true)
            protected String passno;
            @XmlElement(name = "PERSON_NM", required = true)
            protected String personnm;
            @XmlElement(name = "UNIV_ID", required = true)
            protected String univid;

            /**
             * Gets the value of the sortid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSORTID() {
                return sortid;
            }

            /**
             * Sets the value of the sortid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSORTID(String value) {
                this.sortid = value;
            }

            /**
             * Gets the value of the passtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPASSTYPE() {
                return passtype;
            }

            /**
             * Sets the value of the passtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPASSTYPE(String value) {
                this.passtype = value;
            }

            /**
             * Gets the value of the passno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPASSNO() {
                return passno;
            }

            /**
             * Sets the value of the passno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPASSNO(String value) {
                this.passno = value;
            }

            /**
             * Gets the value of the personnm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPERSONNM() {
                return personnm;
            }

            /**
             * Sets the value of the personnm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPERSONNM(String value) {
                this.personnm = value;
            }

            /**
             * Gets the value of the univid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUNIVID() {
                return univid;
            }

            /**
             * Sets the value of the univid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUNIVID(String value) {
                this.univid = value;
            }

        }

    }

}
