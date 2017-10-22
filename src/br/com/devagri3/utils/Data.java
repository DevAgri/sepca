/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.utils;

import java.util.Calendar;

/**
 *
 * @author Willyan
 */
public class Data {

    private static Calendar calendario = Calendar.getInstance();
    private int dia, mes, ano;

    public String dataAtual() {
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        ano = calendario.get(Calendar.YEAR);


        return ""+diaSemana()+", " + dia + " de " + mesAno() + " de " + ano;
    }

    public String diaSemana() {
        String dia_semana = "";

        switch (calendario.get(Calendar.DAY_OF_WEEK)) {

            case 1:
                dia_semana = "Domingo";
                break;
            case 2:
                dia_semana = "Segunda";
                break;
            case 3:
                dia_semana = "Terça";
                break;
            case 4:
                dia_semana = "Quarta";
                break;
            case 5:
                dia_semana = "Quinta";
                break;
            case 6:
                dia_semana = "Sexta";
                break;
            case 7:
                dia_semana = "Sábado";
                break;
        }

        return dia_semana;
    }
    public String mesAno() {
        String mes_ano = "";

        switch (calendario.get(Calendar.MONTH)) {

            case 0:  mes_ano = "Janeiro"; break;
            case 1:  mes_ano = "Fevereiro"; break;
            case 2:  mes_ano = "Março"; break;
            case 3:  mes_ano = "Abril"; break;
            case 4:  mes_ano = "Maio"; break;
            case 5:  mes_ano = "Junho"; break;
            case 6:  mes_ano = "Julho"; break;
            case 7:  mes_ano = "Agosto"; break;
            case 8:  mes_ano = "Setembro"; break;
            case 9:  mes_ano = "Outubro"; break;
            case 10: mes_ano = "Novembro"; break;
            case 11: mes_ano = "Dezembro"; break;
            
       }
        return mes_ano;
    }
    
}
