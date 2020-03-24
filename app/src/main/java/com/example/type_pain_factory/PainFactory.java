package com.example.type_pain_factory;

public class PainFactory { //La classe Fabrique qui permet de détecter la classe a instancier

    public Pain getPain(String TypeDePain) {

        if (TypeDePain == "CAM") { //Si on clique sur le boutton qui correspond au type de pain "CAM"
            //Alors un objet du type de pain choisis est retourné
            return new Campagne();

        } else if (TypeDePain == "BAG") {//Si on clique sur le boutton qui correspond au type de pain "CAM"
            //Alors un objet du type de pain choisis est retourné
            return new Baguette();

        } else if (TypeDePain == "VIE") {//Si on clique sur le boutton qui correspond au type de pain "CAM"
            //Alors un objet du type de pain choisis est retourné
            return new Viennoise();
        }

        return null;
    }

}
