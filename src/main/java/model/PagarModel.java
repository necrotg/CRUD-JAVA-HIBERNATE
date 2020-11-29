package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PAGAR")
@PrimaryKeyJoinColumn(name="FINAN_ID")

public class PagarModel extends FinanceiroModel implements java.io.Serializable {
    @Column(name = "BOLETO", nullable = false, precision = 10, scale = 0)
    private String BOLETO;
    
    @Embedded
    private FornecedorModel fornecedor;
    
    
    public PagarModel(){
        
    }
    public PagarModel(int FINAN_ID, int FINAN_NUM, String FINAN_EMISSAO, String FINAN_VENC, String FINAN_PAG,double FINAN_VAL, double FINAN_JUROS, double FINAN_MULTA, double FINAN_DESCONTO, double FINAN_TOTAL, String BOLETO, FornecedorModel fornecedor){
       super(FINAN_ID, FINAN_NUM,FINAN_EMISSAO,FINAN_VENC,FINAN_PAG,FINAN_VAL, FINAN_JUROS, FINAN_MULTA,FINAN_DESCONTO,FINAN_TOTAL);
       this.BOLETO = BOLETO;
       this.fornecedor = fornecedor;
    }

    public FornecedorModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getBOLETO() {
        return BOLETO;
    }

    public void setBOLETO(String BOLETO) {
        this.BOLETO = BOLETO;
    }
    
}
