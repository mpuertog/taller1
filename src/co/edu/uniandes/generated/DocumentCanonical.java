
package co.edu.uniandes.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileMD5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sendedDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileName",
    "userID",
    "fileMD5",
    "originName",
    "issuer",
    "receiver",
    "mimeType",
    "category",
    "createdDate",
    "sendedDate"
})
@XmlRootElement(name = "documentCanonical", namespace = "http://www.uniandes.edu.co/canonicoDocumento/")
public class DocumentCanonical {

    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String fileName;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String userID;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String fileMD5;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String originName;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String issuer;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String receiver;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String mimeType;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    protected String category;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(namespace = "http://www.uniandes.edu.co/canonicoDocumento/", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sendedDate;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the fileMD5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileMD5() {
        return fileMD5;
    }

    /**
     * Sets the value of the fileMD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileMD5(String value) {
        this.fileMD5 = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the sendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendedDate() {
        return sendedDate;
    }

    /**
     * Sets the value of the sendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendedDate(XMLGregorianCalendar value) {
        this.sendedDate = value;
    }

}
