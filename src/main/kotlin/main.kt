fun main() {
    val amount = 1000
    val commission = 0.75
    val minCommissionRub = 35
    val commissionRub = (commission * amount)/ 100
    val result = if (commissionRub < minCommissionRub) minCommissionRub else commissionRub
    println("комиссия: $result руб")
}