
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
package org.hdfc.ifsc.dao;

import org.hdfc.ifsc.entity.HdfcIfscCodeEntity;
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

public interface RegistretionRepository extends CrudRepository<HdfcIfscCodeEntity, Integer>{

}
