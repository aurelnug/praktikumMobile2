class Pekerjaan(var nama: String = "Mobile Programmer",
                var tempat: String = "Google",
                var gaji: Int = 25000000,
                var jabatan: String = "Junior Mobile Programmer"){

    fun tampil(){
        println("Nama pekerjaan: $nama")
        println("Tempat bekerja: $tempat")
        println("Gaji per-bulan: $gaji")
        println("Jabatan: $jabatan")
    }
}

fun main (args: Array<String>){
    val pekerjaanSaya = Pekerjaan()
    pekerjaanSaya.tampil()
}