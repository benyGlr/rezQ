package com.example.rezqflex.rezq;

/**
 * Created by Ben on 2018-02-21.
 */

public enum Genres {
    Comedy,
    Sci_Fi,
    Horror,
    Romance,
    Action,
    Thriller,
    Drama,
    Mystery,
    Crime,
    Animation,
    Adventure,
    Fantasy,
    Comedy_Romance,
    Action_Comedy,
    Superhero;

    String toString(Genres g){
        switch(this){
            case Comedy:
                return "Comedy";
            case Sci_Fi:
                return "Sci_Fi";
            case Horror:
                return "Horror";
            case Romance:
                return "Romance";
            case Action:
                return "Action";
            case Thriller:
                return "Thriller";
            case Drama:
                return "Drama";
            case Mystery:
                return "Mystery";
            case Crime:
                return "Crime";
            case Animation:
                return "Animation";
            case Adventure:
                return "Adventure";
            case Fantasy:
                return "Fantasy";
            case Comedy_Romance:
                return "Comedy_Romance";
            case Action_Comedy:
                return "Action_Comedy";
            case Superhero:
                return "Superhero";
            default:
                return "";

        }
    }
}
