package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import bd.Conexao;

import front.RecController;

import local.Data;
import local.Endereco;

import seguro.Seguro;
import seguro.SeguroAuto;
import seguro.SeguroCasa;
import seguro.SeguroVida;


public class Main extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main/java/front/rec.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 375, 275);
        stage.setTitle("Recuperação");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		RecController recController = new RecController(conexao);
		
		
		launch();
	}
}
