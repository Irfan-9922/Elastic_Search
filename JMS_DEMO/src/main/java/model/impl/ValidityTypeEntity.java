package model.impl;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import de.bonprix.global.businesspartner.common.BizPartnerConstants;
import de.bonprix.global.businesspartner.dto.ValidityType;
import de.bonprix.global.businesspartner.dto.ValidityTypeLanguage;
import de.bonprix.service.BasicTableDtoConverter;
import de.bonprix.service.I18NLanguageContainerEntity;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * The Class ValidityType.
 *
 * @author p.maurya
 */
@GeneratePojoBuilder(
    intoPackage = "*.builder")
@Entity
@Table(
    name = "BP_VALIDITYTYPE",
    schema = BizPartnerConstants.SCHEMA)
@SequenceGenerator(
    schema = BizPartnerConstants.SCHEMA,
    name = "SEQ_BP_VALIDITYTYPE",
    sequenceName = "DS_GLOBAL.SEQ_BP_VALIDITYTYPE",
    allocationSize = 1)
public class ValidityTypeEntity implements I18NLanguageContainerEntity<ValidityTypeEntity, ValidityTypeLanguageEntity, ValidityType, ValidityTypeLanguage>,
        BasicTableDtoConverter<ValidityType> {

    /**
     *
     */
    private static final long serialVersionUID = -1300816106946844550L;

    /** The id. */
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "SEQ_BP_VALIDITYTYPE")
    @Column(
        name = "BP_VALIDITYTYPE_ID")
    private Long id;

    @Column(
        name = "VALIDITY_NO")
    private Long validityNo;

    @Column(
        name = "IS_DEACTIVATED")
    private Boolean isDeactivated;

    @Column(
        name = "IS_ORDERALLOWED")
    private Boolean isOrderAllowed;

    @Column(
        name = "MD_CLIENT_ID")
    private Long clientId;

    @OneToMany(
        orphanRemoval = true,
        mappedBy = "validityTypeEntity",
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER)
    private Set<ValidityTypeLanguageEntity> validityTypeLanguageEntities;

    @Override
    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    /**
     * @return the validityNo
     */
    public Long getValidityNo() {
        return this.validityNo;
    }

    /**
     * @return the isDeactivated
     */
    public Boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    /**
     * @return the isOrderAllowed
     */
    public Boolean getIsOrderAllowed() {
        return this.isOrderAllowed;
    }

    /**
     * @return the clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return the validityTypeLanguageEntities
     */
    public Set<ValidityTypeLanguageEntity> getValidityTypeLanguageEntities() {
        return this.validityTypeLanguageEntities;
    }

    /**
     * @param validityNo the validityNo to set
     */
    public void setValidityNo(final Long validityNo) {
        this.validityNo = validityNo;
    }

    /**
     * @param isDeactivated the isDeactivated to set
     */
    public void setIsDeactivated(final Boolean isDeactivated) {
        this.isDeactivated = isDeactivated;
    }

    /**
     * @param isOrderAllowed the isOrderAllowed to set
     */
    public void setIsOrderAllowed(final Boolean isOrderAllowed) {
        this.isOrderAllowed = isOrderAllowed;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(final Long clientId) {
        this.clientId = clientId;
    }

    /**
     * @param validityTypeLanguageEntities the validityTypeLanguageEntities to set
     */
    public void setValidityTypeLanguageEntities(final Set<ValidityTypeLanguageEntity> validityTypeLanguageEntities) {
        this.validityTypeLanguageEntities = validityTypeLanguageEntities;
    }

    @Override
    public void updateDto(final ValidityType validityType) {
        validityType.setClientId(this.clientId);
        validityType.setIsDeactived(getIsDeactivated());
        validityType.setIsOrderAllowed(getIsOrderAllowed());
        validityType.setValidityNo(getValidityNo());
    }

    @Override
    public void updateEntity(final ValidityType validityType) {
        setClientId(validityType.getClientId());
        setIsDeactivated(validityType.getIsDeactived());
        setIsOrderAllowed(validityType.getIsOrderAllowed());
        setValidityNo(validityType.getValidityNo());
    }

    @Override
    public Set<ValidityTypeLanguageEntity> getLanguageElementEntities() {
        return this.validityTypeLanguageEntities;
    }

    @Override
    public void setLanguageElementEntities(final Set<ValidityTypeLanguageEntity> validityTypeLanguageEntities) {
        this.validityTypeLanguageEntities = validityTypeLanguageEntities;
    }

}
