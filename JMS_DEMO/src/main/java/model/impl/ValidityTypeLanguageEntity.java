/**
 *
 */
package model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import de.bonprix.global.businesspartner.common.BizPartnerConstants;
import de.bonprix.global.businesspartner.dto.ValidityType;
import de.bonprix.global.businesspartner.dto.ValidityTypeLanguage;
import de.bonprix.service.I18NLanguageElementEntity;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * The language entity for ValidityType.
 *
 * @author p.maurya
 *
 */

@GeneratePojoBuilder(
    intoPackage = "*.builder")
@Entity
@Table(
    name = "BP_VALIDITYTYPE_L",
    schema = BizPartnerConstants.SCHEMA)
@SequenceGenerator(
    schema = BizPartnerConstants.SCHEMA,
    name = "SEQ_BP_VALIDITYTYPE_L",
    sequenceName = "DS_GLOBAL.SEQ_BP_VALIDITYTYPE_L",
    allocationSize = 1)
public class ValidityTypeLanguageEntity
        implements I18NLanguageElementEntity<ValidityTypeEntity, ValidityTypeLanguageEntity, ValidityType, ValidityTypeLanguage> {

    /**
     *
     */
    private static final long serialVersionUID = -4829248528377902151L;

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "SEQ_BP_VALIDITYTYPE_L")
    @Column(
        name = "BP_VALIDITYTYPE_L_ID")
    private Long id;

    @Column(
        name = "NAME")
    private String name;

    @Column(
        name = "DESCRIPTION")
    private String description;

    @Column(
        name = "MD_LANGUAGE_ID")
    private Long languageId;

    @ManyToOne(
        fetch = FetchType.LAZY)
    @JoinColumn(
        name = "BP_VALIDITYTYPE_ID")
    private ValidityTypeEntity validityTypeEntity;

    @Override
    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Long getLanguageId() {
        return this.languageId;
    }

    @Override
    public void setLanguageId(final Long languageId) {
        this.languageId = languageId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return the validityTypeEntity
     */
    public ValidityTypeEntity getValidityTypeEntity() {
        return this.validityTypeEntity;
    }

    /**
     * @param validityTypeEntity the validityTypeEntity to set
     */
    public void setValidityTypeEntity(final ValidityTypeEntity validityTypeEntity) {
        this.validityTypeEntity = validityTypeEntity;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void updateDto(final ValidityTypeLanguage dto) {
        dto.setName(this.name);
        dto.setDescription(this.description);
    }

    @Override
    public void updateEntity(final ValidityTypeLanguage dto) {
        setName(dto.getName());
        setDescription(dto.getDescription());
    }

    @Override
    public void setLanguageContainer(final ValidityTypeEntity languageContainer) {
        setValidityTypeEntity(languageContainer);
    }

}
