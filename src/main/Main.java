package main;

import java.io.IOException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import data.Girls;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage primaryStage;
	private static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Login System");
		showMainView();
		showMainItems();
	}

	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/mainview.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showMainItems() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
	}
	
	public static void showKaraoke() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Karaoke/karaoke.fxml"));
		BorderPane mainKaraoke = loader.load();
		mainLayout.setCenter(mainKaraoke);
	}
	
	public static void showMassage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Massage/Massage.fxml"));
		BorderPane mainMassage = loader.load();
		mainLayout.setCenter(mainMassage);
	}
	
	public static void showAddGirl() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddGirl.fxml"));
		BorderPane addGirl = loader.load();
		
		Stage addGirlStage = new Stage();
		addGirlStage.setTitle("Add New Girl");
		addGirlStage.initModality(Modality.WINDOW_MODAL);
		addGirlStage.initOwner(primaryStage);
		Scene scene = new Scene(addGirl);
		addGirlStage.setScene(scene);
		addGirlStage.showAndWait();
	}
	
	static ArrayList<Girls> list = new ArrayList<>();
	public void addGirl(Girls girl) {
		list.add(girl);
	}
	public void showGirls() {
		for(Girls girl: list) {
			System.out.println(girl);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
