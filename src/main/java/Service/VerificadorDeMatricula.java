/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Repository.LeitorDeArquivo;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class VerificadorDeMatricula {
    
    private LeitorDeArquivo leitor;
    
    public VerificadorDeMatricula(){}
    
    public ArrayList<String> lerArquivo(String arquivoLeitura){
        setLeitor(new LeitorDeArquivo());
        leitor.setArquivoLeitura(arquivoLeitura);
        getLeitor().LerArquivos();
        return getLeitor().getResultado();
    }
    public void escreverArquivo(ArrayList<String> matriculas, String arquivoEscrita){
        setLeitor(new LeitorDeArquivo());
        leitor.setArquivoEscrita(arquivoEscrita);
        getLeitor().EscreverArquivos(matriculas);
    }
    
    public String CalculaBase16(int valor){
        return Integer.toString(valor, 16);
    }

    public LeitorDeArquivo getLeitor() {
        return leitor;
    }

   public void setLeitor(LeitorDeArquivo leitor) {
        this.leitor = leitor;
    }
}
