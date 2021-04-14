package com.example.demo.services;

import com.example.demo.entities.Item;
import com.example.demo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
public class ItemsService {

    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Page<Item> getItemsWithPagingAndFiltering(Specification<Item> specification, Pageable pageable) {
        return itemRepository.findAll(specification, pageable);
    }

}
