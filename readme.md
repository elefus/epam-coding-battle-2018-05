# Описание
Проект с материалами, использовавшимися при поведение EPAM CodingBattle 12.05.2018

В качестве задания участникам предлагалось реализовать игру "Жизнь" наиболее эффективным, с точки зрения скорости исполнения, способом.

# Использование
1. Для выполнения задания следует реализовать интерфейс `com.epam.GameEnigne`. <br/>Класс-имплементация также должен находиться в пакете `com.epam`.
2. Сборка проекта, запуск тестов и подготовка бенчмарков осуществляется с использованием Maven: `mvn clean package`
3. Для прогона бенчмарков следует запустить сформированный jar-файл командой: `java -jar benchmarks.jar`
4. Результаты представляются в виде сводной таблицы, формируемой утилитой JMH.

# Environment
Для воспроизводимости результатов у всех участников замеры производительности выполнялись на стандартном рабочем ноутбуке HP ProBook 650 G3:
* Intel Core i5-7300U CPU @2.60GHz (4 core)
* 16GB RAM
* Windows10 64-bit, x64-based processor
* Java8_171

# Top scores

com.epam.benchmarks.Height1000_Width1000_Alive500000_Iterations500

|     Team    | Mode | Count |  Score | Error | Units |
|-------------|:----:|:-----:|:------:|:-----:|:-----:|
| Java++      | avgt |   30  |  0.086 | 0.002 |  s/op |
| Survivors   | avgt |   30  |  1.895 | 0.018 |  s/op |
| Sweet_life  | avgt |   30  |  3.145 | 0.125 |  s/op |
| Hello World | avgt |   30  | 15.726 | 2.324 |  s/op |

----

com.epam.benchmarks.Height10000_Width100_Alive500000_Iterations250

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Java++      | avgt |   30  | 0.154 | 0.001 |  s/op |
| Survivors   | avgt |   30  | 1.093 | 0.054 |  s/op |
| Sweet_life  | avgt |   30  | 1.624 | 0.024 |  s/op |
| Hello World | avgt |   30  | 7.592 | 1.225 |  s/op |

----

com.epam.benchmarks.Height100_Width10000_Alive500000_Iterations250

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Java++      | avgt |   30  | 0.142 | 0.002 |  s/op |
| Survivors   | avgt |   30  | 0.965 | 0.007 |  s/op |
| Sweet_life  | avgt |   30  | 1.890 | 0.057 |  s/op |
| Hello World | avgt |   30  | 7.582 | 1.373 |  s/op |

----

com.epam.benchmarks.Height1000_Width1000_Glider_Iterations1000

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Hello World | avgt |   30  | 0.008 | 0.001 |  s/op |
| Java++      | avgt |   30  | 0.167 | 0.002 |  s/op |
| Survivors   | avgt |   30  | 2.887 | 0.020 |  s/op |
| Sweet_life  | avgt |   30  | 5.244 | 0.177 |  s/op |

----

com.epam.benchmarks.Height9_Width11_Tumbler_Iterations5000

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Hello World | avgt |   30  | 0.051 | 0.007 | ms/op |
| Survivors   | avgt |   30  | 2.085 | 0.068 |  s/op |
| Java++      | avgt |   30  | 2.581 | 0.017 |  s/op |
| Sweet_life  | avgt |   30  |   SO  |   SO  |  s/op |

----

com.epam.benchmarks.Height11_Width18_Line_Iterations5000

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Hello World | avgt |   30  | 0.056 | 0.001 | ms/op |
| Survivors   | avgt |   30  | 2.000 | 0.021 |  s/op |
| Java++      | avgt |   30  | 2.459 | 0.016 |  s/op |
| Sweet_life  | avgt |   30  |   SO  |   SO  |  s/op |

----

com.epam.benchmarks.Height100_Width100_Alive5000_Iterations5000

|     Team    | Mode | Count | Score | Error | Units |
|-------------|:----:|:-----:|:-----:|:-----:|:-----:|
| Sweet_life  | avgt |   30  | 0.421 | 0.009 |  s/op | <- Unstable
| Hello World | avgt |   30  | 1.052 | 0.115 |  s/op |
| Survivors   | avgt |   30  | 2.223 | 0.123 |  s/op |
| Java++      | avgt |   30  | 2.514 | 0.021 |  s/op |
