package core.generics.usecase1;

public class GenericFlowerBox<T> {
    private T itemType;

    public T getItemType() {
        return itemType;
    }

    public void setItemType(T itemType) {
        this.itemType = itemType;
    }
}

