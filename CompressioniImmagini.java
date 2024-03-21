package it.edu.iisgubbio.TPSIT;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CompressioniImmagini extends Application{


	char g[][]=new char[3][3];
	TextField cPercentuale=new TextField();

	TextField nCompresso=new TextField();
	Label eCompresso=new Label("Compresso");
	Label eNonCompresso=new Label(" non Compresso");
	Label ePercentuale=new Label("percentuale compressione");

	Button bCalcola=new Button("Calcola");
	TextField cCompresso=new TextField();
	GridPane griglia=new GridPane();

	public void start(Stage finestra) {

		g[0][0]='v';
		g[1][0]='b';
		g[2][0]='b';
		g[0][1]='g';
		g[1][1]='g';
		g[2][1]='g';
		g[0][2]='b';
		g[1][2]='v';
		g[2][2]='n';



		griglia.add(eNonCompresso, 0, 0);
		griglia.add(eCompresso, 0, 1);
		griglia.add(ePercentuale, 0, 2);
		griglia.add(bCalcola, 0, 3);
		griglia.add(nCompresso, 1, 0);
		griglia.add(cCompresso, 1, 1);
		griglia.add(cPercentuale, 1, 2);
;
		griglia.setHgap(15);
		griglia.setVgap(15);
		griglia.setPadding(new Insets(10,10,10,10));
		bCalcola.setOnAction(e-> Calcola());
		Scene scena =new Scene(griglia);
		finestra.setTitle("parola25");
		finestra.setScene(scena);
		finestra.show();
	}

	public void Calcola() {
		int v[]=new int [g.length];
		for(int colonna=0;colonna<g.length;colonna++) {
			for(int riga=0;riga<g.length;riga++) {
				if(g[0][colonna]==g[riga][colonna]) {
					v[colonna]+=1;
				}
			}
		}
	}



	public static void main(String[] args) {

		launch(args);
	}
}
