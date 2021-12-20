public class DeluxeEdition extends GameDev {

    public BoardGame produceBG (Titles title, String type) {
        BoardGame boardGame = null;

        switch (title) {
            case UNO:
                boardGame = new DeluxeUno(type);
                break;
            case SANTORINI:
                boardGame = new DeluxeSantorini(type);
                break;
            case SABOTEURS:
                boardGame = new DeluxeSaboteurs(type);
                break;
            case TOBAGO:
                boardGame = new DeluxeTobago();
                break;
        }
        return boardGame;
    }
}