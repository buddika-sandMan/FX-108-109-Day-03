package controller;

import com.jfoenix.controls.JFXTextField;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtID;

    @FXML
    private JFXTextField txtName;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {

        List<Customer> connection = DBConnection.getInstance().getConnection();

        connection.add(new Customer(
                txtID.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        ));

        clearTextFields();

    }

    @FXML
    void btnDeleteCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateCustomerOnAction(ActionEvent event) {

    }

    private void clearTextFields() {
        txtID.clear();
        txtName.clear();
        txtAddress.clear();
        txtSalary.clear();
    }

    public void btnClearCustomerOnAction(ActionEvent actionEvent) {
        clearTextFields();
    }
}
