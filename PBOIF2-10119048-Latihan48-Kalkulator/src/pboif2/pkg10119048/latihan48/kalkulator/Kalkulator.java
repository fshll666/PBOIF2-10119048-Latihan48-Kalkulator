/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan48.kalkulator;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi program Kalkulator
 */
public class Kalkulator {
        private double value1;
    private double value2;
    
    public double getValue1(){
        return value1;
    }
    public void setValue1(double value1){
        this.value1 = value1;
    }
    public double getValue2(){
        return value2;
    }
    public void setValue2(double value2){
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.printf("Project Calculator\n");
    }
    
    public void setNoteProject(String note){
        System.out.printf("%s\n",note);
    }
    
    public double add(double value1, double value2){
        return value1 + value2;
    }
    
    public double minus(double value1, double value2){
        return value1 - value2;
    }
    
    public double multiplication(double value1, double value2){
        return value1 * value2;
    }
    
    public double division(double value1, double value2){
        return value1 / value2;
    }
}
