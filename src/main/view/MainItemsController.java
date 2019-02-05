package main.view;

import java.io.IOException;

import javafx.fxml.FXML;
import main.Main;

public class MainItemsController {
	private Main main;
	@FXML
	private void goKaraoke() throws IOException {
		main.showKaraoke();
	}
	@FXML
	private void goMassage() throws IOException {
		main.showMassage();
	}
}
