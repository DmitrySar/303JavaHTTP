## Задание
- Загрузите страницу "https://www.timeserver.ru/cities/ru/saransk"
- Найдите в тескте страницы информацию о текущем времени
- Выведите в консоль время в виде: чч:мм:сс
- Для создания диаграммы классов используйте http://www.plantuml.com/plantuml/uml/
## Дополнительное задание
- вычислите время анализа страницы, выведите значение в мс в консоль

> подсказки:  
> Для чтения страницы использовать класс ***Scanner*** из пакета ***java.util***  
> ***Фрагмент кода:***
> ```java
> public String getHTML() throws IOException {
>     return new Scanner(new URL(url).openStream(), codePage).useDelimiter("\\A").next();
> }
> ```  
> ***Для определения времени выполнения использовать метод currentTimeMillis():***  
> ```java
> ...
>     long startTime = System.currentTimeMillis();
> ...
> ```
