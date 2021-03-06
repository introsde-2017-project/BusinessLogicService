
package introsde.project.storage.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.RecombeeDBType;


/**
 * <p>Java class for addNewRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNewRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbName" type="{http://soap.recombee.adopter.project.introsde/}recombeeDBType" minOccurs="0"/>
 *         &lt;element name="evaluation" type="{http://soap.recombee.adopter.project.introsde/}evaluation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewRating", propOrder = {
    "dbName",
    "evaluation"
})
public class AddNewRating {

    @XmlSchemaType(name = "string")
    protected RecombeeDBType dbName;
    protected Evaluation evaluation;

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link RecombeeDBType }
     *     
     */
    public RecombeeDBType getDbName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecombeeDBType }
     *     
     */
    public void setDbName(RecombeeDBType value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the evaluation property.
     * 
     * @return
     *     possible object is
     *     {@link Evaluation }
     *     
     */
    public Evaluation getEvaluation() {
        return evaluation;
    }

    /**
     * Sets the value of the evaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Evaluation }
     *     
     */
    public void setEvaluation(Evaluation value) {
        this.evaluation = value;
    }

}
