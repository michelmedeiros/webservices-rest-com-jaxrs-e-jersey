package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Michel Medeiros on 09/03/2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Projeto {

    private long id;
    private String nome;
    private int anoDeInicio;


    public Projeto() {
    }

    public Projeto(long id, String nome, int anoDeInicio) {
        this.setId(id);
        this.setNome(nome);
        this.setAnoDeInicio(anoDeInicio);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeInicio() {
        return anoDeInicio;
    }

    public void setAnoDeInicio(int anoDeInicio) {
        this.anoDeInicio = anoDeInicio;
    }

    public String toXML() {
        return new XStream().toXML(this);
    }

    public String toJson() {
        return new Gson().toJson(this);
    }

    public void remove(Long produtoId) {
    }
}
