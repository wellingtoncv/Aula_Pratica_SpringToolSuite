package com.EngSoftware.aulapratica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.EngSoftware.aulapratica.entities.User;
import com.EngSoftware.aulapratica.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        try {
            List<User> result = repository.findAll();
            return result;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Registos não encontrado!", e);
        }
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        try {
            User result = repository.findById(id).orElseThrow(NotFoundException::new);
            return result;
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!", e);
        }
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        try {
            User result = repository.save(user);
            return result;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inclusão não realizada!", e);
        }
    }

    @PutMapping(value = "/{id}")
    public User updateById(@PathVariable Long id, @RequestBody User user) {
    	try {
            User result = repository.save(user);
            return result;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Inclusão não realizada!", e);
        }
 
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        try {
            User user = repository.findById(id).orElseThrow(NotFoundException::new); // Check if the user exists
            repository.delete(user); // Delete the user
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Registro não Encontrado!", e);
        }
    }
    
    @DeleteMapping("/drop-database")
    public void dropDatabase() {
        try {
            repository.deleteAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Erro ao eliminar o banco de dados!", e);
        }

    }
}
