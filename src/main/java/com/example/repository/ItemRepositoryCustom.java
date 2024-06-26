package com.example.repository;

import com.example.dto.ItemSearchDto;
import com.example.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.dto.MainItemDto;

public interface ItemRepositoryCustom{
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto,Pageable pageable);

}