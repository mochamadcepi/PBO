/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumakananfx;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class MenuMakananFX extends Application {
    
    double TotalHarga = 0, hargaNasgor = 0, hargaKwetiaw = 0;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Menu Makanan Sederhana");
        
       CheckBox cbNasgor = new CheckBox("Nasi Goreng");
       CheckBox cbKwetiaw = new CheckBox("Kwetiaw");
       
       TextField tfNasgor = new TextField();
       TextField tfKwetiaw = new TextField();
       tfNasgor.setPromptText("Jumlah");
       tfNasgor.setPromptText("Jumlah");
       tfNasgor.setDisable(true);
       tfKwetiaw.setDisable(true);
       
       Button btnHitung = new Button("Hitung");
       Button btnHapus = new Button("Hapus");
       
       HBox box = new HBox (btnHitung,btnHapus);
       box.setSpacing(5); 
       
       
        GridPane root = new GridPane();
        
        root.setPadding(new javafx.geometry.Insets(5));
        root.setVgap(10);
        root.setHgap(10);
        
        
        root.add(cbNasgor, 0, 0);
        root.add(cbKwetiaw,0, 1);
        root.add(tfNasgor,1,0);
        root.add(tfKwetiaw,1,1);
        root.add(box, 1, 2);
       
        Scene scene = new Scene (root,300,350);
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
        cbNasgor.setOnAction(e->{
            
            if (cbNasgor.isSelected()){
                hargaNasgor = 10000;
                tfNasgor.setDisable(false);
            }
            else{
                hargaNasgor =0;
                tfNasgor.setDisable(true);
                
            }
        
        });
        
        cbKwetiaw.setOnAction(e->{
            
            if (cbNasgor.isSelected()){
                hargaKwetiaw = 15000;
                tfKwetiaw.setDisable(false);
            }
            else{
                hargaKwetiaw =0;
                tfKwetiaw.setDisable(true);
                
            }
        
        });
  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
