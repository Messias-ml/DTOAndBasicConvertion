package com.messiasprojetos.messiasDTO.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BDClientesRepository extends JpaRepository<ClienteBDEntity, Long> {
}
