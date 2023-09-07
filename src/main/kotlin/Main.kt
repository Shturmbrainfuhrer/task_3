fun calculateDiscount(purchaseAmount: Double, isRegularCustomer: Boolean): Double {
    var discount = 0.0

    if (purchaseAmount in 1.0..1000.0) {
        discount = 0.0
    } else if (purchaseAmount in 1001.0..10000.0) {
        discount = 100.0
    } else if (purchaseAmount > 10000.0) {
        discount = purchaseAmount * 0.05
    }

    if (isRegularCustomer) {
        discount += purchaseAmount * 0.01
    }

    return discount
}

fun main() {
    val purchaseAmount = 15000.0
    val isRegularCustomer = true

    val discount = calculateDiscount(purchaseAmount, isRegularCustomer)
    println("Скидка составит: $discount рублей")
}




