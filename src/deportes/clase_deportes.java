/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;
import java.time.LocalDate;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Carlos Hack
 */
public class clase_deportes {
    
    private int Numero_Elementos;
    private String Nombre[];
    private int Edad[];
    private String Sexo[];
    private int Estatura[];
    private int Peso[];
    private String Deportes[];

    public clase_deportes(int tam) {
        Numero_Elementos = tam;
        Nombre = new String[tam];
        Edad = new int[tam];
        Sexo = new String[tam];
        Estatura = new int[tam];
        Peso = new int[tam];
        Deportes = new String[tam];
    }

    /**
     * @return the Numero_Elementos
     */
    public int getNumero_Elementos() {
        return Numero_Elementos;
    }

    /**
     * @param Numero_Elementos the Numero_Elementos to set
     */
    public void setNumero_Elementos(int Numero_Elementos) {
        this.Numero_Elementos = Numero_Elementos;
    }

    /**
     * @return the Nombre
     */
    public String getNombre(int lugar) {
        return Nombre[lugar];
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String simbolo, int lugar) {
       Nombre[lugar]= simbolo;
    }

    /**
     * @return the Edad
     */
    public int getEdad(int lugar) {
        return Edad[lugar];
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int simbolo, int lugar) {
        Edad[lugar] = simbolo;
    }

    /**
     * @return the Sexo
     */
    public String getSexo(int lugar) {
        return Sexo[lugar];
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String simbolo, int lugar) {
        Sexo[lugar] = simbolo;
    }

    /**
     * @return the Estatura
     */
    public int getEstatura(int lugar) {
        return Estatura[lugar];
    }

    /**
     * @param Estatura the Estatura to set
     */
    public void setEstatura(int simbolo, int lugar) {
        Estatura[lugar] = simbolo;
    }

    /**
     * @return the Peso
     */
    public int getPeso(int lugar) {
        return Peso[lugar];
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(int simbolo, int lugar) {
        Peso[lugar] = simbolo;
    }

    /**
     * @return the Deportes
     */
    public String getDeportes(int lugar) {
        return Deportes[lugar];
    }

    /**
     * @param Deportes the Deportes to set
     */
    public void setDeportes(String simbolo, int lugar) {
        Deportes[lugar] = simbolo;
    }
 
    public void cant_elementos(){
        Numero_Elementos++;
    }

   //Metodos son:
    
    public String Analizar_aceptados (int i){
        
    String los_deportes = "";
    if ("M".equals(getSexo(i)) && getEdad(i) < 17 && getEstatura(i) >= 170 && getPeso(i) >= 60) {
            los_deportes = "Futbol";
    }
    else if ("F".equals(getSexo(i)) && getEdad(i) < 18 && getPeso(i) >= 50) {
            los_deportes = "Futbol";
    }
    else if ("M".equals(getSexo(i)) && getEstatura(i) >= 180) {
            los_deportes = "Basquetball";
    }
    else if ("F".equals(getSexo(i)) && getEstatura(i) >= 170) {
            los_deportes = "Basquetball";
    }
    else if ("M".equals(getSexo(i)) && getEdad(i) > 18) {
            los_deportes = "Voleiball";
    }
    else if ("F".equals(getSexo(i)) && getEdad(i) > 18) {
            los_deportes = "Voleiball";
    }
    else {
            los_deportes = "No clasifica";

        }
        return los_deportes;
    }
    
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

   
    private Date getFechaHoy() {
        
        Date fechaHoy = null;
       
        try 
        
        {
            
        LocalDate now = LocalDate.now();
        int año = now.getYear();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();

        String fechaInicial = dia + "/" + mes + "/" + año;
        fechaHoy = formatoFecha.parse(fechaInicial);

        } 
        
        catch (ParseException ex) {

        }
        return fechaHoy;
    }

    public int edad(Date Fecha) {
        int milisDias = 86400000;
        int año = (int) ((getFechaHoy().getTime() - Fecha.getTime()) / milisDias) / 365;

        return año;
    }
    
}
