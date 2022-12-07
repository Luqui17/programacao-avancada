package com.go.learn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.go.learn.model.ProfessorModel;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {
    
}
