import Clases.*

fun main(){
        //Clase Teléfono
        val myPhone = Phone()
        myPhone.getTurn()
        myPhone.turnOn()
        myPhone.getTurn()
        //Clase Vehículo
        val miVehiculo = Vehiculos("Ford","2020","Verde")
        miVehiculo.placas = "NNT3047"
        println("El coche está encendido? ${miVehiculo.encendido}")
        miVehiculo.encender()
        println("El coche encendio? ${miVehiculo.encendido}")
        println("El tanque tiene ${miVehiculo.gasolina}")
        miVehiculo.recargar(20.07f)
        println("El tanque ahora tiene ${miVehiculo.gasolina}")
        val golNegro = Vehiculos("Volkswagen", "Gol")
        //Crear un nuevo auto pasando los argumentos usando NamedArguments
        val sonicAzul = Vehiculos(
                marca = "Ford",
                modelo = "Sonic",
                color = "Azul",
                placas = "ALS9763"
        )
        println(golNegro)
        println(sonicAzul)
    }