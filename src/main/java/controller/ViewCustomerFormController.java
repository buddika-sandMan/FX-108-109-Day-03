package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewCustomerFormController implements Initializable {

    @FXML
    private TableColumn<?, ?> colVCFAddress;

    @FXML
    private TableColumn<?, ?> colVCFID;

    @FXML
    private TableColumn<?, ?> colVCFName;

    @FXML
    private TableColumn<?, ?> colVCFSalary;

    @FXML
    private TableView<Customer> tblViewCustomerForm;

    @FXML
    void btnReloadViewCustomerFormOnAction(ActionEvent event) {
        loadTable();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colVCFID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colVCFName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colVCFAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colVCFSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        loadTable();
    }

    private  void loadTable(){
        List<Customer> connection = DBConnection.getInstance().getConnection();

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        connection.forEach(obj->{
            customerObservableList.add(obj);
        });

        tblViewCustomerForm.setItems(customerObservableList);
    }
}
