package com.javanauta.usuario.infrastructure.repository;

import com.javanauta.aprendendospring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderedoRepository extends JpaRepository<Endereco, Long> {
}
