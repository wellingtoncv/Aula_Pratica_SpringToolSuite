package com.EngSoftware.aulapratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EngSoftware.aulapratica.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

//Classe que fará todas as consultas, atualizações , inserções e deleção no banco