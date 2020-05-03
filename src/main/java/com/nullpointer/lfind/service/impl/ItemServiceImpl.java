package com.nullpointer.lfind.service.impl;

import com.nullpointer.lfind.dao.entity.Item;
import com.nullpointer.lfind.dao.repository.ItemRepository;
import com.nullpointer.lfind.service.ItemService;
import com.nullpointer.lfind.utils.BaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return  itemRepository.findAll();
    }


    @Override
   // @Transactional
    public void addOne(Item item){

        item.setId(BaseUtil.getUUID());

        itemRepository.save(item);
    }



    @Override
   // @Transactional
    public void updateOne(Item item){
        itemRepository.update(item.getId(),item.getContact(),item.getContactType(),item.getTitle(),item.getType(),
                item.getDescription(),item.getTimeDesc(),item.getPositionDesc(),item.getImgUrl(),item.getCategory());
    }
}
