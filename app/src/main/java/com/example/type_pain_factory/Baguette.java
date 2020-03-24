package com.example.type_pain_factory;


public class Baguette implements Pain { //Implémentation de la classe Pain

    @Override
    public String nom() {
        return "Baguette";
    } //redéfinition de la méthode nom

    @Override
    public String calories() {
        return " : 65 kcal";
    } //redéfintion de la méthode calorie
}


