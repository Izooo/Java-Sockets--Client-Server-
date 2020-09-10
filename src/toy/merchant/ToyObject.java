/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toy.merchant;

import java.io.Serializable;

/**
 *
 * @author isaac
 */
public class ToyObject implements Serializable {

    private static String Toy_Code;
    private static String Toy_Name;
    private static String Toy_Description;
    private static String Toy_Price;
    private static String Toy_Date_of_Manufacture;
    private static String Toy_Batch_No;
    private static String Toy_Company;
    private static String Toy_Street_address;
    private static String Toy_Zip_code;
    private static String Toy_Country;

    public String getToy_Code() {
        return Toy_Code;
    }

    public void setToy_Code(String Toy_Code) {
        this.Toy_Code = Toy_Code;
    }

    public String getToy_Name() {
        return Toy_Name;
    }

    public void setToy_Name(String Toy_Name) {
        this.Toy_Name = Toy_Name;
    }

    public String getToy_Description() {
        return Toy_Description;
    }

    public void setToy_Description(String Toy_Description) {
        this.Toy_Description = Toy_Description;
    }

    public String getToy_Price() {
        return Toy_Price;
    }

    public void setToy_Price(String Toy_Price) {
        this.Toy_Price = Toy_Price;
    }

    public String getToy_Date_of_Manufacture() {
        return Toy_Date_of_Manufacture;
    }

    public void setToy_Date_of_Manufacture(String Toy_Date_of_Manufacture) {
        this.Toy_Date_of_Manufacture = Toy_Date_of_Manufacture;
    }

    public String getToy_Batch_No() {
        return Toy_Batch_No;
    }

    public void setToy_Batch_No(String Toy_Batch_No) {
        this.Toy_Batch_No = Toy_Batch_No;
    }

    public String getToy_Company() {
        return Toy_Company;
    }

    public void setToy_Company(String Toy_Company) {
        this.Toy_Company = Toy_Company;
    }

    public String getToy_Street_address() {
        return Toy_Street_address;
    }

    public void setToy_Street_address(String Toy_Street_address) {
        this.Toy_Street_address = Toy_Street_address;
    }

    public String getToy_Zip_code() {
        return Toy_Zip_code;
    }

    public void setToy_Zip_code(String Toy_Zip_code) {
        this.Toy_Zip_code = Toy_Zip_code;
    }

    public String getToy_Country() {
        return Toy_Country;
    }

    public void setToy_Country(String Toy_Country) {
        this.Toy_Country = Toy_Country;
    }

}
