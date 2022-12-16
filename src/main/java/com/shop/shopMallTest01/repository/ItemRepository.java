package com.shop.shopMallTest01.repository;

import com.shop.shopMallTest01.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    public List<Item> findByItemName(String itemName);
}
