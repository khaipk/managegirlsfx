package main.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.Main;

public class MainViewController {
	private Main main;
	
	
	@FXML
	private void goHome() throws IOException {
		main.showMainItems();
	}
	@FXML
	private void addGirl() throws IOException {
		main.showAddGirl();
	}
	
}
