package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "FINANCEIRO")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class FinanceiroModel implements java.io.Serializable{
    @Id
    @Column(name = "FINAN_ID", nullable = false, precision = 10, scale = 0)
    private int FINAN_ID;
    @Column(name = "FINAN_NUM", nullable = false, precision = 10, scale = 0)
    private int FINAN_NUM;
    @Column(name = "FINAN_EMISSAO", nullable = false, precision = 10, scale = 0)
    private String FINAN_EMISSAO;
    @Column(name = "FINAN_VENC", nullable = false, precision = 10, scale = 0)
    private String FINAN_VENC;
    @Column(name = "FINAN_PAG", nullable = false, precision = 10, scale = 0)
    private String FINAN_PAG;
    @Column(name = "FINAN_VAL", nullable = false, precision = 10, scale = 0)
    private double FINAN_VAL;
    @Column(name = "FINAN_JUROS", nullable = false, precision = 10, scale = 0)
    private double FINAN_JUROS;
    @Column(name = "FINAN_MULTA", nullable = false, precision = 10, scale = 0)
    private double FINAN_MULTA;
    @Column(name = "FINAN_DESCONTO", nullable = false, precision = 10, scale = 0)
    private double FINAN_DESCONTO;
    @Column(name = "FINAN_TOTAL", nullable = false, precision = 10, scale = 0)
    private double FINAN_TOTAL;

    public FinanceiroModel(){
    
    }
    public FinanceiroModel(int FINAN_ID, int FINAN_NUM, String FINAN_EMISSAO, String FINAN_VENC, String FINAN_PAG,double FINAN_VAL, double FINAN_JUROS, double FINAN_MULTA, double FINAN_DESCONTO, double FINAN_TOTAL){
        this.FINAN_ID = FINAN_ID;
        this.FINAN_NUM = FINAN_NUM;
        this.FINAN_EMISSAO = FINAN_EMISSAO;
        this.FINAN_VENC = FINAN_VENC;
        this.FINAN_PAG = FINAN_PAG;
        this.FINAN_VAL = FINAN_VAL;
        this.FINAN_JUROS = FINAN_JUROS;
        this.FINAN_MULTA = FINAN_MULTA;
        this.FINAN_DESCONTO = FINAN_DESCONTO;
        this.FINAN_TOTAL = FINAN_TOTAL;
    }
    
    public int getFINAN_ID() {
        return FINAN_ID;
    }

    public void setFINAN_ID(int FINAN_ID) {
        this.FINAN_ID = FINAN_ID;
    }

    public int getFINAN_NUM() {
        return FINAN_NUM;
    }

    public void setFINAN_NUM(int FINAN_NUM) {
        this.FINAN_NUM = FINAN_NUM;
    }

    public String getFINAN_EMISSAO() {
        return FINAN_EMISSAO;
    }

    public void setFINAN_EMISSAO(String FINAN_EMISSAO) {
        this.FINAN_EMISSAO = FINAN_EMISSAO;
    }

    public String getFINAN_VENC() {
        return FINAN_VENC;
    }

    public void setFINAN_VENC(String FINAN_VENC) {
        this.FINAN_VENC = FINAN_VENC;
    }
 
    public String getFINAN_PAG() {
        return FINAN_PAG;
    }


    public void setFINAN_PAG(String FINAN_PAG) {
        this.FINAN_PAG = FINAN_PAG;
    }

 
    public double getFINAN_VAL() {
        return FINAN_VAL;
    }

    public void setFINAN_VAL(double FINAN_VAL) {
        this.FINAN_VAL = FINAN_VAL;
    }


    public double getFINAN_JUROS() {
        return FINAN_JUROS;
    }


    public void setFINAN_JUROS(double FINAN_JUROS) {
        this.FINAN_JUROS = FINAN_JUROS;
    }

    public double getFINAN_MULTA() {
        return FINAN_MULTA;
    }

    public void setFINAN_MULTA(double FINAN_MULTA) {
        this.FINAN_MULTA = FINAN_MULTA;
    }

    public double getFINAN_DESCONTO() {
        return FINAN_DESCONTO;
    }

    public void setFINAN_DESCONTO(double FINAN_DESCONTO) {
        this.FINAN_DESCONTO = FINAN_DESCONTO;
    }

    public double getFINAN_TOTAL() {
        return FINAN_TOTAL;
    }

    public void setFINAN_TOTAL(double FINAN_TOTAL) {
        this.FINAN_TOTAL = FINAN_TOTAL;
    }
}
