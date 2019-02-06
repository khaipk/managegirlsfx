package main.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.Main;

public class MainItemsController {
	private Main main;
	@FXML
	private Button karaokeButton;
	@FXML
	private Button massageButton;
	
	@FXML
	private void goKaraoke() throws IOException {
		main.showKaraoke();
		
	}
	@FXML
	private void goMassage() throws IOException {
		main.showMassage();
	}
	
	@FXML
	private void showKaraoke() {
		main.showGirls();
	}
}
