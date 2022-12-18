package com.saff.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saff.inventoryservice.model.Inventory;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
