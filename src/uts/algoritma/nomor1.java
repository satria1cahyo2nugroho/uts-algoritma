/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.algoritma;

import java.util.Scanner;

/**
 *
 * @author satria cahyo nugroho
 */
public class nomor1 {
    
public static void bubblesort(int[] A) { 
    int i=1, j, n =A.length;
    int temp;
    while (i<n){
        j = n-1 ;
        while(j>=1){
            if (A[j-1]>A[j]){
                temp = A[j];
                A[j]=A[j-1];
                A[j-1]=temp;
            }
            j = j - 1;  
        }
        i = i + 1;
    }
}
public static void tampil(int data[]) {
   for (int i = 0; i< data.length; i++) {
       System.out.print(data[i] + "");
   }
   
   System.out.println();
}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data[]={3,10,4,2,8,13};
        nomor1.tampil(data);
        nomor1.bubblesort(data);
        int search=8;
        int IndeksAwal=0;
        int IndeksAkhir=data.length-1;
        int ketemu = 0;
        int point=0;
        
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        while((IndeksAwal<=IndeksAkhir)&&(ketemu==0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+point);
            if(search == data[point]){
                ketemu = 1;
                System.out.println("Data "+search+" Telah Ditemukan di indeks ke : "+point);
                }else if (search<data[point]){
                    System.out.println("Cari di kiri ");
                    IndeksAkhir = point-1;
                }
                else{
                    IndeksAwal = point+1;
                    System.out.println("Cari di kanan");
                }
        }
        if(ketemu==1){
            System.out.println("Kesimpulan : Data diTemukan ");
        }else{
            System.out.println("Kesimpulan : Data tidak ditemukan ");
        }
        
    }
}

        
  