/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.umfst.csillam;

/**
 *
 * @author boldi
 */
public class CsillamPoni 
{
    private String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) 
 {
    //this.nev is the correct one 
    this.nev = nev;
    this.csillamPont = csillamPont;
 }
    public void adjCsillamot(int mennyiseg) 
 {
    csillamPont += mennyiseg;
 }
    public int getCsillamPont() 
 {
        return csillamPont;
 }
    public String bemutatkozas()
 {
        return nev + ": " + csillamPont;
 }
    public String getNev()
    {
        return nev;
    }

}
