public class StandardSantorini extends BoardGame{

    private String santoriniVariation;

    public StandardSantorini(String santoriniVariation) {
        this.santoriniVariation = santoriniVariation;
    }

    public void gameOrder() {
        System.out.printf("Заказ на изготовление настольной игры \"SANTORINI %s Standard Edition\" принят%n", santoriniVariation);
    }
}
