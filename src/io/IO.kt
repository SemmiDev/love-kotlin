import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.charset.Charset
import java.util.*
import kotlin.system.measureTimeMillis

class CONSOLE {
    fun scanner() {
        val scanner = Scanner(System.`in`)
        val readText = scanner.nextLine()
        val readDouble = scanner.nextDouble()
        val readBoolean = scanner.nextBoolean()
        // .. so on
    }
    fun readline(): String? {
        return readLine()
    }
    fun bufferedReader() {
        val read = BufferedReader(InputStreamReader(System.`in`))
        val readText = read.readLine()
    }
    fun console(): String? {
        val console = System.console()
        val readText = console.readLine()
        val readpass = console.readPassword()
        return readText
    }
}

class READ(val filename: String) {
    fun usingForEachLine() = File(this.filename).forEachLine { println(it) }
    fun usingUseLine() = File(this.filename).useLines { it.toList() }
    fun usingBufferedReader(filename: String) = File(this.filename).bufferedReader().readLines()
    fun usingReadLineButNotReccomendedToUseInHugeFile() = File(this.filename).readLines()
    fun usingInputStream() = File(this.filename).inputStream().readBytes().toString(Charsets.UTF_8)
    fun usingReadTextAndReccomendedForUse() = File(this.filename).readText(Charsets.UTF_8)
    fun usingReadFileGetResource(filename: String) = this::class.java.getResource(filename).readText(Charsets.UTF_8)
    fun usingAsStreamForGetResource() = this::class.java.getResourceAsStream(this.filename).bufferedReader().readLines()
}

class WRITE(val filename: String) {
    fun writeText(message: String) = File(this.filename).writeText("sammidev ganteng")
    fun writeByes() = File(this.filename).writeBytes(byteArrayOf(2,4,6,7))
    fun printWritter() = File(this.filename).printWriter().use { out -> out.println("sammi ganteng") }
    fun bufferedWriter(message: String) = File(this.filename).bufferedWriter().use { out -> out.write(message) }
}

fun main() {
    /*
        var call = READ("C:\\Users\\DELL\\Downloads\\LoveKotlin\\src\\io\\names.txt")
        val result: String =  call.usingReadTextAndReccomendedForUse()
        println(result)

        val call2 = WRITE("C:\\Users\\DELL\\Downloads\\LoveKotlin\\src\\io\\tes.txt")
        call2.bufferedWriter("sammi ganteng")
    */
    println("hmmm : ")
    val withCONSOLE = BufferedReader(InputStreamReader(System.`in`)).readLine()
    println(withCONSOLE)
}