/**
 * 
 */
package com.dss.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dss.model.User;

/**
 * @author s.parmar
 *
 */
public interface EmpRepository extends JpaRepository<User,Integer> {
        
}
