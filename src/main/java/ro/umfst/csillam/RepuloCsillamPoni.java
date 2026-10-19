/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.umfst.csillam;

/**
 *
 * @author boldi
 */
class RepuloCsillamPoni extends CsillamPoni 
{
    private String szarnySzin;
    public RepuloCsillamPoni(String nev, int csillamPont, String szarnySzin) 
    {
        super(nev, csillamPont);
        this.szarnySzin = szarnySzin;
 }
    
    public String getSzarnySzin()
    {
        return szarnySzin;
    }
 @Override
 public String bemutatkozas() 
 {
    return "Repulo poni: " + getNev();
 }
}
