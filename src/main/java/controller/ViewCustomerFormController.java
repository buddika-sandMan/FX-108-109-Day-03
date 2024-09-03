package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Customer;

public class ViewCustomerFormController {

    @FXML
    private TableColumn<?, ?> tblVCFAddress;

    @FXML
    private TableColumn<?, ?> tblVCFID;

    @FXML
    private TableColumn<?, ?> tblVCFName;

    @FXML
    private TableColumn<?, ?> tblVCFSalary;

    @FXML
    private TableView<Customer> tblViewCustomerForm;

    @FXML
    void btnReloadViewCustomerFormOnAction(ActionEvent event) {
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("001","Kamal","Anuradhapura", 254.0));
        customerObservableList.add(new Customer("001","Kamal","Anuradhapura", 254.0));
        customerObservableList.add(new Customer("001","Kamal","Anuradhapura", 254.0));
        customerObservableList.add(new Customer("001","Kamal","Anuradhapura", 254.0));
        customerObservableList.add(new Customer("001","Kamal","Anuradhapura", 254.0));
        tblViewCustomerForm.setItems(customerObservableList);

    }

}
