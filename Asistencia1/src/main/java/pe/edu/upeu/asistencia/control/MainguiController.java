package pe.edu.upeu.asistencia.control;
import javafx.application.Platform;
import javafx.scene.control.TabPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Tab;

import javafx.scene.control.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.Map;


@Controller
public class MainguiController {

    @FXML
    private MenuItem menuItem1,menuItem2,menuItem3,menuItem4;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TabPane tabPane;

    @Autowired
    private ApplicationContext context;

    @FXML
    public void initialize(){
        MEnuIemListener miL=new MEnuIemListener();

        menuItem1.setOnAction(miL::handle);
        menuItem2.setOnAction(miL::handle);
        menuItem3.setOnAction(miL::handle);
        menuItem4.setOnAction(miL::handle);





    }


     class MEnuIemListener {

         Map<String, String[]> menuConfig = Map.of(
                 "menuItem1", new String[]{"/fxml/main_participante.fxml", "Participante", "T"},

                 "menuItem2", new String[]{"/fxml/login.fxml", "salir", "C"},
                 "menuItem3", new String[]{"/fxml/login.fxml", "main_asistencia.fxml", "Asistencia"}


         );


         public void handle(ActionEvent e) {
             System.out.println("sdsdsds");
             String id = ((MenuItem) e.getSource()).getId();
             System.out.println(id);
             if (menuConfig.containsKey(id)) {
                 String[] mi = menuConfig.get(id);
                 if (mi[2].equals("C")) {
                     Platform.exit();
                     System.exit(0);

                 } else {
                     abrirArchivoFML(mi[0], mi[1]);
                 }
             }
         }


         public void abrirArchivoFML(String filename, String tittle) {
             try {

                 FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
                 loader.setControllerFactory(context::getBean);
                 Parent root = loader.load();

                 ScrollPane scrollPane = new ScrollPane(root);
                 scrollPane.setFitToHeight(true);
                 scrollPane.setFitToHeight(true);
                 Tab newTab = new Tab(tittle, scrollPane);
                 tabPane.getTabs().clear();
                 tabPane.getTabs().add(newTab);
             } catch (Exception e) {
                 throw new RuntimeException(e);
             }


         }
     }
     class MenuListener{
        public void handle (ActionEvent event){

        }
     }
}
