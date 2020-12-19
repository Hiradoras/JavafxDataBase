package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Student> table;

    @FXML
    private TableColumn<Student, String> no;

    @FXML
    private TableColumn<Student, String> nameSurname;

    @FXML
    private TableColumn<Student, String> department;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        no.setCellValueFactory(new PropertyValueFactory<Student,String>("no"));
        nameSurname.setCellValueFactory(new PropertyValueFactory<Student,String>("nameSurname"));
        department.setCellValueFactory(new PropertyValueFactory<Student,String>("department"));

    }
}
