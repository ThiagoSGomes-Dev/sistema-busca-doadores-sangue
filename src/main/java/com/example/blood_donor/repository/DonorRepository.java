package com.example.blood_donor.repository;

import com.example.blood_donor.domain.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DonorRepository extends JpaRepository<Donor, UUID> {
    List<Donor> findByTipoAndBairro(String tipo, String bairro);
    List<Donor> findByNome(String nome);
}