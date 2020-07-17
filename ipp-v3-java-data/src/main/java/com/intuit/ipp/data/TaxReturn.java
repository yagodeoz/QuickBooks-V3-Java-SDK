//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
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
 * 
 * 				Product: QBO
 * 				Description: Represents a Tax Return
 * 				that is filed with a Tax Agency.
 * 			
 * 
 * <p>Java class for TaxReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpcomingFiling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FileDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AgencyPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AgencyPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NetTaxAmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FlatRateSavingsAmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PayGWithheldAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AgencyRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxReturnStatus" type="{http://schema.intuit.com/finance/v3}TaxReturnStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxReturnEFilingFailureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EFileErrorFixByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AgencyPaymentMethod" type="{http://schema.intuit.com/finance/v3}AgencyPaymentMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReturn", propOrder = {
    "upcomingFiling",
    "startDate",
    "endDate",
    "fileDate",
    "agencyPaymentDate",
    "agencyPaymentAmount",
    "netTaxAmountDue",
    "flatRateSavingsAmountDue",
    "payGWithheldAmount",
    "agencyRef",
    "taxReturnStatus",
    "taxReturnEFilingFailureReason",
    "eFileErrorFixByDate",
    "agencyPaymentMethod",
    "taxReturnCode"
})
public class TaxReturn
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UpcomingFiling")
    protected Boolean upcomingFiling;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date startDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date endDate;
    @XmlElement(name = "FileDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fileDate;
    @XmlElement(name = "AgencyPaymentDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date agencyPaymentDate;
    @XmlElement(name = "AgencyPaymentAmount")
    protected BigDecimal agencyPaymentAmount;
    @XmlElement(name = "NetTaxAmountDue")
    protected BigDecimal netTaxAmountDue;
    @XmlElement(name = "FlatRateSavingsAmountDue")
    protected BigDecimal flatRateSavingsAmountDue;
    @XmlElement(name = "PayGWithheldAmount")
    protected BigDecimal payGWithheldAmount;
    @XmlElement(name = "AgencyRef")
    protected ReferenceType agencyRef;
    @XmlElement(name = "TaxReturnStatus")
    @XmlSchemaType(name = "string")
    protected TaxReturnStatusEnum taxReturnStatus;
    @XmlElement(name = "TaxReturnEFilingFailureReason")
    protected String taxReturnEFilingFailureReason;
    @XmlElement(name = "EFileErrorFixByDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date eFileErrorFixByDate;
    @XmlElement(name = "AgencyPaymentMethod")
    @XmlSchemaType(name = "string")
    protected AgencyPaymentMethodEnum agencyPaymentMethod;
    @XmlElement(name = "TaxReturnCode")
    protected String taxReturnCode;

    /**
     * Gets the value of the upcomingFiling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpcomingFiling() {
        return upcomingFiling;
    }

    /**
     * Sets the value of the upcomingFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpcomingFiling(Boolean value) {
        this.upcomingFiling = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the fileDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFileDate() {
        return fileDate;
    }

    /**
     * Sets the value of the fileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDate(Date value) {
        this.fileDate = value;
    }

    /**
     * Gets the value of the agencyPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAgencyPaymentDate() {
        return agencyPaymentDate;
    }

    /**
     * Sets the value of the agencyPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyPaymentDate(Date value) {
        this.agencyPaymentDate = value;
    }

    /**
     * Gets the value of the agencyPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgencyPaymentAmount() {
        return agencyPaymentAmount;
    }

    /**
     * Sets the value of the agencyPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgencyPaymentAmount(BigDecimal value) {
        this.agencyPaymentAmount = value;
    }

    /**
     * Gets the value of the netTaxAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetTaxAmountDue() {
        return netTaxAmountDue;
    }

    /**
     * Sets the value of the netTaxAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetTaxAmountDue(BigDecimal value) {
        this.netTaxAmountDue = value;
    }

    /**
     * Gets the value of the flatRateSavingsAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlatRateSavingsAmountDue() {
        return flatRateSavingsAmountDue;
    }

    /**
     * Sets the value of the flatRateSavingsAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlatRateSavingsAmountDue(BigDecimal value) {
        this.flatRateSavingsAmountDue = value;
    }

    /**
     * Gets the value of the payGWithheldAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayGWithheldAmount() {
        return payGWithheldAmount;
    }

    /**
     * Sets the value of the payGWithheldAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayGWithheldAmount(BigDecimal value) {
        this.payGWithheldAmount = value;
    }

    /**
     * Gets the value of the agencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAgencyRef() {
        return agencyRef;
    }

    /**
     * Sets the value of the agencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAgencyRef(ReferenceType value) {
        this.agencyRef = value;
    }

    /**
     * Gets the value of the taxReturnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReturnStatusEnum }
     *     
     */
    public TaxReturnStatusEnum getTaxReturnStatus() {
        return taxReturnStatus;
    }

    /**
     * Sets the value of the taxReturnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReturnStatusEnum }
     *     
     */
    public void setTaxReturnStatus(TaxReturnStatusEnum value) {
        this.taxReturnStatus = value;
    }

    /**
     * Gets the value of the taxReturnEFilingFailureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxReturnEFilingFailureReason() {
        return taxReturnEFilingFailureReason;
    }

    /**
     * Sets the value of the taxReturnEFilingFailureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxReturnEFilingFailureReason(String value) {
        this.taxReturnEFilingFailureReason = value;
    }

    /**
     * Gets the value of the eFileErrorFixByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEFileErrorFixByDate() {
        return eFileErrorFixByDate;
    }

    /**
     * Sets the value of the eFileErrorFixByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFileErrorFixByDate(Date value) {
        this.eFileErrorFixByDate = value;
    }

    /**
     * Gets the value of the agencyPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPaymentMethodEnum }
     *     
     */
    public AgencyPaymentMethodEnum getAgencyPaymentMethod() {
        return agencyPaymentMethod;
    }

    /**
     * Sets the value of the agencyPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPaymentMethodEnum }
     *     
     */
    public void setAgencyPaymentMethod(AgencyPaymentMethodEnum value) {
        this.agencyPaymentMethod = value;
    }

    /**
     * Gets the value of the taxReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxReturnCode() {
        return taxReturnCode;
    }

    /**
     * Sets the value of the taxReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxReturnCode(String value) {
        this.taxReturnCode = value;
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
        final TaxReturn that = ((TaxReturn) object);
        {
            Boolean lhsUpcomingFiling;
            lhsUpcomingFiling = this.isUpcomingFiling();
            Boolean rhsUpcomingFiling;
            rhsUpcomingFiling = that.isUpcomingFiling();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upcomingFiling", lhsUpcomingFiling), LocatorUtils.property(thatLocator, "upcomingFiling", rhsUpcomingFiling), lhsUpcomingFiling, rhsUpcomingFiling, (this.upcomingFiling!= null), (that.upcomingFiling!= null))) {
                return false;
            }
        }
        {
            Date lhsStartDate;
            lhsStartDate = this.getStartDate();
            Date rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            Date lhsFileDate;
            lhsFileDate = this.getFileDate();
            Date rhsFileDate;
            rhsFileDate = that.getFileDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileDate", lhsFileDate), LocatorUtils.property(thatLocator, "fileDate", rhsFileDate), lhsFileDate, rhsFileDate, (this.fileDate!= null), (that.fileDate!= null))) {
                return false;
            }
        }
        {
            Date lhsAgencyPaymentDate;
            lhsAgencyPaymentDate = this.getAgencyPaymentDate();
            Date rhsAgencyPaymentDate;
            rhsAgencyPaymentDate = that.getAgencyPaymentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyPaymentDate", lhsAgencyPaymentDate), LocatorUtils.property(thatLocator, "agencyPaymentDate", rhsAgencyPaymentDate), lhsAgencyPaymentDate, rhsAgencyPaymentDate, (this.agencyPaymentDate!= null), (that.agencyPaymentDate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAgencyPaymentAmount;
            lhsAgencyPaymentAmount = this.getAgencyPaymentAmount();
            BigDecimal rhsAgencyPaymentAmount;
            rhsAgencyPaymentAmount = that.getAgencyPaymentAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyPaymentAmount", lhsAgencyPaymentAmount), LocatorUtils.property(thatLocator, "agencyPaymentAmount", rhsAgencyPaymentAmount), lhsAgencyPaymentAmount, rhsAgencyPaymentAmount, (this.agencyPaymentAmount!= null), (that.agencyPaymentAmount!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNetTaxAmountDue;
            lhsNetTaxAmountDue = this.getNetTaxAmountDue();
            BigDecimal rhsNetTaxAmountDue;
            rhsNetTaxAmountDue = that.getNetTaxAmountDue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netTaxAmountDue", lhsNetTaxAmountDue), LocatorUtils.property(thatLocator, "netTaxAmountDue", rhsNetTaxAmountDue), lhsNetTaxAmountDue, rhsNetTaxAmountDue, (this.netTaxAmountDue!= null), (that.netTaxAmountDue!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFlatRateSavingsAmountDue;
            lhsFlatRateSavingsAmountDue = this.getFlatRateSavingsAmountDue();
            BigDecimal rhsFlatRateSavingsAmountDue;
            rhsFlatRateSavingsAmountDue = that.getFlatRateSavingsAmountDue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flatRateSavingsAmountDue", lhsFlatRateSavingsAmountDue), LocatorUtils.property(thatLocator, "flatRateSavingsAmountDue", rhsFlatRateSavingsAmountDue), lhsFlatRateSavingsAmountDue, rhsFlatRateSavingsAmountDue, (this.flatRateSavingsAmountDue!= null), (that.flatRateSavingsAmountDue!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPayGWithheldAmount;
            lhsPayGWithheldAmount = this.getPayGWithheldAmount();
            BigDecimal rhsPayGWithheldAmount;
            rhsPayGWithheldAmount = that.getPayGWithheldAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payGWithheldAmount", lhsPayGWithheldAmount), LocatorUtils.property(thatLocator, "payGWithheldAmount", rhsPayGWithheldAmount), lhsPayGWithheldAmount, rhsPayGWithheldAmount, (this.payGWithheldAmount!= null), (that.payGWithheldAmount!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAgencyRef;
            lhsAgencyRef = this.getAgencyRef();
            ReferenceType rhsAgencyRef;
            rhsAgencyRef = that.getAgencyRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyRef", lhsAgencyRef), LocatorUtils.property(thatLocator, "agencyRef", rhsAgencyRef), lhsAgencyRef, rhsAgencyRef, (this.agencyRef!= null), (that.agencyRef!= null))) {
                return false;
            }
        }
        {
            TaxReturnStatusEnum lhsTaxReturnStatus;
            lhsTaxReturnStatus = this.getTaxReturnStatus();
            TaxReturnStatusEnum rhsTaxReturnStatus;
            rhsTaxReturnStatus = that.getTaxReturnStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxReturnStatus", lhsTaxReturnStatus), LocatorUtils.property(thatLocator, "taxReturnStatus", rhsTaxReturnStatus), lhsTaxReturnStatus, rhsTaxReturnStatus, (this.taxReturnStatus!= null), (that.taxReturnStatus!= null))) {
                return false;
            }
        }
        {
            String lhsTaxReturnEFilingFailureReason;
            lhsTaxReturnEFilingFailureReason = this.getTaxReturnEFilingFailureReason();
            String rhsTaxReturnEFilingFailureReason;
            rhsTaxReturnEFilingFailureReason = that.getTaxReturnEFilingFailureReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxReturnEFilingFailureReason", lhsTaxReturnEFilingFailureReason), LocatorUtils.property(thatLocator, "taxReturnEFilingFailureReason", rhsTaxReturnEFilingFailureReason), lhsTaxReturnEFilingFailureReason, rhsTaxReturnEFilingFailureReason, (this.taxReturnEFilingFailureReason!= null), (that.taxReturnEFilingFailureReason!= null))) {
                return false;
            }
        }
        {
            Date lhsEFileErrorFixByDate;
            lhsEFileErrorFixByDate = this.getEFileErrorFixByDate();
            Date rhsEFileErrorFixByDate;
            rhsEFileErrorFixByDate = that.getEFileErrorFixByDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eFileErrorFixByDate", lhsEFileErrorFixByDate), LocatorUtils.property(thatLocator, "eFileErrorFixByDate", rhsEFileErrorFixByDate), lhsEFileErrorFixByDate, rhsEFileErrorFixByDate, (this.eFileErrorFixByDate!= null), (that.eFileErrorFixByDate!= null))) {
                return false;
            }
        }
        {
            AgencyPaymentMethodEnum lhsAgencyPaymentMethod;
            lhsAgencyPaymentMethod = this.getAgencyPaymentMethod();
            AgencyPaymentMethodEnum rhsAgencyPaymentMethod;
            rhsAgencyPaymentMethod = that.getAgencyPaymentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyPaymentMethod", lhsAgencyPaymentMethod), LocatorUtils.property(thatLocator, "agencyPaymentMethod", rhsAgencyPaymentMethod), lhsAgencyPaymentMethod, rhsAgencyPaymentMethod, (this.agencyPaymentMethod!= null), (that.agencyPaymentMethod!= null))) {
                return false;
            }
        }
        {
            String lhsTaxReturnCode;
            lhsTaxReturnCode = this.getTaxReturnCode();
            String rhsTaxReturnCode;
            rhsTaxReturnCode = that.getTaxReturnCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxReturnCode", lhsTaxReturnCode), LocatorUtils.property(thatLocator, "taxReturnCode", rhsTaxReturnCode), lhsTaxReturnCode, rhsTaxReturnCode, (this.taxReturnCode!= null), (that.taxReturnCode!= null))) {
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
            Boolean theUpcomingFiling;
            theUpcomingFiling = this.isUpcomingFiling();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upcomingFiling", theUpcomingFiling), currentHashCode, theUpcomingFiling, (this.upcomingFiling!= null));
        }
        {
            Date theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            Date theFileDate;
            theFileDate = this.getFileDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileDate", theFileDate), currentHashCode, theFileDate, (this.fileDate!= null));
        }
        {
            Date theAgencyPaymentDate;
            theAgencyPaymentDate = this.getAgencyPaymentDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyPaymentDate", theAgencyPaymentDate), currentHashCode, theAgencyPaymentDate, (this.agencyPaymentDate!= null));
        }
        {
            BigDecimal theAgencyPaymentAmount;
            theAgencyPaymentAmount = this.getAgencyPaymentAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyPaymentAmount", theAgencyPaymentAmount), currentHashCode, theAgencyPaymentAmount, (this.agencyPaymentAmount!= null));
        }
        {
            BigDecimal theNetTaxAmountDue;
            theNetTaxAmountDue = this.getNetTaxAmountDue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netTaxAmountDue", theNetTaxAmountDue), currentHashCode, theNetTaxAmountDue, (this.netTaxAmountDue!= null));
        }
        {
            BigDecimal theFlatRateSavingsAmountDue;
            theFlatRateSavingsAmountDue = this.getFlatRateSavingsAmountDue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flatRateSavingsAmountDue", theFlatRateSavingsAmountDue), currentHashCode, theFlatRateSavingsAmountDue, (this.flatRateSavingsAmountDue!= null));
        }
        {
            BigDecimal thePayGWithheldAmount;
            thePayGWithheldAmount = this.getPayGWithheldAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payGWithheldAmount", thePayGWithheldAmount), currentHashCode, thePayGWithheldAmount, (this.payGWithheldAmount!= null));
        }
        {
            ReferenceType theAgencyRef;
            theAgencyRef = this.getAgencyRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyRef", theAgencyRef), currentHashCode, theAgencyRef, (this.agencyRef!= null));
        }
        {
            TaxReturnStatusEnum theTaxReturnStatus;
            theTaxReturnStatus = this.getTaxReturnStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxReturnStatus", theTaxReturnStatus), currentHashCode, theTaxReturnStatus, (this.taxReturnStatus!= null));
        }
        {
            String theTaxReturnEFilingFailureReason;
            theTaxReturnEFilingFailureReason = this.getTaxReturnEFilingFailureReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxReturnEFilingFailureReason", theTaxReturnEFilingFailureReason), currentHashCode, theTaxReturnEFilingFailureReason, (this.taxReturnEFilingFailureReason!= null));
        }
        {
            Date theEFileErrorFixByDate;
            theEFileErrorFixByDate = this.getEFileErrorFixByDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eFileErrorFixByDate", theEFileErrorFixByDate), currentHashCode, theEFileErrorFixByDate, (this.eFileErrorFixByDate!= null));
        }
        {
            AgencyPaymentMethodEnum theAgencyPaymentMethod;
            theAgencyPaymentMethod = this.getAgencyPaymentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyPaymentMethod", theAgencyPaymentMethod), currentHashCode, theAgencyPaymentMethod, (this.agencyPaymentMethod!= null));
        }
        {
            String theTaxReturnCode;
            theTaxReturnCode = this.getTaxReturnCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxReturnCode", theTaxReturnCode), currentHashCode, theTaxReturnCode, (this.taxReturnCode!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
