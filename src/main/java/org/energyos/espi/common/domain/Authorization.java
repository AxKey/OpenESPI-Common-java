/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//


package org.energyos.espi.common.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;


/**
 * Represents a permission granted by an owner for access to a resource.
 * <p/>
 * <p>Java class for Authorization complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Authorization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="accessToken" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *         &lt;element name="authorizationServer" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="authorizedPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="publishedPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="status" type="{http://naesb.org/espi}AuthorizationStatus" minOccurs="0"/>
 *         &lt;element name="thirdParty" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorization", propOrder = {
        "accessToken",
        "authorizationServer",
        "authorizedPeriod",
        "publishedPeriod",
        "resource",
        "status",
        "thirdParty"
})
@Entity
@Table(name = "authorizations")
public class Authorization
        extends IdentifiedObject {
    @Column(name = "access_token")
    @NotEmpty
    protected String accessToken;
    @XmlSchemaType(name = "anyURI")
    protected String authorizationServer;
    @Transient
    protected DateTimeInterval authorizedPeriod;
    @Transient
    protected DateTimeInterval publishedPeriod;
    @XmlSchemaType(name = "anyURI")
    @NotEmpty
    protected String resource;
    protected String status;
    protected String thirdParty;

    @Override
    @NotNull
    public UUID getUUID() {
        return super.getUUID();
    }

    /**
     * Gets the value of the accessToken property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the authorizationServer property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAuthorizationServer() {
        return authorizationServer;
    }

    /**
     * Sets the value of the authorizationServer property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setAuthorizationServer(String value) {
        this.authorizationServer = value;
    }

    /**
     * Gets the value of the authorizedPeriod property.
     *
     * @return possible object is
     *         {@link DateTimeInterval }
     */
    public DateTimeInterval getAuthorizedPeriod() {
        return authorizedPeriod;
    }

    /**
     * Sets the value of the authorizedPeriod property.
     *
     * @param value allowed object is
     * {@link DateTimeInterval }
     */
    public void setAuthorizedPeriod(DateTimeInterval value) {
        this.authorizedPeriod = value;
    }

    /**
     * Gets the value of the publishedPeriod property.
     *
     * @return possible object is
     *         {@link DateTimeInterval }
     */
    public DateTimeInterval getPublishedPeriod() {
        return publishedPeriod;
    }

    /**
     * Sets the value of the publishedPeriod property.
     *
     * @param value allowed object is
     * {@link DateTimeInterval }
     */
    public void setPublishedPeriod(DateTimeInterval value) {
        this.publishedPeriod = value;
    }

    /**
     * Gets the value of the resource property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the thirdParty property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdParty() {
        return thirdParty;
    }

    /**
     * Sets the value of the thirdParty property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdParty(String value) {
        this.thirdParty = value;
    }

}
