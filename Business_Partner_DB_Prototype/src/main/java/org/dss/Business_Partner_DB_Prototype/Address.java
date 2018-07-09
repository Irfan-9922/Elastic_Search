package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(
        name = "BP_ADDRESS"
        )
public class Address {

    @Id
    @Column(
            name = "BP_ADDRESS_ID")
   
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "BP_COMPANY_ID")
    private Company company;

    @ManyToOne(
            fetch = FetchType.EAGER)
    @JoinColumn(
            name = "BP_ADDRESS_TYPE_ID")
    private AddressType addressType;

    @Column(
            name = "STREET_1",
            nullable = true)
    private String street1;

    @Column(
            name = "STREET_2",
            nullable = true)
    private String street2;

    @Column(
            name = "STREET_3",
            nullable = true)
    private String street3;

    @Column(
            name = "ZIP_CODE",
            nullable = true)
    private String zipcode;

    @Column(
            name = "CITY")
    private String city;

    @Column(
            name = "MD_COUNTRY_ID")
    private Long countryId;

    @Column(
            name = "FAX_NUMBER",
            nullable = true)
    private String faxNumber;

    @Column(
            name = "PHONE_NUMBER",
            nullable = true)
    private String phoneNumber;

    @Column(
            name = "ADDRESS_NAME",
            nullable = true)
    private String name;

    @Column(
            name = "BP_WORKFLOW_ID")
    private Long workFlowId;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

    public AddressType getAddressType() {
        return this.addressType;
    }

    public void setAddressType(final AddressType addressType) {
        this.addressType = addressType;
    }

    public String getStreet1() {
        return this.street1;
    }

    public void setStreet1(final String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return this.street2;
    }

    public void setStreet2(final String street2) {
        this.street2 = street2;
    }

    public String getStreet3() {
        return this.street3;
    }

    public void setStreet3(final String street3) {
        this.street3 = street3;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public Long getCountryId() {
        return this.countryId;
    }

    public void setCountryId(final Long countryId) {
        this.countryId = countryId;
    }

    public String getFaxNumber() {
        return this.faxNumber;
    }

    public void setFaxNumber(final String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Long getWorkFlowId() {
        return this.workFlowId;
    }
}