package com.shop.shopMallTest01;

import com.shop.shopMallTest01.entity.Item;
import com.shop.shopMallTest01.repository.ItemRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

//    @Test
//    @DisplayName("상품 정보 저장 테스트")
//    public void createItemTest() {
//        Item item = new Item();
//        item.setItemName("1번상품");
//        item.setPrice(5500);
//        item.setStockCount(35);
//
//        Item savedItem = itemRepository.save(item);
//    }
    @Test
    @DisplayName("상품 조회 테스트")
    public void findByNameTest() {
        List<Item> items = itemRepository.findByItemName("1번상품");

        for (Item item:items) {
            System.out.println(item.toString());
        }
    }
}
