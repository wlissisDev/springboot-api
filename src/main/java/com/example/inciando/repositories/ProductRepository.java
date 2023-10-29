package com.example.inciando.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inciando.models.ProductModel;

//essa interface que vai conter todos os métodos PUT DELETE POST E GET..
//por conta do classe JpaRepository que vai implementar o Model seu tipo de identificador
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
