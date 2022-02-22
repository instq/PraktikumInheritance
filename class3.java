/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikuminheritance;

/**
 *
 * @author Inas
 */
public class class3 {
    public static void main(String[]args){
        class1 Class1=new class1();
        Class1.awal();
        
        class2 identitas=new class2();
        identitas.nama="Diah";
        identitas.jk="Perempuan";
        identitas.nopegawai=333333;
        identitas.cetak();
        
        class1 kerja=new class1();
        kerja.kerja();
        kerja.gaji(0);
        kerja.kerjabaik(0);
        
    }
}
