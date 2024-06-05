package com.example.blood_donor.service;

import com.example.blood_donor.domain.Donor;
import com.example.blood_donor.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerifyDonorUseCase {
    @Autowired
    private DonorRepository donorRepository;

    public VerifyDonorUseCase(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public List<Donor> findDonors(String tipo, String bairro) {
        return donorRepository.findByTipoAndBairro(tipo, bairro);
    }
    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);
    }
    public List<Donor> findDonorsByName(String nome) {
        return donorRepository.findByNome(nome);
    }
}