package com.app.DockerHub;

public class Main{
    public static void main(String[] args)
    {
        System.out.println( CheckIfInputIsAnEvenNumber(122));
    }
    
    public static boolean CheckIfInputIsAnEvenNumber(int number)
    {
    	return number % 2 == 0;
    }
}

