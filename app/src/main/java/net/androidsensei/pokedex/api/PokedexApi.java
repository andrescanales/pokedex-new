package net.androidsensei.pokedex.api;

import com.android.volley.Response;

import net.androidsensei.pokedex.PokedexApplication;
import net.androidsensei.pokedex.model.PokemonList;

/**
 * Created by andrescanales on 1/18/15.
 */
public class PokedexApi {
    static String BASE_PATH = "http://mi-pokedex.herokuapp.com/api/";
    static String MI_POKEDEX_URL = BASE_PATH + "pokemons";

    public static void getPokemons(Response.Listener onResponse, Response.ErrorListener onError){
        GsonRequest <PokemonList> getPersons = new GsonRequest<PokemonList>(MI_POKEDEX_URL, PokemonList.class, onResponse, onError);
        PokedexApplication.getInstance().addToRequestQueue(getPersons);
    }
}