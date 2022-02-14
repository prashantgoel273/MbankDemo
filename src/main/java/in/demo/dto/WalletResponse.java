package in.demo.dto;

public class WalletResponse {

String username;
double wallet;

public WalletResponse(String username, double wallet) {
	super();
	this.username = username;
	this.wallet = wallet;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public double getWallet() {
	return wallet;
}
public void setWallet(double wallet) {
	this.wallet = wallet;
}

	
}
