
package webpackages.sei.src.net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetGeoIPResult" type="{http://www.webservicex.net/}GeoIP" minOccurs="0"/>
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
    "getGeoIPResult"
})
@XmlRootElement(name = "GetGeoIPResponse")
public class GetGeoIPResponse {

    @XmlElement(name = "GetGeoIPResult")
    protected GeoIP getGeoIPResult;

    /**
     * Recupera il valore della proprietà getGeoIPResult.
     * 
     * @return
     *     possible object is
     *     {@link GeoIP }
     *     
     */
    public GeoIP getGetGeoIPResult() {
        return getGeoIPResult;
    }

    /**
     * Imposta il valore della proprietà getGeoIPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoIP }
     *     
     */
    public void setGetGeoIPResult(GeoIP value) {
        this.getGeoIPResult = value;
    }

}
