package com.example.demo.soma;



public class SringInvertida {
    public static void main(String[] args) {
        String palavra = "Patricia dos Santos";
        String resultado=""; 

        for(int x = palavra.length() -1;x>=0;x--){
            resultado = resultado + palavra.charAt(x);
        }
        System.out.println(resultado);

}
}
