package buem.erh.summerschool.controller.api;


import buem.erh.summerschool.model.Item;
import buem.erh.summerschool.service.item.impls.ItemServiceImpl;
import buem.erh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemRestController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping("")
    public List<Item> showAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Item showOne(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping("/add")
    public Item insertOne(@RequestBody Item item) {
        return service.create(item);
    }

    @PutMapping("/update")
    public Item updateOne(@RequestBody Item item) {
        return this.service.update(item);
    }


}
