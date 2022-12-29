package kg.megacom.models;

public class ShopCategories {
    private Long id;
    private Shop ShopId;
    private Categories categories;
    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shop getShopId() {
        return ShopId;
    }

    public void setShopId(Shop shopId) {
        ShopId = shopId;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
