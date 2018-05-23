/**
 *
 */
package jparepositry.impl;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.impl.JPAQuery;

import de.bonprix.global.businesspartner.dto.Parameters;
import de.bonprix.global.businesspartner.model.QValidityTypeEntity;
import de.bonprix.global.businesspartner.model.ValidityTypeEntity;
import de.bonprix.global.businesspartner.operations.FilterClauseStatement;
import de.bonprix.global.businesspartner.operations.OperationsUtil;
import de.bonprix.global.businesspartner.operations.enums.ValidityTypeFilterEnum;
import de.bonprix.model.Paged;

/**
 * @author p.maurya
 *
 */
public class ValidityTypeRepositoryImpl implements ValidityTypeRepositoryCustom {

    @Resource
    private EntityManager entityManager;

    @Override
    public List<ValidityTypeEntity> findAll(final Parameters<ValidityTypeFilterEnum> parameters) {

        final QValidityTypeEntity qType = QValidityTypeEntity.validityTypeEntity;

        /* Initial Query */
        final JPAQuery<ValidityTypeEntity> jpaQuery = createValidityTypeJPAQueryFilterClause(qType, parameters.getFilterClauses());

        final List<ValidityTypeEntity> validityTypes = getValidityTypeListPaged(jpaQuery, parameters.getPaged());

        if (validityTypes == null) {
            return new ArrayList<>();
        }

        return validityTypes;
    }

    private JPAQuery<ValidityTypeEntity> createValidityTypeJPAQueryFilterClause(final QValidityTypeEntity qType,
            final Set<FilterClauseStatement<ValidityTypeFilterEnum>> typeFilter) {

        /* Initial Query */
        JPAQuery<ValidityTypeEntity> jpaQuery = getInitialQuery(qType);

        /* Handle where clause */
        final BooleanBuilder builder = handleCommonWhereClause(qType, typeFilter);

        /* Final Query Execution and Result Set Extraction */
        jpaQuery = jpaQuery.where(builder.getValue());

        return jpaQuery;
    }

    private JPAQuery<ValidityTypeEntity> getInitialQuery(final QValidityTypeEntity qType) {
        JPAQuery<ValidityTypeEntity> jpaQuery = new JPAQuery<>(this.entityManager);
        jpaQuery = jpaQuery.from(qType);
        return jpaQuery;
    }

    private BooleanBuilder handleCommonWhereClause(final QValidityTypeEntity qType, final Set<FilterClauseStatement<ValidityTypeFilterEnum>> typeFilter) {

        final BooleanBuilder builder = new BooleanBuilder();
        final EnumMap<ValidityTypeFilterEnum, Path<?>> map = prepareMap(qType);
        if (typeFilter != null) {
            for (final FilterClauseStatement<ValidityTypeFilterEnum> instance : typeFilter) {
                OperationsUtil.handlerAppenders(instance, builder, map.get(instance.getProperty()));
            }
        }
        return builder;
    }

    private EnumMap<ValidityTypeFilterEnum, Path<?>> prepareMap(final QValidityTypeEntity qType) {
        final EnumMap<ValidityTypeFilterEnum, Path<?>> map = new EnumMap<>(ValidityTypeFilterEnum.class);

        map.put(ValidityTypeFilterEnum.VALIDITY_TYPE_ID, qType.id);
        map.put(ValidityTypeFilterEnum.VALIDITY_NO, qType.validityNo);
        map.put(ValidityTypeFilterEnum.IS_DEACTIVATED, qType.isDeactivated);
        map.put(ValidityTypeFilterEnum.CLIENT_ID, qType.clientId);
        map.put(ValidityTypeFilterEnum.NAME, qType.validityTypeLanguageEntities.any().name);
        map.put(ValidityTypeFilterEnum.DESCRIPTION, qType.validityTypeLanguageEntities.any().description);

        return map;
    }

    private List<ValidityTypeEntity> getValidityTypeListPaged(final JPAQuery<ValidityTypeEntity> jpaQuery, final Paged paged) {
        if (paged != null) {
            return jpaQuery.offset(paged.getPage())
                .limit(paged.getPageSize())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        }
        else {
            return jpaQuery.fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        }
    }
}
