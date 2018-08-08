/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class LeitorDeArquivo {
    private  String ArquivoLeitura;
    private  String ArquivoEscrita;
    private  ArrayList<String> Resultado = new ArrayList();
    
    public LeitorDeArquivo(){}
     
    public ArrayList LerArquivos(){
        try {
            BufferedReader in = new BufferedReader(new FileReader(getArquivoLeitura()));
            String str;
            while ((str = in.readLine()) != null)
                getResultado().add(str);
            in.close();
        } catch (IOException e) {
        }
    
        return this.getResultado();
    }
    
    public void EscreverArquivos(ArrayList<String> itens){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(getArquivoEscrita(), true));
            for(int i = 0; i < itens.size(); i++ ) {
                bw.write(itens.get(i) + "\r\n");             
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the ArquivoLeitura
     */
    public String getArquivoLeitura() {
        return ArquivoLeitura;
    }

    /**
     * @param ArquivoLeitura the ArquivoLeitura to set
     */
    public void setArquivoLeitura(String ArquivoLeitura) {
        this.ArquivoLeitura = ArquivoLeitura;
    }

    /**
     * @return the ArquivoEscrita
     */
    public String getArquivoEscrita() {
        return ArquivoEscrita;
    }

    /**
     * @param ArquivoEscrita the ArquivoEscrita to set
     */
    public void setArquivoEscrita(String ArquivoEscrita) {
        this.ArquivoEscrita = ArquivoEscrita;
    }

    /**
     * @return the Resultado
     */
    public ArrayList<String> getResultado() {
        return Resultado;
    }

    /**
     * @param Resultado the Resultado to set
     */
    public void setResultado(ArrayList<String> Resultado) {
        this.Resultado = Resultado;
    }
}

