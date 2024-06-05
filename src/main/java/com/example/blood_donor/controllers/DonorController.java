package com.example.blood_donor.controllers;

import com.example.blood_donor.domain.Donor;
import com.example.blood_donor.service.VerifyDonorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doador")
public class DonorController {
    @Autowired
    private VerifyDonorUseCase verifyDonorUseCase;

    @GetMapping("/searchtb")
    public List<Donor> getDonors(@RequestParam String tipo, @RequestParam String bairro) {
        return verifyDonorUseCase.findDonors(tipo, bairro);
    }

    @GetMapping("/searchuser")
    public List<Donor> getDonorsByName(@RequestParam String nome) {
        return verifyDonorUseCase.findDonorsByName(nome);
    }

    @PostMapping("/add")
    public Donor addDonor(@RequestBody Donor donor) {
        return verifyDonorUseCase.addDonor(donor);
    }
}
