public class Store {
    private static final int MAX_ITEMS_IN_STORE = 100; 
    private DigitalVideoDisc[] itemsInStore; 
    private int qtyInStore; 

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full, cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getId() == dvd.getId()) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; 
                qtyInStore--;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" was not found in the store.");
        }
    }

    public void printStoreDetails() {
        System.out.println("************** STORE INVENTORY **************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("*********************************************");
    }
}