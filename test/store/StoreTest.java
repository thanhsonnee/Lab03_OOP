package lab002.aimsproject;

import lab002.aimsproject.aims.disc.DigitalVideoDisc;
import lab002.aimsproject.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Film 1", "Sci-fi", "Director 1", 130, 30.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Film 2", "Comedy", "Director 2", 80, 26.0f);

        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        store.printStoreDetails();
        store.removeDVD(dvd2);
        store.printStoreDetails();

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Film 4", "Sci-fi", "Director 4", 120, 26.0f);
        store.removeDVD(dvd3);
    }
}