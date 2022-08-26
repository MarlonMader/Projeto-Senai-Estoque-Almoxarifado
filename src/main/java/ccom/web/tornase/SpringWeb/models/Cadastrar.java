package ccom.web.tornase.SpringWeb.models;

import javax.persistence.*;

@Entity
@Table(name = "itens")
public class Cadastrar {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "produto", nullable = false)
    private String produto;

    @Column(name = "fornecedor", nullable = false)
    private String fornecedor;
    
    @Column(name = "quantidade", nullable = false)
    private String quantidade;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    
    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
