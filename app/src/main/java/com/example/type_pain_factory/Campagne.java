package com.example.type_pain_factory;

public class Campagne implements Pain { //Classe Campagne qui est implemente la classe Pain

    @Override
    public String nom() {
        return "Pain de campagne";
    } //redéfintion de la méthode nom

    @Override
    public String calories() {
        return " : 85 kcal";
    } //redéfinition de la méthode calorie
}
