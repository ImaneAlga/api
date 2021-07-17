package com.alga.api.service;

import com.alga.api.repository.EmployeeRepository;

import java.util.Optional;

import com.alga.api.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

/**
 * La classe possede deux annotation  :
 * - Data : annotation lombock pour specifier qu'il s'agit d'un bean java ainsi vous n'aurez pas besoin de
 * recrire les constructeur getteurs et setteurs
 *
 * - Service : c'est pour specifier qu'il s'agit d'un service, un service engloble les differentes methodes liées
 * à un modules du projets
 */
@Data
@Service
public class EmployeeService {

	/**
	 * Autowired indique un injection de dpendance, on n'initialise pas l'objet mais on peut l'utiliser sans generer une erreur
	 *L'objet vient de la classe @{@link EmployeeRepository}
	 * */
	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * On passe l'id en paramettre pour recuperer l'objet avec la fonction findById de JpaRepository ou CrudRepository
	 * @param id
	 * @return
	 */
	public Optional<Employee> getEmployee(final Long id) {
		return employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

}