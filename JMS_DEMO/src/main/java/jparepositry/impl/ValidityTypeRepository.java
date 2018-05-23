package jparepositry.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.bonprix.global.businesspartner.model.ValidityTypeEntity;

/**
 * The Interface ValidityTypeRepository.
 *
 * @author p.maurya
 */
public interface ValidityTypeRepository
        extends JpaRepository<ValidityTypeEntity, Long>, JpaSpecificationExecutor<ValidityTypeEntity>, ValidityTypeRepositoryCustom {
}