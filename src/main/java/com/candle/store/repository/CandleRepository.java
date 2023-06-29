package com.candle.store.repository;

import com.candle.store.entity.Candle;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandleRepository extends JpaRepository<Candle, Integer> {
}
