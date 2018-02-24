# hh_ioc
Дз по бенчмаркам
### Запуск
```
mvn clean install exec:exec
```
### Результаты
**Context start**
| hot | ops/s | | cold | ms/op |
| ------ | ------ | ------ | ------ | ------ |
| Spring xml | 246 | | Spring xml | 30 |
| Spring annotation | 156 | | Spring annotation | 24 |
| Spring java | 210 | | Spring java | 23 |
| Guice | 1524 | | Guice | 6 |

**Get bean**
| hot | ops/s | | cold | ms/op |
| ------ | ------ | ------ | ------ | ------ |
| Spring xml | 19 064 578 | | Spring xml | 0.014 |
| Spring annotation | 22 258 413 | | Spring annotation | 0.014 |
| Spring java | 22 440 062 | | Spring java | 0.013 |
| Guice | 14 427 208 | | Guice | 0.020 |
