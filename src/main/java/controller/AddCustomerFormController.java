package controller;

import com.jfoenix.controls.JFXTextField;
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

    List<Customer> customerList = new ArrayList<>();

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        Double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id, name, address, salary);

        customerList.add(customer);

        System.out.println("=====================");
        customerList.forEach(obj->{
            System.out.println(obj);
        });
        System.out.println("=====================");

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

}
