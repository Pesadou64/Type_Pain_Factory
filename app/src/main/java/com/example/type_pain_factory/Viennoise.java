package com.example.type_pain_factory;

public class Viennoise implements Pain { //Classe viennoise qui est implemente la classe Pain

    @Override
    public String nom() {
        return "Pain Viennois";
    } //redéfintion de la méthode nom

    @Override
    public String calories() {
        return " : 75 kcal";
    }//redéfintion de la méthode calorie
}
