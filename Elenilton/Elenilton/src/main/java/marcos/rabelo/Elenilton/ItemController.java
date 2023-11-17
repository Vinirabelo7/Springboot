package marcos.rabelo.Elenilton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<List<Item>> listarItens() {
        List<Item> itens = itemService.listarItens();
        return new ResponseEntity<>(itens, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Item> criarItem(@RequestBody Item item) {
        Item novoItem = itemService.criarItem(item);
        return new ResponseEntity<>(novoItem, HttpStatus.CREATED);
    }

    
}
