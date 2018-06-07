
/*
 * Copyright (c) 2018 Bonprix and/or its affiliates. All rights reserved.
 * Bonprix PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.chotu.springelastic.search.api.repository;

import org.chotu.springelastic.search.api.model.HdfcIfscCodeEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * The <code>RegistretionRepository</code> class contains several useful methods
 * that implements from Spring data jpa
 * and lombok Annotation 
 *
 * 
 *
 * @author  I.Shaikh
 * 
 */

public interface RegistretionRepositoryfor extends ElasticsearchRepository<HdfcIfscCodeEntity, Integer>{

}
