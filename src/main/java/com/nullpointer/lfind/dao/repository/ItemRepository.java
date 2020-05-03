package com.nullpointer.lfind.dao.repository;

import com.nullpointer.lfind.dao.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends JpaRepository<Item,String> {



    @Modifying
    @Query("update Item i set i.contact = 2,i.contactType = 3,i.title = 4, i.type = 5, i.description =6," +
            "i.timeDesc = 7,i.positionDesc = 8,i.imgUrl = 9,i.category = 10" +
            " where i.id = ?1")
    Integer update(String id, String contact,Integer contactType,String title,Integer type,
                   String description,String timeDesc,String positionDesc,String imgUrl,Integer category);
}
