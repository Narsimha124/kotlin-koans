package ii_collections.data

import ii_collections.*

//products
val idea = Product("Idea", 12999.0)
val samsung = Product("Samsung", 2999.0)
val htc = Product("htc", 13999.0)
val appo = Product("appo", 16999.0)
val vivo = Product("vivo", 11999.0)
val googleplx = Product("googleplx", 59999.0)
val redmi = Product("redmi", 9999.0)
val micromax = Product("micromax", 4999.0)
val iphone = Product("iphone", 69999.0)
val karbon = Product("karbon", 6499.0)
val nokia = Product("Nokia", 20999.0)
val celcon = Product("celcon", 8500.0)

//customers
val hyderabad = "Hyderabad"
val chianni = "Chianni"
val bangulor = "Bangulor"
val mumbai = "Mumbai"
val delhi = "Delhi"
val kolkatha = "Kolkatha"
val vijayawada = "Vijayawada"

//cities
val hyd_chi_city = City("hyd_chi_city")
val ban_city = City("ban_city")
val puna = City("puna")
val noyadia = City("noyadia")
val kolkatha_bangular_city = City("kolkatha_bangular_city")

fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())
fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)
fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())


val shop = shop("jb test shop",
        customer(hyderabad, hyd_chi_city,
                order(samsung),
                order(samsung, appo, htc)
        ),
        customer(chianni, hyd_chi_city),
        customer(bangulor, ban_city,
                order(iphone, karbon)
        ),
        customer(mumbai, puna,
                order(idea, isDelivered = false),
                order(idea, isDelivered = false),
                order(idea)
        ),
        customer(delhi, noyadia,
                order(samsung)
        ),
        customer(kolkatha, kolkatha_bangular_city,
                order(idea)
        ),
        customer(vijayawada, kolkatha_bangular_city,
                order(redmi, redmi),
                order(redmi)
        )
)
val customers: Map<String, Customer> = shop.customers.fold(hashMapOf(), {
    map, customer ->
    map[customer.name] = customer
    map
})
val orderedProducts = setOf(idea, samsung, htc, appo, iphone, karbon, redmi)
val sortedCustomers = listOf(chianni, bangulor, delhi, kolkatha, hyderabad, vijayawada, mumbai).map { customers[it] }
val groupedByCities = mapOf(
        hyd_chi_city to listOf(hyderabad, chianni),
        ban_city to listOf(bangulor),
        puna to listOf(mumbai),
        noyadia to listOf(delhi),
        kolkatha_bangular_city to listOf(kolkatha, vijayawada)
).mapValues { it.value.map { name -> customers[name] } }
