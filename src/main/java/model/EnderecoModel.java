package model;

import java.util.HashSet;
import java.util.Set;



public class EnderecoModel implements java.io.Serializable {
    private int ENDERECO_ID;
    private String ENDERECO_LOGRADOURO ;
    private int ENDERECO_NUMERO;
    private String ENDERECO_CEP;
    private String ENDEROCO_CIDADE;
    private String ENDERECO_ESTADO;
    
    private Set<ClienteModel> clientes = new HashSet<ClienteModel>(0);
    
    public EnderecoModel(){
        
    }
    public EnderecoModel(int ENDERECO_ID, String ENDERECO_LOGRADOURO, int ENDERECO_NUMERO, String ENDERECO_CEP, String ENDEROCO_CIDADE, String ENDERECO_ESTADO){
        this.ENDERECO_ID = ENDERECO_ID;
        this.ENDERECO_LOGRADOURO = ENDERECO_LOGRADOURO;
        this.ENDERECO_NUMERO = ENDERECO_NUMERO;
        this.ENDERECO_CEP = ENDERECO_CEP;
        this.ENDEROCO_CIDADE = ENDEROCO_CIDADE;
        this.ENDERECO_ESTADO = ENDERECO_ESTADO;
    }

    public int getENDERECO_ID() {
        return ENDERECO_ID;
    }

    public void setENDERECO_ID(int ENDERECO_ID) {
        this.ENDERECO_ID = ENDERECO_ID;
    }

    public String getENDERECO_LOGRADOURO() {
        return ENDERECO_LOGRADOURO;
    }

    public void setENDERECO_LOGRADOURO(String ENDERECO_LOGRADOURO) {
        this.ENDERECO_LOGRADOURO = ENDERECO_LOGRADOURO;
    }

    public double getENDERECO_NUMERO() {
        return ENDERECO_NUMERO;
    }

    public void setENDERECO_NUMERO(int ENDERECO_NUMERO) {
        this.ENDERECO_NUMERO = ENDERECO_NUMERO;
    }

    public String getENDERECO_CEP() {
        return ENDERECO_CEP;
    }

    public void setENDERECO_CEP(String ENDERECO_CEP) {
        this.ENDERECO_CEP = ENDERECO_CEP;
    }

    public String getENDEROCO_CIDADE() {
        return ENDEROCO_CIDADE;
    }

    public void setENDEROCO_CIDADE(String ENDEROCO_CIDADE) {
        this.ENDEROCO_CIDADE = ENDEROCO_CIDADE;
    }

    public String getENDERECO_ESTADO() {
        return ENDERECO_ESTADO;
    }

    public void setENDERECO_ESTADO(String ENDERECO_ESTADO) {
        this.ENDERECO_ESTADO = ENDERECO_ESTADO;
    }

    public Set<ClienteModel> getClientes() {
        return clientes;
    }

    public void setClientes(Set<ClienteModel> clientes) {
        this.clientes = clientes;
    }
    
}
