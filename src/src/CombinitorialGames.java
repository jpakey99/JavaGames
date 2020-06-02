public abstract class CombinitorialGames {
    private boolean player1;

    public CombinitorialGames(){
        player1 = true;
    }

    public abstract boolean isGameOver();

    public abstract void playGame();


}
