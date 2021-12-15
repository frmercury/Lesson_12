public class DeluxeEdition extends GameDev {

    public BoardGame produceBG (Titles title) {
        BoardGame boardGame = null;

        switch (title) {
            case UNO:
                boardGame = new DeluxeUno();
                break;
            case SANTORINI:
                boardGame = new DeluxeSantorini();
                break;
            case SABOTEURS:
                boardGame = new DeluxeSaboteurs();
                break;
            case TOBAGO:
                boardGame = new DeluxeTobago();
                break;
        }
        return boardGame;
    }
}