//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes properties of an exchange rate between
 * 				source and target currencies.
 * 
 * <p>Java class for ExchangeRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRateEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate", propOrder = {
    "sourceCurrencyCode",
    "targetCurrencyCode",
    "rate",
    "asOfDate",
    "exchangeRateEx"
})
public class ExchangeRate
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SourceCurrencyCode")
    protected String sourceCurrencyCode;
    @XmlElement(name = "TargetCurrencyCode")
    protected String targetCurrencyCode;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "AsOfDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date asOfDate;
    @XmlElement(name = "ExchangeRateEx")
    protected IntuitAnyType exchangeRateEx;

    /**
     * Gets the value of the sourceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Sets the value of the sourceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCurrencyCode(String value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Gets the value of the targetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Sets the value of the targetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCurrencyCode(String value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(Date value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the exchangeRateEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getExchangeRateEx() {
        return exchangeRateEx;
    }

    /**
     * Sets the value of the exchangeRateEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setExchangeRateEx(IntuitAnyType value) {
        this.exchangeRateEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExchangeRate that = ((ExchangeRate) object);
        {
            String lhsSourceCurrencyCode;
            lhsSourceCurrencyCode = this.getSourceCurrencyCode();
            String rhsSourceCurrencyCode;
            rhsSourceCurrencyCode = that.getSourceCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCurrencyCode", lhsSourceCurrencyCode), LocatorUtils.property(thatLocator, "sourceCurrencyCode", rhsSourceCurrencyCode), lhsSourceCurrencyCode, rhsSourceCurrencyCode, (this.sourceCurrencyCode!= null), (that.sourceCurrencyCode!= null))) {
                return false;
            }
        }
        {
            String lhsTargetCurrencyCode;
            lhsTargetCurrencyCode = this.getTargetCurrencyCode();
            String rhsTargetCurrencyCode;
            rhsTargetCurrencyCode = that.getTargetCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCurrencyCode", lhsTargetCurrencyCode), LocatorUtils.property(thatLocator, "targetCurrencyCode", rhsTargetCurrencyCode), lhsTargetCurrencyCode, rhsTargetCurrencyCode, (this.targetCurrencyCode!= null), (that.targetCurrencyCode!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRate;
            lhsRate = this.getRate();
            BigDecimal rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate, (this.rate!= null), (that.rate!= null))) {
                return false;
            }
        }
        {
            Date lhsAsOfDate;
            lhsAsOfDate = this.getAsOfDate();
            Date rhsAsOfDate;
            rhsAsOfDate = that.getAsOfDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asOfDate", lhsAsOfDate), LocatorUtils.property(thatLocator, "asOfDate", rhsAsOfDate), lhsAsOfDate, rhsAsOfDate, (this.asOfDate!= null), (that.asOfDate!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsExchangeRateEx;
            lhsExchangeRateEx = this.getExchangeRateEx();
            IntuitAnyType rhsExchangeRateEx;
            rhsExchangeRateEx = that.getExchangeRateEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeRateEx", lhsExchangeRateEx), LocatorUtils.property(thatLocator, "exchangeRateEx", rhsExchangeRateEx), lhsExchangeRateEx, rhsExchangeRateEx, (this.exchangeRateEx!= null), (that.exchangeRateEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theSourceCurrencyCode;
            theSourceCurrencyCode = this.getSourceCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCurrencyCode", theSourceCurrencyCode), currentHashCode, theSourceCurrencyCode, (this.sourceCurrencyCode!= null));
        }
        {
            String theTargetCurrencyCode;
            theTargetCurrencyCode = this.getTargetCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCurrencyCode", theTargetCurrencyCode), currentHashCode, theTargetCurrencyCode, (this.targetCurrencyCode!= null));
        }
        {
            BigDecimal theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate, (this.rate!= null));
        }
        {
            Date theAsOfDate;
            theAsOfDate = this.getAsOfDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asOfDate", theAsOfDate), currentHashCode, theAsOfDate, (this.asOfDate!= null));
        }
        {
            IntuitAnyType theExchangeRateEx;
            theExchangeRateEx = this.getExchangeRateEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRateEx", theExchangeRateEx), currentHashCode, theExchangeRateEx, (this.exchangeRateEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
