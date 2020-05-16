package services

import model.Category
import model.Prodect

object DataService {
    val categories = listOf(
        Category("SHIRE","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGETAL","digitalgoodsimage"),
        Category("SHIRE","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGETAL","digitalgoodsimage"),
        Category("SHIRE","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGETAL","digitalgoodsimage")

    )
    val hats = listOf(
        Prodect("Devslops Graphic Beanie","$18","hat1"),
    Prodect("Devslops Hat black","$25","hat2"),
    Prodect("Devslops Hat white","$32","hat3"),
    Prodect("Devslops Hat Snapback","$18","hat4"),
        Prodect("Devslops Graphic Beanie","$18","hat1"),
        Prodect("Devslops Hat black","$25","hat2"),
        Prodect("Devslops Hat white","$32","hat3"),
        Prodect("Devslops Hat Snapback","$18","hat4"),
        Prodect("Devslops Graphic Beanie","$18","hat1"),
        Prodect("Devslops Hat black","$25","hat2"),
        Prodect("Devslops Hat white","$32","hat3"),
        Prodect("Devslops Hat Snapback","$18","hat4")
    )
    val hoodies = listOf(
        Prodect("Devslops Hoodie Gray","$28","hoodie1"),
        Prodect("Devslops Hoodie Red","$23","hoodie2"),
        Prodect("Devslops Gray Hoodie","$28","hoodie3"),
        Prodect("Devslops Black Hoodie","$32","hoodie4"),
        Prodect("Devslops Hoodie Gray","$28","hoodie1"),
        Prodect("Devslops Hoodie Red","$23","hoodie2"),
        Prodect("Devslops Gray Hoodie","$28","hoodie3"),
        Prodect("Devslops Black Hoodie","$32","hoodie4"),
        Prodect("Devslops Hoodie Gray","$28","hoodie1"),
        Prodect("Devslops Hoodie Red","$23","hoodie2"),
        Prodect("Devslops Gray Hoodie","$28","hoodie3"),
        Prodect("Devslops Black Hoodie","$32","hoodie4")

    )
    val shirts = listOf(
        Prodect("Devslops Short Black","$18","shirt1"),
        Prodect("Devslops Badge Light Gray","$20","shirt2"),
        Prodect("Devslops Long Shirt Red","$20","shirt3"),
        Prodect("Devslops Hustle","$32","shirt4"),
        Prodect("kickflib studio","$18","shirt5"),
        Prodect("Devslops Short Black","$18","shirt1"),
        Prodect("Devslops Badge Light Gray","$20","shirt2"),
        Prodect("Devslops Long Shirt Red","$20","shirt3"),
        Prodect("Devslops Hustle","$32","shirt4"),
        Prodect("kickflib studio","$18","shirt5"),
        Prodect("Devslops Badge Light Gray","$20","shirt2"),
        Prodect("Devslops Long Shirt Red","$20","shirt3"),
        Prodect("Devslops Hustle","$32","shirt4"),
        Prodect("kickflib studio","$18","shirt5")
    )
    val digitalGoods = listOf<Prodect>()

    fun getProdect(category:String):List<Prodect>{
         return when (category){
             "SHIRE"-> shirts
             "HOODIE"-> hoodies
             "HATS"-> hats
             else -> digitalGoods
         }
    }


}