package MODEL;

public class State {
	IPlayer currentPlayer;
	int cantPlayer;
	/*0 -estado inicial
	 *1 -estado que mantiene el cliente
	 *2 -estado que mantiene el server
	 *3 -broadcast de cambio de estados se mantiene el mismo jugador
	 *4 -broadcast de cambio de estados pasa al nuevo jugador */
	int stateType;
	boolean conquest=false;
	Game game;
	
	
	
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
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}

	public boolean isConquest() {
		return conquest;
	}

	public void setConquest(boolean conquest) {
		this.conquest = conquest;
	}
	
}