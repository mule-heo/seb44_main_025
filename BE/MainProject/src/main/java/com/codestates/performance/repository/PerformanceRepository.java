package com.codestates.performance.repository;

import com.codestates.performance.entity.Performance;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    Page<Performance> findAll(Pageable pageable);
}
