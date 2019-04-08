/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import org.docx4j.dml.ArrayListDml;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_DuotoneEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_DuotoneEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_ColorChoice" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_DuotoneEffect", propOrder = {
    "egColorChoice"
})
public class CTDuotoneEffect {

    @XmlElements({
        @XmlElement(name = "sysClr", type = CTSystemColor.class),
        @XmlElement(name = "hslClr", type = CTHslColor.class),
        @XmlElement(name = "schemeClr", type = CTSchemeColor.class),
        @XmlElement(name = "srgbClr", type = CTSRgbColor.class),
        @XmlElement(name = "scrgbClr", type = CTScRgbColor.class),
        @XmlElement(name = "prstClr", type = CTPresetColor.class)
    })
    protected List<Object> egColorChoice = new ArrayListDml<Object>(this);

    /**
     * Gets the value of the egColorChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egColorChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGColorChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSystemColor }
     * {@link CTHslColor }
     * {@link CTSchemeColor }
     * {@link CTSRgbColor }
     * {@link CTScRgbColor }
     * {@link CTPresetColor }
     * 
     * 
     */
    public List<Object> getEGColorChoice() {
        if (egColorChoice == null) {
            egColorChoice = new ArrayListDml<Object>(this);
        }
        return this.egColorChoice;
    }

}