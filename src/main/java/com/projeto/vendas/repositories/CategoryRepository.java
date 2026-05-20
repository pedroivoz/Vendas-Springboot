package com.projeto.vendas.repositories;

import com.projeto.vendas.entities.Category;
import com.projeto.vendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
