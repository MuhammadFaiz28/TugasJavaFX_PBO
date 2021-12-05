/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavafx12.pkg05.pkg2021;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TugasJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Button btnRegister = new Button("Register");
        
        HBox hbox_NamaDepan = new HBox();
        HBox hbox_NamaBelakang = new HBox();
        HBox hbox_Email = new HBox();
        HBox hbox_Kontak = new HBox();
        HBox hbox_KataSandi = new HBox();
        HBox hbox_KonfirmasiKataSandi = new HBox();

        TextField tf_NamaDepan = new TextField();
        TextField tf_NamaBelakang = new TextField();
        TextField tf_Email = new TextField();
        TextField tf_Kontak = new TextField();
        TextField tf_KataSandi = new TextField();
        TextField tf_KonfirmasiKataSandi = new TextField();

        Label label_NamaDepan = new Label("First Name ");
        Label label_NamaBelakang = new Label("Last Name ");
        Label label_KataSandi = new Label("Password ");
        Label label_KonfirmasiKataSandi = new Label("Confirm Password ");
        Label label_Kontak = new Label("Contact No ");
        Label label_Email = new Label("E-Mail Address ");
        
        
        VBox vbox_FieldHolder = new VBox();

        hbox_NamaDepan.getChildren().addAll(label_NamaDepan, tf_NamaDepan);
        hbox_NamaDepan.setSpacing(50);
        hbox_NamaBelakang.getChildren().addAll(label_NamaBelakang, tf_NamaBelakang);
        hbox_NamaBelakang.setSpacing(51);

        hbox_Email.getChildren().addAll(label_Email, tf_Email);
        hbox_Email.setSpacing(29);
        hbox_Kontak.getChildren().addAll(label_Kontak, tf_Kontak);
        hbox_Kontak.setSpacing(49);

        hbox_KataSandi.getChildren().addAll(label_KataSandi, tf_KataSandi);
        hbox_KataSandi.setSpacing(59);
        hbox_KonfirmasiKataSandi.getChildren().addAll(label_KonfirmasiKataSandi, tf_KonfirmasiKataSandi);
        hbox_KonfirmasiKataSandi.setSpacing(14);

        vbox_FieldHolder.getChildren().addAll(hbox_NamaDepan, hbox_NamaBelakang, hbox_Email, hbox_Kontak, hbox_KataSandi, hbox_KonfirmasiKataSandi);
        vbox_FieldHolder.setSpacing(10);
        vbox_FieldHolder.setLayoutX(30);
        vbox_FieldHolder.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();

        tp_Panel2.getChildren().addAll(btnRegister);
        btnRegister.setStyle("-fx-background-color: #3d85c6; ");

        tp_Panel2.setLayoutX(150);
        tp_Panel2.setLayoutY(250);

        group.getChildren().addAll(vbox_FieldHolder, tp_Panel2);

        Scene scene = new Scene(group, 400, 350);
        scene.setFill(Color.WHITE);

        primaryStage.setTitle("Registrasi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}