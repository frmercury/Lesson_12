public class StandardUno extends BoardGame{

    private String unoVariation;

    public StandardUno(String unoVariation) {
        this.unoVariation = unoVariation;
    }

    public void gameOrder() {
        System.out.printf("Заказ на изготовление настольной игры \"UNO %s Standard Edition \" принят%n", unoVariation);
    }
}