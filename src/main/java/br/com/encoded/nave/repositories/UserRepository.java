package br.com.encoded.nave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.encoded.nave.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
