package com.amoelcodigo.list.ejercicios;

import com.amoelcodigo.models.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class VueloEjercicio {

    public static void main(String[] args) throws ParseException {
    List<Vuelo> vuelosList = new ArrayList<>();
        vuelosList = addVuelos();

        System.out.println("Ordenar de forma Ascendente por llegada");
        vuelosList.sort(Comparator.comparing(Vuelo::getNombre));

        System.out.println("vuelos en forma ascendente por nombre= " + vuelosList);

        vuelosList.sort(Comparator.comparing(Vuelo::getFechaLLegada));
        System.out.println("El último vuelo en llegar es = " + vuelosList.getLast());


    }

    public static List<Vuelo> addVuelos() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy HH:mm", Locale.ENGLISH);
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", sdf.parse("Mon 29 Aug 2021 05:39"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", sdf.parse("Tue 31 Aug 2021 04:45"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", sdf.parse("Tue 31 Aug 2021 16:00"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", sdf.parse("Tue 31 Aug 2021 13:22"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", sdf.parse("Tue 31 Aug 2021 14:05"), 60));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", sdf.parse("Tue 31 Aug 2021 05:35"), 25));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", sdf.parse("Tue 31 Aug 2021 08:45"), 51));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", sdf.parse("Mon 30 Aug 2021 07:41"), 45));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", sdf.parse("Tue 31 Aug 2021 09:57"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", sdf.parse("Mon 29 Aug 2021 09:14"), 39));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", sdf.parse("Mon 29 Aug 2021 08:33"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", sdf.parse("Mon 29 Aug 2021 15:15"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", sdf.parse("Mon 30 Aug 2021 08:14"), 57));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", sdf.parse("Mon 29 Aug 2021 22:53"), 45));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", sdf.parse("Tue 31 Aug 2021 09:57"), 43));
        vuelos.add(new Vuelo("LAT 128", "Cancún", "Santiago", sdf.parse("Tue 31 Aug 2021 04:00"), 42));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", sdf.parse("Tue 31 Aug 2021 07:45"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", sdf.parse("Mon 30 Aug 2021 07:12"), 54));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", sdf.parse("Mon 30 Aug 2021 18:29"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", sdf.parse("Mon 30 Aug 2021 15:45"), 39));
        return vuelos;
    }


}
