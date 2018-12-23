package tech.feily.DesignPattern.Facade;

public class Assistant {
    HotelReceptionist hotelReceptionist = new HotelReceptionist();
    Waitress waitress = new Waitress();
    Cooker cooker = new Cooker();
    Casher casher = new Casher();
    public void prepareDinner() {
        hotelReceptionist.subscribe();
        waitress.waitForAnOrder();
        cooker.cookDish();
    }
    public void endDinner() {
        waitress.serverDinner();
        casher.check();
    }
}
