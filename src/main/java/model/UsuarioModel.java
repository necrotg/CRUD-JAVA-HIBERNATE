package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class UsuarioModel implements java.io.Serializable {
    @Id
    @Column(name = "USU_ID", nullable = false, precision = 10, scale = 0)
    private int USU_ID;
    @Column(name = "USU_NOME", nullable = false, precision = 10, scale = 0)
    private String USU_NOME;
    @Column(name = "USU_LOGIN", nullable = false, precision = 10, scale = 0)
    private String USU_LOGIN;
    @Column(name = "USU_SENHA", nullable = false, precision = 10, scale = 0)
    private String USU_SENHA;
    
    @Override
    public String toString() {
        return this.USU_NOME;
    }
    
    public UsuarioModel() {
    }

    public UsuarioModel(int USU_ID, String USU_NOME, String USU_LOGIN, String USU_SENHA) {
        this.USU_ID = USU_ID;
        this.USU_NOME = USU_NOME;
        this.USU_LOGIN = USU_LOGIN;
        this.USU_SENHA = USU_SENHA;
    }

    public int getUSU_ID() {
        return USU_ID;
    }

    public void setUSU_ID(int USU_ID) {
        this.USU_ID = USU_ID;
    }

    public String getUSU_NOME() {
        return USU_NOME;
    }

    public void setUSU_NOME(String USU_NOME) {
        this.USU_NOME = USU_NOME;
    }

    public String getUSU_LOGIN() {
        return USU_LOGIN;
    }

    public void setUSU_LOGIN(String USU_LOGIN) {
        this.USU_LOGIN = USU_LOGIN;
    }

    public String getUSU_SENHA() {
        return USU_SENHA;
    }

    public void setUSU_SENHA(String USU_SENHA) {
        this.USU_SENHA = USU_SENHA;
    }
}
    
