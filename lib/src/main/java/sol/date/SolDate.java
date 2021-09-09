package sol.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SolDate {
    
    private GregorianCalendar date;

    public SolDate(GregorianCalendar date){
        this.date = date;
    }

    public SolDate(){
        this.date = new GregorianCalendar();
    }

    public SolDate(int year, int month, int day){
        this.date = new GregorianCalendar(year, month, day);
    }

    /**
     * Devolve uma string da data registrada atual com o formato passado
     * @param mask Máscara passada para a formatação da data (Ex.: dd/MM/yyyy - 20/03/2021)
     * @return Uma string com a máscara passada da data registrada
     */
    public String format(String mask){
        return new SimpleDateFormat(mask).format(this.date);
    }

    /**
     * Retorna o dia do mês registrado
     */
    public Integer getDay(){
        return date.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Retorna o mês registrado
     */
    public Integer getMonth(){
        return date.get(Calendar.MONTH)+1;
    }

    /**
     * Retorna o ano registrado
     */
    public Integer getYear(){
        return date.get(Calendar.YEAR);
    }

}
