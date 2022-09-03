package com.example.punct;

public class Dog {
    private String nume;
    private int varsta;
    private String culoare;
    private String rasa;
    private int greutate;
    public Dog(String nume, int varsta, String culoare,String rasa,int greutate){
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        this.rasa = rasa;
        this.greutate = greutate;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getRasa() {
        return rasa;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getNume(){
        return nume;
    }
    public int getVarsta(){
        return varsta;
    }


}
