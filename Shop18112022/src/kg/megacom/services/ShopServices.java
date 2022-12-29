package kg.megacom.services;

import kg.megacom.models.Shop;

import java.util.List;

public interface ShopServices {
    void save (String name);
    void update(Long id, String name);
    List<Shop> findAll();
    Shop findById (Long id);
    public void delete(Long id);

}
