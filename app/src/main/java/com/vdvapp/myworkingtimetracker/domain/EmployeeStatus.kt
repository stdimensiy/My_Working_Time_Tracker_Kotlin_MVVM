package com.vdvapp.myworkingtimetracker.domain

/**
 * Класс перечистений EmployeeStatus - набор состояний работника
 *
 * **[IS_WORKING]**   - Очень хорошо
 * **[IS_ABSENT]**    - Хорошо
 * **[IS_SICK]**      - Нормально
 * **[ON_VACATION]**  - Ниже среднего
 */
enum class EmployeeStatus {
    IS_WORKING,
    IS_ABSENT,
    IS_SICK,
    ON_VACATION
}