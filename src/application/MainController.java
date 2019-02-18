package application;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	
	@FXML
	private Label labelRandom;
	
	@FXML
	private TextField inputIdMember;
	
	@FXML
	private ComboBox<String> comboBox;
	
	
	@FXML
	private ListView<String> listView;
	
	public void generateRandom(ActionEvent action) {
		Random random = new Random();
		int number = random.nextInt(10) + 1;
		labelRandom.setText(Integer.toString(number));
	}
	
	public void submitIdMember(ActionEvent action) {
		String idMember = inputIdMember.getText();
		labelRandom.setText(idMember);
	}
	
	ObservableList<String> list = FXCollections.observableArrayList("Mango", "Orang");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboBox.setItems(list);
		listView.setItems(list);
	}
	
	public void comboChanged(ActionEvent action) {
		String combo = comboBox.getValue();
		labelRandom.setText(combo);
	}
	
	public void selectedItem(ActionEvent action) {
		String names = listView.getSelectionModel().getSelectedItem();
		System.out.println(names);
	}
}
