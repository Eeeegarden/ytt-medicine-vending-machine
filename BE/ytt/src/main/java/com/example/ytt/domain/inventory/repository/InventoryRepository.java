package com.example.ytt.domain.inventory.repository;

import com.example.ytt.domain.inventory.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long>, InventoryRepositoryCustom {

    List<Inventory> findByMedicineId(Long medicineId); // 약품 ID로 검색 (특정 약품을 가지고 있는 재고 목록 (자판기) 조회)

    void deleteByVendingMachineIdAndMedicineId(Long vendingMachineId, Long medicineId); // 자판기 ID와 약품 ID로 삭제 (특정 자판기의 특정 약품 삭제)

}
