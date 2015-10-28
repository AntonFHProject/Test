package application;

import java.util.Locale;
import java.util.logging.Logger;

import ch.fhnw.richards.lecture04.jat_v2.ServiceLocator;
import ch.fhnw.richards.lecture04.jat_v2.abstractClasses.View;
import ch.fhnw.richards.lecture04.jat_v2.commonClasses.Translator;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextAreaBuilder;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Copyright 2015, FHNW, Prof. Dr. Brad Richards. All rights reserved. This code
 * is licensed under the terms of the BSD 3-clause license (see the file
 * license.txt).
 * 
 * @author Brad Richards
 */
public class App_View extends View<App_Model> {
    Menu menuFile;
    Menu menuFileLanguage;
    Menu menuHelp;
    	
    Label lblName;
    Label lblVorname;
    Label lblStrasse_Nr;
    Label lblPLZ_Ort;
    Label lblLand;
    Label lblTelefon;
    Label lblMobil;
    Label lblEmail;
    
    TextField TFname;
    TextField TFvorname;
    TextField TFstrasse_nr;
    TextField TFplz_ort;
    TextField TFland;
    TextField TFtelefon;
    TextField TFmobil;
    TextField TFemail;
    
    TextArea TAlog;
    
    Button BaddPerson;
    Button BCancel;

	public App_View(Stage stage, App_Model model) {
        super(stage, model);
        stage.setTitle("JavaFX Application Template");
        
        ServiceLocator.getServiceLocator().getLogger().info("Application view initialized");
    }

	@Override
	protected Scene create_GUI() {
	    ServiceLocator sl = ServiceLocator.getServiceLocator();  
	    Logger logger = sl.getLogger();
	    Translator t = sl.getTranslator();
	    
	    MenuBar menuBar = new MenuBar();
	    menuFile = new Menu(t.getString("program.menu.file"));
	    menuFileLanguage = new Menu(t.getString("program.menu.file.language"));
	    menuFile.getItems().add(menuFileLanguage);
	    
       for (Locale locale : sl.getLocales()) {
           MenuItem language = new MenuItem(locale.getLanguage());
           menuFileLanguage.getItems().add(language);
           language.setOnAction( event -> {
                   sl.setTranslator(new Translator(locale.getLanguage()));
                   updateTexts();
            });
        }
	    
        menuHelp = new Menu(t.getString("program.menu.help"));
	    menuBar.getMenus().addAll(menuFile, menuHelp);
		
		GridPane root = new GridPane();
		root.add(menuBar, 0, 0);
		
		BorderPane finalView = new BorderPane();
		finalView.setCenter(root);
		
		
//	    for(int i = 0; i < labels.length; i++){
//	    	labels[i] = new Label();
//	    }
//	    
//	    for(Label l : labels){
//	    	l.setAlignment(Pos.BASELINE_LEFT);
//	    	root.
//	    	
//	    }

        
        lblName = new Label();
        lblName.setText(t.getString("label.name"));
        lblName.setMinWidth(200);
        root.add(lblName, 0, 1);
        
        TFname = new TextField();
        TFname.setMinWidth(200);
        TFname.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFname, 1, 1);
        
        lblVorname = new Label();
        lblVorname.setText(t.getString("label.vorname"));
        lblVorname.setMinWidth(200);
        lblVorname.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblVorname, 0, 2);
        
        TFvorname = new TextField();
        TFvorname.setMinWidth(200);
        TFvorname.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFvorname, 1, 2);
        
        lblStrasse_Nr = new Label();
        lblStrasse_Nr.setText(t.getString("label.strasse_nr"));
        lblStrasse_Nr.setMinWidth(200);
        lblStrasse_Nr.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblStrasse_Nr, 0, 3);
        
        TFstrasse_nr = new TextField();
        TFstrasse_nr.setMinWidth(200);
        TFstrasse_nr.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFstrasse_nr, 1, 3);
        
        lblPLZ_Ort = new Label();
        lblPLZ_Ort.setText(t.getString("label.plz_ort"));
        lblPLZ_Ort.setMinWidth(200);
        lblPLZ_Ort.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblPLZ_Ort, 0, 4);
        
        TFplz_ort = new TextField();
        TFplz_ort.setMinWidth(200);
        TFplz_ort.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFplz_ort, 1, 4);
        
        lblLand = new Label();
        lblLand.setText(t.getString("label.land"));
        lblLand.setMinWidth(200);
        lblLand.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblLand, 0, 5);
        
        TFland = new TextField();
        TFland.setMinWidth(200);
        TFland.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFland, 1, 5);
        
        lblTelefon = new Label();
        lblTelefon.setText(t.getString("label.telefon"));
        lblTelefon.setMinWidth(200);
        lblTelefon.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblTelefon, 0, 6);
        
        TFtelefon = new TextField();
        TFtelefon.setMinWidth(200);
        TFtelefon.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFtelefon, 1, 6);
        
        lblMobil = new Label();
        lblMobil.setText(t.getString("label.mobil"));
        lblMobil.setMinWidth(200);
        lblMobil.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblMobil, 0, 7);
        
        TFmobil = new TextField();
        lblMobil.setMinWidth(200);
        lblMobil.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFmobil, 1, 7);
        
        lblEmail = new Label();
        lblEmail.setText(t.getString("label.email"));
        lblEmail.setMinWidth(200);
        lblEmail.setAlignment(Pos.BASELINE_LEFT);
        root.add(lblEmail, 0, 8);
        
        TFemail = new TextField();
        TFemail.setMinWidth(200);
        TFemail.setAlignment(Pos.BASELINE_LEFT);
        root.add(TFemail, 1, 8);
        
        
        BaddPerson = new Button();
        BaddPerson.setText(t.getString("button.clickme"));
        BaddPerson.setMinWidth(200);
        root.add(BaddPerson, 0, 9);
        
        BCancel = new Button();
        BCancel.setText(t.getString("button.clickmeCancel"));
        BCancel.setMinWidth(200);
        root.add(BCancel, 1, 9);
        
        TAlog = new TextArea();
        TAlog.setPrefHeight(400);
        TAlog.setPrefWidth(400);
        finalView.setRight(TAlog);
        
        
        
		
        Scene scene = new Scene(finalView);
        scene.getStylesheets().add(
                getClass().getResource("app.css").toExternalForm());
        return scene;
	}
	
	   protected void updateTexts() {
	       Translator t = ServiceLocator.getServiceLocator().getTranslator();
	        
	        // The menu entries
	       menuFile.setText(t.getString("program.menu.file"));
	       menuFileLanguage.setText(t.getString("program.menu.file.language"));
           menuHelp.setText(t.getString("program.menu.help"));
	        
	        // Other controls
           BaddPerson.setText(t.getString("button.clickme"));
           BCancel.setText(t.getString("button.clickmeCancel"));
           
           //Labels
           lblName.setText(t.getString("label.name"));
           lblVorname.setText(t.getString("label.vorname"));
           lblStrasse_Nr.setText(t.getString("label.strasse_nr"));
           lblPLZ_Ort.setText(t.getString("label.plz_ort"));
           lblLand.setText(t.getString("label.land"));
           lblTelefon.setText(t.getString("label.telefon"));
           lblMobil.setText(t.getString("label.mobil"));
           lblEmail.setText(t.getString("label.email"));
	    }
}