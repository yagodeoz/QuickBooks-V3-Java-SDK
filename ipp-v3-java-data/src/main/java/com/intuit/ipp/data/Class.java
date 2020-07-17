//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Classes provide a way to track different segments
 * 				of the business, and to break down the income and expenses for each
 * 				segment. Classes can apply to all transactions, so they're not tied
 * 				to a particular client or project.
 * 
 * <p>Java class for Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Class"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FullyQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClassEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "name",
    "subClass",
    "parentRef",
    "fullyQualifiedName",
    "active",
    "classEx"
})
public class Class
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SubClass")
    protected Boolean subClass;
    @XmlElement(name = "ParentRef")
    protected ReferenceType parentRef;
    @XmlElement(name = "FullyQualifiedName")
    protected String fullyQualifiedName;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ClassEx")
    protected IntuitAnyType classEx;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubClass() {
        return subClass;
    }

    /**
     * Sets the value of the subClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubClass(Boolean value) {
        this.subClass = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setParentRef(ReferenceType value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the classEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getClassEx() {
        return classEx;
    }

    /**
     * Sets the value of the classEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setClassEx(IntuitAnyType value) {
        this.classEx = value;
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
        final Class that = ((Class) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSubClass;
            lhsSubClass = this.isSubClass();
            Boolean rhsSubClass;
            rhsSubClass = that.isSubClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subClass", lhsSubClass), LocatorUtils.property(thatLocator, "subClass", rhsSubClass), lhsSubClass, rhsSubClass, (this.subClass!= null), (that.subClass!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsParentRef;
            lhsParentRef = this.getParentRef();
            ReferenceType rhsParentRef;
            rhsParentRef = that.getParentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentRef", lhsParentRef), LocatorUtils.property(thatLocator, "parentRef", rhsParentRef), lhsParentRef, rhsParentRef, (this.parentRef!= null), (that.parentRef!= null))) {
                return false;
            }
        }
        {
            String lhsFullyQualifiedName;
            lhsFullyQualifiedName = this.getFullyQualifiedName();
            String rhsFullyQualifiedName;
            rhsFullyQualifiedName = that.getFullyQualifiedName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullyQualifiedName", lhsFullyQualifiedName), LocatorUtils.property(thatLocator, "fullyQualifiedName", rhsFullyQualifiedName), lhsFullyQualifiedName, rhsFullyQualifiedName, (this.fullyQualifiedName!= null), (that.fullyQualifiedName!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsClassEx;
            lhsClassEx = this.getClassEx();
            IntuitAnyType rhsClassEx;
            rhsClassEx = that.getClassEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classEx", lhsClassEx), LocatorUtils.property(thatLocator, "classEx", rhsClassEx), lhsClassEx, rhsClassEx, (this.classEx!= null), (that.classEx!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            Boolean theSubClass;
            theSubClass = this.isSubClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subClass", theSubClass), currentHashCode, theSubClass, (this.subClass!= null));
        }
        {
            ReferenceType theParentRef;
            theParentRef = this.getParentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentRef", theParentRef), currentHashCode, theParentRef, (this.parentRef!= null));
        }
        {
            String theFullyQualifiedName;
            theFullyQualifiedName = this.getFullyQualifiedName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullyQualifiedName", theFullyQualifiedName), currentHashCode, theFullyQualifiedName, (this.fullyQualifiedName!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            IntuitAnyType theClassEx;
            theClassEx = this.getClassEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classEx", theClassEx), currentHashCode, theClassEx, (this.classEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
