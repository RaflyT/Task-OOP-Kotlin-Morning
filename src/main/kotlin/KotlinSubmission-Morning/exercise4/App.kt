package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.ArithmeticException

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        var angka = 2
        angka / 0
    }
    catch (e:ArithmeticException){
        println("Pembagian angka 0")
    }


}