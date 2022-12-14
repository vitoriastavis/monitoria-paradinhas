public class Data
{
    String data;
    int dia;
    int mes;
    int ano;  

    // construtores
    public Data(){}

    // get e set data
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data = data;
    }

    // get dia
    public int getDia()
    {
        return dia;
    }

    /* 
    os setters estao comentado pois permitem que se altere o dia
    mes e ano sem alterar o atributo String data.
    poderia ser feito um metodo para fazer este ajuste na string

    public void setDia(int dia)
    {
        this.dia = dia;
    }
    */

    public int getMes() {
        return mes;
    }
    /*
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    */

    public int getAno()
    {
        return ano;
    }
    /*
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    */

    // separa a string da data em inteiros para dia mes e ano
    void parserCompleto()
    {    
        String array[];             // array auxiliar
        array = data.split("/");                    // separacao por /

        // converte para int e atribui
        dia = Integer.parseInt(array[0]);   
        mes = Integer.parseInt(array[1]);
        ano = Integer.parseInt(array[2]);
    }

    // separa a string da data em inteiros para mes e ano
    void parserIncompleto()
    {    
        String array[] = new String[2];             // array auxiliar
        array = data.split("/");                    // separacao por /

        // converte para int e atribui
        mes = Integer.parseInt(array[0]);
        ano = Integer.parseInt(array[1]);
    }
}
