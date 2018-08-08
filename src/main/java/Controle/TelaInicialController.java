/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Service.CalculadorDeDigito;
import Service.VerificadorDeDigito;
import java.util.ArrayList;
import Model.Matricula;
/**
 *
 * @author Bernardo
 */
public class TelaInicialController {
    
    public TelaInicialController(){}
    
    public void CalcularDigito(String arquivoLeitura, String arquivoEscrita){
         Matricula matricula = new Matricula();
         CalculadorDeDigito calculador = new CalculadorDeDigito();
         matricula.setMatriculas(calculador.lerArquivo(arquivoLeitura));
         calculador.CalcularDigito(matricula.getMatriculas());
         calculador.escreverArquivo(calculador.CalcularDigito(matricula.getMatriculas()), arquivoEscrita);
    }
    public void ValidarDigito(String arquivoLeitura, String arquivoEscrita){
        Matricula matricula = new Matricula();
        VerificadorDeDigito verificador = new VerificadorDeDigito();
        matricula.setMatriculas(verificador.lerArquivo(arquivoLeitura));
        verificador.VerificarDigito(matricula.getMatriculas());
        verificador.escreverArquivo(verificador.VerificarDigito(matricula.getMatriculas()), arquivoEscrita);
    }
}
