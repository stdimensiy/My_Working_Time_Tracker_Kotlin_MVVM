package com.vdvapp.myworkingtimetracker.domain

/**
 * Класс User - данные о сотруднике
 *
 * **[name]**         - Имя сотрудника
 * **[surname]**      - Фамилия сотрудник
 * **[patronymic]**   - Отчество сотрудника
 * **[position]**     - Должность
 * **[phoneNumber]**  - Телефонный номер
 */
data class User(
    val name: String = "",
    val surname: String = "",
    val patronymic: String = "",
    val position: String = "",
    val phoneNumber: String = "",

)
