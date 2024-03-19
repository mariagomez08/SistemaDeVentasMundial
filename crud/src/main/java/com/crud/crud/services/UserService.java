package com.crud.crud.services;

import com.crud.crud.models.UserModel;
import com.crud.crud.repositories.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
//procesa los datos y Realiza las operaciones necesarias en los datos uilizando los metodos proporcionados
//por el repositorio y devuelve los resultados al controlador.
public class UserService {

    @Autowired //inyeccion de dependencias
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {//recuperar información
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) { //guradar un usuario
        return userRepository.save(user);
    }

    //Consultar el usuario a traves de ID
    public Optional<UserModel> getByID(Long id) {//java optional hace referencia a que puede tener un valor asignado o null
        return userRepository.findById(id);
    }

    public UserModel updateByID(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();

        user.setApellido(request.getApellido());//se le agrega el apellido
        user.setNombre(request.getNombre());
        user.setEmail(request.getEmail());

        return user;
    }

    public Boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;

        }catch (Exception e){
            return false;
        }

    }
}
