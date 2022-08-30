package com.gourdcrab.online.repository;

import com.gourdcrab.online.model.Money;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMoneyRepository extends JpaRepository<Money, Integer> {
}
