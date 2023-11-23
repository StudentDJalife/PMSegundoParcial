package Clases

import Interfaces.IPromotion

class NationalLowSeason(city:String) : National(city), IPromotion {
    override val discount = 10//Esto representa el descuento que se hace.
    override val typeDiscount = 0// 0 Indica un porcentaje, 1 indica una cantidad.

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

}