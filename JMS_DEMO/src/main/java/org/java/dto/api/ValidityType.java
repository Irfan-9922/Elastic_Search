/**
 *
 */
package org.java.dto.api;

import de.bonprix.dto.AbstractI18NLanguageContainer;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * @author p.maurya
 *
 */
@GeneratePojoBuilder(
    intoPackage = "*.builder")
public class ValidityType extends AbstractI18NLanguageContainer<ValidityTypeLanguage> {

    /**
     *
     */
    private static final long serialVersionUID = -7810701076966674407L;
    private Long validityNo;
    private Boolean isDeactived;
    private boolean active;
    private boolean isOrderAllowed = false;
    private Long clientId;

    /**
     * @return the validityNo
     */
    public Long getValidityNo() {
        return this.validityNo;
    }

    /**
     * @param validityNo the validityNo to set
     */
    public void setValidityNo(final Long validityNo) {
        this.validityNo = validityNo;
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
     * @return the isDeactived
     */
    public Boolean getIsDeactived() {
        return this.isDeactived;
    }

    /**
     * @param isDeactived the isDeactived to set
     */
    public void setIsDeactived(final Boolean isDeactived) {
        this.isDeactived = isDeactived;
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
     * @return the active
     */
    public boolean isActive() {
        return this.active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(final boolean active) {
        this.active = active;
    }

}
