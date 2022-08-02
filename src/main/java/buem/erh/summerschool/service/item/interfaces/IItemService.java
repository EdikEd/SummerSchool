package buem.erh.summerschool.service.item.interfaces;

import buem.erh.summerschool.model.Item;

import java.util.List;

public interface IItemService {
    Item create(Item item);
    Item update(Item item);
    Item get(String id);
    void delete(String id);
    List<Item> getAll();


    // POJO - Plain Old Java Object
}
