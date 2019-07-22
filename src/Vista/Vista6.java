/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista6 implements Vista{
    private Scene escena;
    private HBox layout;
    private VBox columna1;
    private VBox columna2;
    private VBox columna3;
    private VBox columna4;
    private VBox columna5;
    private Label nombre;
    private Label precioOfertado;
    private Label precioMin;
    private Label precioMax;
    private Label aportanteGanador;
    private Button salir;

    public HBox getLayout() {
        return layout;
    }
    public VBox getColumna1() {
        return columna1;
    }
    public VBox getColumna2() {
        return columna2;
    }
    public VBox getColumna3() {
        return columna3;
    }
    public VBox getColumna4() {
        return columna4;
    }
    public VBox getColumna5() {
        return columna5;
    }
    public Button getSalir() {
        return salir;
    }

  
    
    public Vista6() {
        this.layout=new HBox();
        layout.setSpacing(5);
        this.columna1=new VBox();
        this.columna2=new VBox();
        this.columna3=new VBox();
        this.columna4=new VBox();
        this.columna5=new VBox();
        this.nombre=new Label("    Proyecto    ");
        this.precioMin=new Label("    Precio Minimo    ");
        this.precioMax=new Label("    Precio Maximo    ");
        this.precioOfertado=new Label("     Precio de Subasta    ");
        this.aportanteGanador=new Label("    Aportante    ");
        columna1.getChildren().add(nombre);
        columna2.getChildren().add(precioMin);
        columna3.getChildren().add(precioMax);
        columna4.getChildren().add(precioOfertado);
        columna5.getChildren().add(aportanteGanador);
        this.salir=new Button ("Salir");
        this.layout.getChildren().addAll(columna1,columna2,columna3,columna4,columna5,salir);
        this.escena = new Scene(layout,ANCHO,ALTO);
    }
     
    @Override
    public Scene getScene() {
    return escena;
    }
}
