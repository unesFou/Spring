package com.pos.v1.service;

import java.util.List;

import com.pos.v1.entities.Item;
import com.pos.v1.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository itemRepository;

    public Item saveIteme(Item item){
        return itemRepository.save(item);
    }

    public List<Item> selectAllItem(){
        return itemRepository.findAll();
    }

    public void deletItemById(int id){
        itemRepository.deleteById(id);
    }
}
