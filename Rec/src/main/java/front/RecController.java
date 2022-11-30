package front;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import local.Endereco;
import seguro.SeguroAuto;
import seguro.SeguroCasa;
import seguro.SeguroVida;
import bd.Conexao;

public class RecController {
  private Conexao conexao;
  @FXML
  private Button btnAutomovel;
  @FXML
  private Button btnEndereco;
  @FXML
  private Button btnImovel;
  @FXML
  private Button btnSaude;
  @FXML
  private DatePicker dpAnoConstrucaoImovel;
  @FXML
  private DatePicker dpDataAutomovel;
  @FXML
  private DatePicker dpDataImovel;
  @FXML
  private DatePicker dpDataNascSaude;
  @FXML
  private DatePicker dpDataSaude;
  @FXML
  private TextField tbAnoAutomovel;
  @FXML
  private TextField tbApoliceAutomovel;
  @FXML
  private TextField tbApoliceImovel;
  @FXML
  private TextField tbApoliceSaude;
  @FXML
  private TextField tbBeneficiarioSaude;
  @FXML
  private TextField tbCepEndereco;
  @FXML
  private TextField tbCidadeEndereco;
  @FXML
  private TextField tbDeducaoAutomovel;
  @FXML
  private TextField tbDeducaoImovel;
  @FXML
  private TextField tbEstadoAutomovel;
  @FXML
  private TextField tbEstadoEndereco;
  @FXML
  private TextField tbModeloAutomovel;
  @FXML
  private TextField tbNomeAutomovel;
  @FXML
  private TextField tbNomeImovel;
  @FXML
  private TextField tbNomeSaude;
  @FXML
  private TextField tbNumeroLicencaAutomovel;
  @FXML
  private TextField tbPremioAutomovel;
  @FXML
  private TextField tbPremioImovel;
  @FXML
  private TextField tbPremioSaude;
  @FXML
  private TextField tbValorAutomovel;
  @FXML
  private TextField tbValorImovel;
  @FXML
  private TextField tbValorSaude;


  @FXML
  void confirmarAutomovel(ActionEvent event) {
    SeguroAuto seguroAuto = new SeguroAuto(
      0,
      null,
      null,
      0,
      0,
      0,
      0,
      null,
      null,
      0
    );
  }

  @FXML
  void confirmarEndereco(ActionEvent event) {
    Endereco endereco = new Endereco(
      null,
      null,
      null,
      null
    );
  }

  @FXML
  void confirmarImovel(ActionEvent event) {
    SeguroCasa seguroCasa = new SeguroCasa(
      0,
      null,
      null,
      0,
      0,
      0,
      0
    );
  }

  @FXML
  void confirmarSaude(ActionEvent event) {
    SeguroVida seguroVida = new SeguroVida(
      0,
      null,
      null,
      0,
      0,
      null,
      null
    );
  }


  public RecController(Conexao conexao) {
    super();
    this.conexao = conexao;
  }
}
