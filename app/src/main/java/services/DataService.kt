package services

import model.Category
import model.Prodect

object DataService {
    val categories = listOf(
        Category("SHIRE","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGETAL","digitalgoodsimage")
    )
    val hats = listOf(
        Prodect("Devslops Graphic Beanie","$18","hat01"),
        Prodect("Devslops Hat black","$25","hat02"),
        Prodect("Devslops Hat white","$32","hat03"),
        Prodect("Devslops Hat Snapback","$18","hat04")
    )
    val hoodies = listOf(
        Prodect("Devslops Hoodie Gray","$28","hoodie01"),
        Prodect("Devslops Hoodie Red","$23","hoodie02"),
        Prodect("Devslops Gray Hoodie","$28","hoodie03"),
        Prodect("Devslops Black Hoodie","$32","hoodie04")
    )
    val shirts = listOf(
        Prodect("Devslops Short Black","$18","shirt01"),
        Prodect("Devslops Badge Light Gray","$20","shirt02"),
        Prodect("Devslops Long Shirt Red","$20","shirt03"),
        Prodect("Devslops Hustle","$32","shirt04"),
        Prodect("kickflib studio","$18","shirt05")
    )


}