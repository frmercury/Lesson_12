public class DeluxeSantorini extends BoardGame{

    private String santoriniVariation;

    public DeluxeSantorini(String santoriniVariation) {
        this.santoriniVariation = santoriniVariation;
    }

    public void gameOrder() {
        System.out.printf("Заказ на изготовление настольной игры \"SANTORINI %s Deluxe Edition\" принят%n", santoriniVariation);
    }
}
