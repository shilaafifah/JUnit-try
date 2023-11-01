package com.example.calculator

import org.junit.Test
// Mengimpor anotasi @Test dari kerangka pengujian JUnit untuk menandai kelas ini sebagai fungsi pengujian

import kotlin.test.assertEquals
// Mengimpor fungsi assertEquals dari kerangka pengujian Kotlin untuk membandingkan hasil pengujian dengan nilai yang diharapkan

class CalculatorTest {
    @Test
    fun testAddition() {
        // Mendefinisikan fungsi pengujian untuk method add() dari kelas Calculator
        val calculator = Calculator()
        // Variabel calculator digunakan untuk menyimpan objek dari kelas Calculator
        val result = calculator.add(5, 7)
        // Memanggil method add() dengan parameter 5 dan 7, dan menyimpan hasilnya pada variabel result
        assertEquals(12, result, "5 + 7 = 12")
        // Membandingkan hasil pengujian (result) dengan nilai yang diharapkan yaitu: 12, dg pesan kesalahan jika pengujian gagal
    }

    @Test
    fun testSubtraction() {
        // Mendefinisikan fungsi pengujian untuk method subtract() dari kelas Calculator
        val calculator = Calculator()
        // Variabel calculator digunakan untuk menyimpan objek dari kelas Calculator
        val result = calculator.subtract(4, 2)
        // Memanggil method subtract() dengan parameter 10 dan 4, dan menyimpan hasilnya pada variabel result
        assertEquals(2, result, "4 - 2 = 2")
        // Membandingkan hasil pengujian (result) dengan nilai yang diharapkan yaitu: 2 dg pesan kesalahan jika pengujian gagal
    }
}