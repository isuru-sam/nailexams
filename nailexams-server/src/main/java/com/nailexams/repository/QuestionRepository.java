package com.nailexams.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nailexams.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
    Page<Question> findAll(Pageable pageable);
}
