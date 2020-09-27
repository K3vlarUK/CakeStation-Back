package com.example.CakeStation.repositories;

import com.example.CakeStation.models.Cake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake, Integer> {


}
