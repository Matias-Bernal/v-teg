package MODEL;

public class State {
	IPlayer currentPlayer;
	int cantPlayer;
	/*0 -estado inicial (ESTADO COMPLETO = Game)
	 *1 -broadcast de cambio de estados se mantiene el mismo jugador (ESTADO CHICO =MiniGame)
	 *2 -(fin de turno) broadcast de cambio de estados pasa al nuevo jugador (ESTADO CHICO =MiniGame) 
	 */
	int stateType;
	boolean updatedCard=false;
	//si es true hay que consultar el currentPlayer para saber quien gano eh informar cual es su mision jejeje
	boolean endGame=false;
	SuperGame game;
	
	
	
	public State() {
	}
	
	public IPlayer getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(IPlayer currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public int getCantPlayer() {
		return cantPlayer;
	}
	public void setCantPlayer(int cantPlayer) {
		this.cantPlayer = cantPlayer;
	}
	public int getStateType() {
		return stateType;
	}
	public void setStateType(int stateType) {
		this.stateType = stateType;
	}
	public SuperGame getGame() {
		return game;
	}
	public void setGame(SuperGame game) {
		this.game = game;
	}
	public boolean isUpdatedCard() {
		return updatedCard;
	}
	public void setUpdatedCard(boolean updatedCard) {
		this.updatedCard = updatedCard;
	}
	public boolean isEndGame() {
		return endGame;
	}
	public void setEndGame(boolean endGame) {
		this.endGame = endGame;
	}
}