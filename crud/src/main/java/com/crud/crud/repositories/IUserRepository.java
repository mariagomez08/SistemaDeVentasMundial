package com.crud.crud.repositories;

import com.crud.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository; //interfaz que proporciona metodos predefinidos
// para realizar acciones de persistencia
import org.springframework.stereotype.Repository;

@Repository //Abstraccion para acceder y manipular los datos de una DB y realizar las operaciones de persistencia.
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}
