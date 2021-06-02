package com.benestudio.stockExchange.repository;

import com.benestudio.stockExchange.model.StockTrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockTradeRepository extends JpaRepository<StockTrade, Integer> {
}
