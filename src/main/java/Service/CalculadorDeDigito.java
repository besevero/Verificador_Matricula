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
public class CalculadorDeDigito extends VerificadorDeMatricula{
    
    public ArrayList<String> CalcularDigito(ArrayList<String> matriculas){
        int valor, peso, soma;
        ArrayList<String> resultado = new ArrayList();
        for(int i=0;i<matriculas.size();i++){
            peso = 5;
            soma = 0;
            String valorMatricula = matriculas.get(i);
            for(int j= 0; j< valorMatricula.length();j++){
                valor = (int)( valorMatricula.charAt(j) - 48);
                soma = soma + (valor*peso);
                peso = peso-1;
            }
            resultado.add(valorMatricula + "-" + CalculaBase16(soma%16).toUpperCase());
        }
        return resultado;
    }
}
