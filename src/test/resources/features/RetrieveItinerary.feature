# language: es

Característica: Recuperar itinerario
  Como cliente de esta aerolinea
  Deseo recuperar todos los itinerarios disponibles
  Para poder tomar una desición sobre cual vuelo tomar

  Antecedentes:
    Dado el sitio está encendido

  Esquema del escenario: <descripción>
    Dado que quiero conocer el itinerario de un <designador>
    Cuando accedo al sitio "/itinerary/{pathVariable}"
    Entonces la api deberá responder con <respuesta>
    Ejemplos:
    |designador|respuesta    |descripción              |
    |"BRAVO"   |"OK"         |"Recuperar itinerario"   |
    |"ZULU"    |"NO_CONTENT" |"Itinerario vacio"       |
    |"PAPA"    |"BAD_REQUEST"|"Designador incorrecto"  |