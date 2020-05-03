package com.nullpointer.lfind.service;

import com.nullpointer.lfind.dao.entity.Item;
import java.util.List;


public interface ItemService {


     List<Item> findAll();


     void addOne(Item item);


     void updateOne(Item item);
}
