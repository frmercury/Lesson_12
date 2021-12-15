public abstract class BoardGame {

    public abstract void gameOrder();

    public void componentsProduction(){
        System.out.println("Компоненты изготовлены");
    }

    public void gamePackaging() {
        System.out.println("Игра упакована и передана в службу доставки");
    }

    public void gameDelivery() {
        System.out.println("Игра доставлена заказчику.");
    }

}
