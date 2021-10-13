package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // Estructura de control if
        /*if(condicion){

        }else if(){

        }else
        {
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cuál es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if (edad >18){
            System.out.println("Felicidades "+  nombre +", puedes votar ");
        }else{
            System.out.println("Hola"+nombre+"Aun no puedes votar");
        }

        }
}
