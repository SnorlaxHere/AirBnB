package com.mohsin.AirBnb.Strategy;

import com.mohsin.AirBnb.Entities.InventoryEntity;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
