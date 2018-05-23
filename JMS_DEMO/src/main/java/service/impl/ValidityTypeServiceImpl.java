/*
 *
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Resource;

import org.springframework.security.access.prepost.PreAuthorize;

import de.bonprix.annotation.RestService;
import de.bonprix.global.businesspartner.dto.Parameters;
import de.bonprix.global.businesspartner.dto.ValidityType;
import de.bonprix.global.businesspartner.dto.ValidityTypeLanguage;
import de.bonprix.global.businesspartner.dto.builder.ParametersBuilder;
import de.bonprix.global.businesspartner.jparepository.ValidityTypeRepository;
import de.bonprix.global.businesspartner.model.ValidityTypeEntity;
import de.bonprix.global.businesspartner.model.ValidityTypeLanguageEntity;
import de.bonprix.global.businesspartner.operations.FilterClauseStatement;
import de.bonprix.global.businesspartner.operations.enums.AppenderEnum;
import de.bonprix.global.businesspartner.operations.enums.OperationsEnum;
import de.bonprix.global.businesspartner.operations.enums.ValidityTypeFilterEnum;
import de.bonprix.global.businesspartner.role.Roles;
import de.bonprix.model.Paged;
import de.bonprix.service.DtoEntityConverterUtils;

/**
 * The Class ValidityTypeServiceImpl.
 *
 * @author p.maurya
 */
@RestService
public class ValidityTypeServiceImpl implements ValidityTypeService {

    /** The repository. */
    @Resource
    private ValidityTypeRepository repository;

    /**
     * Find all.
     *
     * @param pagable the pagable
     * @return the list
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.READ + "')")
    public List<ValidityType> findAll(final Paged pagable) {
        return findAll(new ParametersBuilder<ValidityTypeFilterEnum>().withPaged(pagable)
            .build());
    }

    /**
     * Find by id.
     *
     * @param validityTypeId the validity type id
     * @return the validity type
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.READ + "')")
    public ValidityType findById(final Long validityTypeId) {
        final List<ValidityType> validityTypes = findAll(new ParametersBuilder<ValidityTypeFilterEnum>().withFilterClauses(Stream
            .of(new FilterClauseStatement<>(ValidityTypeFilterEnum.VALIDITY_TYPE_ID, OperationsEnum.EQ, AppenderEnum.AND, validityTypeId))
            .collect(Collectors.toSet()))
            .build());
        return validityTypes.get(0);
    }

    /**
     * Creates the.
     *
     * @param validityType the validity type
     * @return the long
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.WRITE + "')")
    public Long create(final ValidityType validityType) {
        final ValidityTypeEntity validityTypeEntity = this.repository
            .save(DtoEntityConverterUtils.convertToLanguageContainerEntity(new ValidityTypeEntity(), validityType, ValidityTypeLanguageEntity.class));
        return validityTypeEntity.getId();
    }

    /**
     * Update.
     *
     * @param validityTypeId the validity type id
     * @param validityType the validity type
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.WRITE + "')")
    public void update(final Long validityTypeId, final ValidityType validityType) {
        final ValidityTypeEntity validityTypeEntity = this.repository.findOne(validityTypeId);
        this.repository.save(DtoEntityConverterUtils.convertToLanguageContainerEntity(validityTypeEntity, validityType, ValidityTypeLanguageEntity.class));
    }

    /**
     * Activate.
     *
     * @param validityTypeId the validity type id
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.WRITE + "')")
    public void activate(final Long validityTypeId) {
        final ValidityTypeEntity validityTypeEntity = this.repository.findOne(validityTypeId);
        validityTypeEntity.setIsDeactivated(Boolean.FALSE);
        this.repository.save(validityTypeEntity);
    }

    /**
     * Deactivate.
     *
     * @param validityTypeId the validity type id
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.WRITE + "')")
    public void deactivate(final Long validityTypeId) {
        final ValidityTypeEntity validityTypeEntity = this.repository.findOne(validityTypeId);
        validityTypeEntity.setIsDeactivated(Boolean.TRUE);
        this.repository.save(validityTypeEntity);
    }

    /**
     * Find all.
     *
     * @param params the params
     * @return the list
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.READ + "')")
    public List<ValidityType> findAll(final Parameters<ValidityTypeFilterEnum> params) {
        final List<ValidityTypeEntity> validityTypeEntities = this.repository.findAll(params);
        final List<ValidityType> validityTypeDtos = new ArrayList<>();
        for (final ValidityTypeEntity validityEntity : validityTypeEntities) {
            validityTypeDtos.add(DtoEntityConverterUtils.convertToLanguageContainerDTO(validityEntity, ValidityType.class, ValidityTypeLanguage.class));
        }
        return validityTypeDtos;
    }

    /**
     * Count.
     *
     * @return the long
     */
    @Override
    @PreAuthorize("hasRole('ROLE_" + Roles.READ + "')")
    public Long count() {
        return this.repository.count();
    }

}
