package com.example.demo.repositories;

import com.example.demo.entities.Item;
import com.example.demo.entities.ItemProjection;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long>, JpaSpecificationExecutor<Item> {
    List<ItemProjection> findItemProjectionsByCost(int cost);
}
