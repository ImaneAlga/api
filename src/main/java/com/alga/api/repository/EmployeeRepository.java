package com.alga.api.repository;

import com.alga.api.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository
 *  qui implemente l'interface JPARepository ou CrudRepository
 * 	 En effet cette interface encapsule les fonction du CRUD pour la classe passé en parmettre entre < et > de l'interface
 * 	 generique
 * 	 les fonctions sont vraiment intuitif genre, findAll pour select *, findById, findByName... vraiment
 */

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}