package com.nullpointer.lfind.controller;

import com.nullpointer.lfind.common.BaseResult;
import com.nullpointer.lfind.dao.entity.Item;
import com.nullpointer.lfind.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(tags = "帖子管理接口")
@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @ApiOperation("查询所有帖子的接口")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResult<List<Item>> findAll(){
        try {
            List<Item> items = itemService.findAll();
            return BaseResult.success(items);
        }catch (Exception e){
            return  BaseResult.fail(e.getMessage());
        }
    }


    @ApiOperation("添加帖子的接口")
    @ApiImplicitParam(name = "Item", value = "帖子对象",  required = true)
    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    public BaseResult<Object> addOne(@RequestBody Item item){
        try {
             itemService.addOne(item);
            return BaseResult.success(null);
        }catch (Exception e){
            return  BaseResult.fail(e.getMessage());
        }
    }

    @ApiOperation("更新帖子的接口")
    @ApiImplicitParam(name = "Item", value = "帖子对象",  required = true)
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResult<Object> update(@RequestBody Item item){
        try {
            itemService.addOne(item);
            return BaseResult.success(null);
        }catch (Exception e){
            return  BaseResult.fail(e.getMessage());
        }
    }



}
