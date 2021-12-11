package com.example.biblioteca;


/*
 * un host (Decidir que pantalla va a mostrar segun el evento de navegacion)
 */

import android.support.v4.app.Fragment;

public interface NavigationHost {
    /*
     *  Disparador de navegacion hacia un fragmento especifico
     */
    void navigateTo(Fragment fragment, boolean addToBackstack);
}