/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.umfst.csillam;

/**
 *
 * @author boldi
 */
public class Main 
{
    public static void main(String[] args) 
    {
        CsillamPoni p = new RepuloCsillamPoni("CsillamKapitan", 7, "lila");
        p.adjCsillamot(3);
        System.out.println(p.bemutatkozas());
    }
 
}
