public abstract class GameDev {

    private int copiesNumber = 1;

    public void setCopiesNumber(int copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    public void orderBG (Titles title, String type) {
        BoardGame boardGame = produceBG(title, type);

        boardGame.gameOrder();
        boardGame.componentsProduction();
        boardGame.gamePackaging();
        boardGame.gameDelivery(copiesNumber);
        System.out.println("\nСпасибо за заказ!\n");
    }

    protected abstract BoardGame produceBG (Titles title, String type);
}
