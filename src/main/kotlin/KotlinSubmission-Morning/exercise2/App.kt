package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var i = 1
    var daftar : MutableList<Int> = mutableListOf()
    while (i <= 100){

        if (i %2 == 0){
            daftar.add(i)

        }
        i++
    }
    println(daftar)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...*/
    // Buat di bawah sini
    val bulan = mapOf("jan" to "January","feb" to "February","mar" to "March","apr" to "April","may" to "May","jun" to "June","jul" to "July","aug" to "August","sep" to "September","oct" to "October","nov" to "November","dec" to "December")


    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...*/
    // Buat di bawah sini
    bulan.forEach{ bulan->
        println(bulan)

    }
    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini.
    val monthNow = "November"
    val birthMonth = "May"
    println("It's {$monthNow} now, I was born in {$birthMonth}")

}