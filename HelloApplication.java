package com.example.miprimerproyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter a number: ");
        int numberTwo = scanner.nextInt();
        System.out.print ("The result of sum is: " + (numberOne+numberTwo));
        System.out.print ("The result of rest is: " + (numberOne-numberTwo));
        System.out.print ("The result of multiplication is: " + (numberOne*numberTwo));
        System.out.print ("The result of division is: " + ((double) numberOne/numberTwo));

    }

}