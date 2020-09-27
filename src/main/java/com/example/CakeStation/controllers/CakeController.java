package com.example.CakeStation.controllers;

import java.util.List;
import java.util.Optional;

import com.example.CakeStation.models.Cake;
import com.example.CakeStation.repositories.CakeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cakes")
public class CakeController {
    @Autowired
    CakeRepository cakeRepository;

    @GetMapping
    public List<Cake> getAllCakes(){
        return cakeRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Cake> getCake(@PathVariable Integer id){
        return cakeRepository.findById(id);
    }

    @PostMapping
    public Cake newCake(@RequestBody Cake newCake){
        return cakeRepository.save(newCake);
    }

    @PutMapping(value = "/{id}")
    public Cake updatenewCake(@RequestBody Cake cake, @PathVariable Integer id){
        cake.setId(id);
        return cakeRepository.save(cake);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCake(@PathVariable Integer id) {
        cakeRepository.deleteById(id);
    }

}
