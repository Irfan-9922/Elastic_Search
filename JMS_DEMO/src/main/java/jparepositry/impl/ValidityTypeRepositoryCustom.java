/**
 *
 */
package jparepositry.impl;

import java.util.List;

import de.bonprix.global.businesspartner.dto.Parameters;
import de.bonprix.global.businesspartner.model.ValidityTypeEntity;
import de.bonprix.global.businesspartner.operations.enums.ValidityTypeFilterEnum;

/**
 * @author p.maurya
 *
 */
public interface ValidityTypeRepositoryCustom {

    /**
     * Find all.
     *
     * @param parameters the parameters
     * @return the list
     */
    List<ValidityTypeEntity> findAll(Parameters<ValidityTypeFilterEnum> parameters);

}
