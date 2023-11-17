package marcos.rabelo.Elenilton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> listarItens() {
        return itemRepository.findAll();
    }

    public Item criarItem(Item item) {
        return itemRepository.save(item);
    }

  
}
