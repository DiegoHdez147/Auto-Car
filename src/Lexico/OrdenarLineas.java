/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lexico;

import java.util.Comparator;

/**
 *
 * @author kamia
 */
public class OrdenarLineas implements Comparator<Tokenizer>{
    
    public int compare(Tokenizer o1, Tokenizer o2)
    {
        if(o1.getLinea() < o2.getLinea()){return -1;}
        else if(o1.getLinea() < o2.getLinea())
        {return 0;}
        else{return 1;}
    }
}
