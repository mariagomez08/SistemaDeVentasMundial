package com.crud.crud.controllers;

import com.crud.crud.models.UserModel;

import com.crud.crud.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController//recibe solicitudes del cliente,invoca los servicios y devuelv una respuesta.
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping // Mapeo de la solicitud HTTP GET para obtener usuarios.
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers(); // Llama al método del servicio para obtener la lista de productos.
    }

    @PostMapping
    public UserModel saveUsers(@RequestBody UserModel user){
        if(user.getNombre().equals("") || user.getNombre() == null){
            throw new RuntimeException("El nombre es requerido");
        }
        return this.userService.saveUser(user);

    }
    @GetMapping(path ="/{id}")
    public Optional<UserModel> getByID(@PathVariable Long id){
        UserModel userModel= userService.getByID(id);

        if(userModel == null){
            return new UserController<>(

            )
        }
    }

    @PutMapping(path ="/{id}")
    public UserModel updateByID(@RequestBody UserModel request, Long id){
        return this.userService.updateByID(request, id);
    }
    @DeleteMapping(path ="/{id}")
    public String deleteByID(@PathVariable("id") Long id){
         boolean ok = this.userService.deleteUser(id);

         if(ok){
             return "El usuario con ID "+id+ " ha sido eliminado";
         }else{
             return "Error";
         }
    }
}
