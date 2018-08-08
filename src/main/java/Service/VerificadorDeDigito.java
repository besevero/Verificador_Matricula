/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class VerificadorDeDigito extends VerificadorDeMatricula{
    
    
    public ArrayList<String> VerificarDigito(ArrayList<String> matriculas){
        int valor, peso, soma;
        String ehIgual = "";
        ArrayList<String> resultado = new ArrayList();
        for(int i=0;i<matriculas.size();i++){
            peso = 5;
            soma = 0;
            String[] valoresMatricula = matriculas.get(i).split("-");
            String valorMatricula = valoresMatricula[0];
            String digito = valoresMatricula[1];
            for(int j= 0; j< valorMatricula.length();j++){
                valor = (int)( valorMatricula.charAt(j) - 48);
                soma = soma + (valor*peso);
                peso = peso-1;
            }
            if(CalculaBase16(soma%16).equals(digito)){
                ehIgual = "verdadeiro";
            }
            else{
                ehIgual = "Falso";
            }
            resultado.add(matriculas.get(i) +" - " + ehIgual);
        }
        return resultado;
    }
}
