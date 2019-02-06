package main.view;

import java.util.Calendar;

import data.Girls;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import main.Main;

public class AddGirlController {
	
	ObservableList<String> qualityJobList = FXCollections.observableArrayList("Amature","Professional");
	ObservableList<String> qualitySubList1 = FXCollections.observableArrayList("Cute","Sexy");
	ObservableList<String> qualitySubList2 = FXCollections.observableArrayList("Obscene","Lewd");
	
	// Personal Informations
	
	@FXML
	private TextField field1;
	@FXML
	private TextField field2;
	@FXML
	private TextField field3;
	@FXML
	private DatePicker field4;
	@FXML
	private TextField field5;
	@FXML
	private TextField field6;
	
	// Job Informations
	
	@FXML
	private TextField heightField;
	@FXML
	private TextField weightField;
	@FXML
	private CheckBox yesBox;
	@FXML
	private CheckBox noBox;
	@FXML
	private ComboBox qualityJob ;
	@FXML
	private ComboBox qualitySub;
	
	@FXML
	private void showAge() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int yearBirth = (field4.getValue().getYear());
		int age = year - yearBirth;
		field3.setText(age+"");
	}
	
	Girls girl = new Girls();
	Main main = new Main();
	
	@FXML
	private void addGirl() {
		
		girl.setName(field1.getText());
		girl.setAge(Integer.valueOf(field3.getText()));
		girl.setAddress(field5.getText()+"-"+field6.getText());
		girl.setHeight(Integer.valueOf(heightField.getText()));
		girl.setWeight(Integer.valueOf(weightField.getText()));
		String s="";
		if(yesBox.isSelected()) {
			s="Full Service";
		}
		else s="";
		girl.setJobInfo(qualityJob.getValue()+"-"+qualitySub.getValue()+"-"+s);
		main.addGirl(girl);
	}
	@FXML
	private void cancel() {
		main.showGirls();
	}
	
	@FXML
	private void initialize() {
		qualityJob.setValue("Amature");
		qualityJob.setItems(qualityJobList);
		
		qualitySub.setValue("Cute");
		qualitySub.setItems(qualitySubList1);
	}
	
	@FXML
	private void chooseQuality() {
		if(qualityJob.getValue().equals("Amature")) {
			qualitySub.setValue("Cute");
			qualitySub.setItems(qualitySubList1);
		} else {
			qualitySub.setValue("Obscene");
			qualitySub.setItems(qualitySubList2);
		}
	}
	
	@FXML
	private void checkYes() {
		if(yesBox.isSelected()) {
			noBox.setSelected(false);
		}
	}
	@FXML
	private void checkNo() {
		if(noBox.isSelected()) {
			yesBox.setSelected(false);
		}
	}
}
