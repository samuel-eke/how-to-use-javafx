//this controller file is for handling events and binding them with the scene builder
package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;

public class MovingController {

    @FXML //fxml annotation is to bring to this class file, the properties and declarations in the .fxml file
    private Circle mycircle;
    private double x, y;


    public void up(ActionEvent e){
//        System.out.println("Go up");
        mycircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        mycircle.setCenterY(y+=10);
//        System.out.println("Go down");
    }
    public void left(ActionEvent e){
        mycircle.setCenterX(x-=10);
//        System.out.println("Go left");
    }
    public void right(ActionEvent e){
        mycircle.setCenterX(x+=10);
//        System.out.println("Go right");
    }
}