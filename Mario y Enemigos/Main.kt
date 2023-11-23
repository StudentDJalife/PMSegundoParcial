import Clases.*

fun main(){
        val mario = Mario()

        mario.collision("star")

        
        val enemy = Goomba()
        enemy.collision("Enemy")
        enemy.collision("Weapon")
        val koopa = Koopa()
        koopa.collision("Weapon")
}