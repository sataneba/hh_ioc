# hh_ioc
ioc homework

Запуск: mvn clean install exec:exec


context start
hot                             cold
spring xml           246 ops/s  spring xml          30 ms/op
spring annotation    156 ops/s  spring annotation   24 ms/op
spring java          210 ops/s  spring java         23 ms/op
guice               1524 ops/s  guice                6 ms/op

get bean
hot                                   cold
spring xml          19 064 578 ops/s  spring xml          0.014 ms/op
spring annotation   22 258 413 ops/s  spring annotation   0.014 ms/op
spring java         22 440 062 ops/s  spring java         0.013 ms/op
guice               14 427 208 ops/s  guice               0.020 ms/op



При запуске из eclipse указать путь до javac в
pom.xml -> <build> -> <plugins> -> <plugin> -> <configuration> -> <executable>
(для maven-compiler-plugin)
