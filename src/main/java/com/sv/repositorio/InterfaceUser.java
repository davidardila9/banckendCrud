package com.sv.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.modelos.clientebanco;


@Repository
public interface InterfaceUser extends CrudRepository<clientebanco, Integer > {

}
