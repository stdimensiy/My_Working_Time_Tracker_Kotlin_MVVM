package com.vdvapp.myworkingtimetracker.domain
/**
 * Класс перечистений QualityAssessment - набор критериев качества
 *
 * **[VERY_WELL]**        - Очень хорошо
 * **[WELL]**             - Хорошо
 * **[FINE]**             - Нормально
 * **[IS_BELOW_AVERAGE]** - Ниже среднего
 * **[BAD]**              - Плохо
 * **[VERY_BAD]**         - Очень плохо
 * **[NOT_ASSESSMENT]**   - Оценка отсутствует
 */
enum class QualityAssessment(val assessment: Int) {
    VERY_WELL(6),
    WELL(5),
    FINE(4),
    IS_BELOW_AVERAGE(3),
    BAD(2),
    VERY_BAD(1),
    NOT_ASSESSMENT(0)
}