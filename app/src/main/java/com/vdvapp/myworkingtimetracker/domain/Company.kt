package com.vdvapp.myworkingtimetracker.domain
/**
 * Класс Company - компания
 *
 * **[name]**         - Краткое наименование компании
 * **[fullName]**     - Полное официальное наименование компании
 */
data class Company(
    val name: String = "",
    val fullName: String = ""
)
