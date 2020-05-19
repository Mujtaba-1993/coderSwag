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
        Prodect("Devslops Graphic Beanie","$18","hat1","wow nice proudict"),
    Prodect("Devslops Hat black","$25","hat2","wow nice proudict"),
    Prodect("Devslops Hat white","$32","hat3","wow nice proudict"),
    Prodect("Devslops Hat Snapback","$18","hat4","wow nice proudict"),
        Prodect("Devslops Graphic Beanie","$18","hat1","wow nice proudict"),
        Prodect("Devslops Hat black","$25","hat2","wow nice proudict"),
        Prodect("Devslops Hat white","$32","hat3","wow nice proudict"),
        Prodect("Devslops Hat Snapback","$18","hat4","wow nice proudict"),
        Prodect("Devslops Graphic Beanie","$18","hat1","wow nice proudict"),
        Prodect("Devslops Hat black","$25","hat2","wow nice proudict"),
        Prodect("Devslops Hat white","$32","hat3","wow nice proudict"),
        Prodect("Devslops Hat Snapback","$18","hat4","wow nice proudict")
    )
    val hoodies = listOf(
        Prodect("Devslops Hoodie Gray","$28","hoodie1","wow nice proudict"),
        Prodect("Devslops Hoodie Red","$23","hoodie2","wow nice proudict"),
        Prodect("Devslops Gray Hoodie","$28","hoodie3","wow nice proudict"),
        Prodect("Devslops Black Hoodie","$32","hoodie4","wow nice proudict"),
        Prodect("Devslops Hoodie Gray","$28","hoodie1","wow nice proudict"),
        Prodect("Devslops Hoodie Red","$23","hoodie2","wow nice proudict"),
        Prodect("Devslops Gray Hoodie","$28","hoodie3","wow nice proudict"),
        Prodect("Devslops Black Hoodie","$32","hoodie4","wow nice proudict"),
    Prodect("Devslops Hoodie Gray","$28","hoodie1","wow nice proudict"),
    Prodect("Devslops Hoodie Red","$23","hoodie2","wow nice proudict"),
    Prodect("Devslops Gray Hoodie","$28","hoodie3","wow nice proudict"),
    Prodect("Devslops Black Hoodie","$32","hoodie4","wow nice proudict")

    )
    val shirts = listOf(
        Prodect("Devslops Short Black","$18","shirt1","wow nice proudict"),
        Prodect("Devslops Badge Light Gray","$20","shirt2","wow nice proudict"),
        Prodect("Devslops Long Shirt Red","$20","shirt3","wow nice proudict"),
        Prodect("Devslops Hustle","$32","shirt4","wow nice proudict"),
        Prodect("kickflib studio","$18","shirt5","wow nice proudict"),
        Prodect("Devslops Short Black","$18","shirt1","wow nice proudict"),
        Prodect("Devslops Badge Light Gray","$20","shirt2","wow nice proudict"),
        Prodect("Devslops Long Shirt Red","$20","shirt3","wow nice proudict"),
        Prodect("Devslops Hustle","$32","shirt4","wow nice proudict"),
        Prodect("kickflib studio","$18","shirt5","wow nice proudict"),
        Prodect("Devslops Badge Light Gray","$20","shirt2","wow nice proudict"),
        Prodect("Devslops Long Shirt Red","$20","shirt3","wow nice proudict"),
        Prodect("Devslops Hustle","$32","shirt4","wow nice proudict"),
        Prodect("kickflib studio","$18","shirt5","wow nice proudict")
    )
    val digitalGoods = listOf<Prodect>()

    fun getProdect(category: String?):List<Prodect>{
         return when (category){
             "SHIRE"-> shirts
             "HOODIE"-> hoodies
             "HATS"-> hats
             else -> digitalGoods
         }
    }


}