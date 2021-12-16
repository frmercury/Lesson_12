public class DeluxeUno extends BoardGame{

    private String unoVariation;

    public DeluxeUno(String unoVariation) {
        this.unoVariation = unoVariation;
    }

    public void gameOrder() {

        System.out.printf("Заказ на изготовление настольной игры \"UNO %s Deluxe Edition \" принят%n", unoVariation);
    }
}