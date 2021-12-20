public class StandardSaboteurs extends BoardGame{

    private String saboteursVariation;

    public StandardSaboteurs(String saboteursVariation) {
        this.saboteursVariation = saboteursVariation;
    }

    public void gameOrder() {
        System.out.printf("Заказ на изготовление настольной игры \"SABOTEURS %s Standard Edition\" принят%n", saboteursVariation);
    }
}
