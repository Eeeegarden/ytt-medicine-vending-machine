package com.example.ytt.domain.inventory.repository;

import com.example.ytt.domain.inventory.domain.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepositoryCustom {

    List<Inventory> getInventories(Long vendingMachineId);

    List<Inventory> getInventories(Long vendingMachineId, List<String> poductCodes);

    Optional<Inventory> getInventory(Long vendingMachineId, Long medicineId);

}
