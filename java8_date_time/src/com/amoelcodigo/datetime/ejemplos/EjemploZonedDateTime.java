package com.amoelcodigo.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(newYork);
        System.out.println("Hora de partida en New York: " + zonaNy);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MM yyyy");
        System.out.println("Detalles del viaje a España: ");
        System.out.println("Partida NY " + f.format(zonaNy));
        System.out.println("Llegada Madrid: " + f.format(zonaMadrid));

        Set<String> zonas = ZoneId.getAvailableZoneIds();
        //zonas.forEach(System.out::println);
    }
}
