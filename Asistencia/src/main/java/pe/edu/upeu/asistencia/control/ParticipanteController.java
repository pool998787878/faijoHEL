package pe.edu.upeu.asistencia.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.servicio.ParticipanteServicioI;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxCarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxTipoParticipante;

    @FXML TableView<Participante> tableview;
    ObservableList<Participante> Participantes ;
    TableColumn<Participante,String> dniCol,nombreCol,apellidoCol,carreraCol,tipoParCol;

    @Autowired
    ParticipanteServicioI ps ;

    @FXML

    public void initialize() {
        cbxCarrera.getItems().setAll(Carrera.values());
        cbxTipoParticipante.getItems().setAll(TipoParticipante.values());

        definirNombresColunas();
        listarParticipantes();
    }

    public void definirNombresColunas() {
        dniCol = new TableColumn("DNI");
        nombreCol = new TableColumn("Nombre");
        apellidoCol = new TableColumn("Apellido");
        apellidoCol.setMinWidth(200);
        carreraCol = new TableColumn("Carrera");
        tipoParCol = new TableColumn("Tipo Participante");
        tipoParCol.setMinWidth(160);
        tableview.getColumns().addAll(dniCol,nombreCol,apellidoCol, carreraCol,tipoParCol);
    }

    public void listarParticipantes() {
        dniCol.setCellValueFactory(cellData -> cellData.getValue().getDni());

        Participantes=FXCollections.observableArrayList(ps.findAll());
        tableview.setItems(Participantes);
    }

}
