# Практическая работа №5 — Java

**Тема:** Дженерики и обобщённое программирование. Структуры данных. Стек. Клонирование.

В проекте решены **все 8 подпунктов**, приведённых в документе: 4 по обобщениям, 2 по обобщённому стеку, 2 по клонированию.

## Требования

JDK 8 или новее; внешние библиотеки не нужны.

## Запуск на Windows (CMD или терминал VS Code)

Из папки `Practice5_Java`:

```bat
mkdir out
javac -encoding UTF-8 -d out src\generics\*.java src\stacks\*.java src\cloning\*.java
java -cp out generics.GenericTasks
java -cp out stacks.StackTasks
java -cp out cloning.CloningTasks
```

Для `StackTasks` и `CloningTasks` после запуска введите пять слов через пробел, например: `один два три четыре пять`, и нажмите Enter. Программа выведет их в обратном порядке. Можно использовать латинские слова, если консоль Windows некорректно отображает кириллицу.

На Linux/macOS команды аналогичные, но используйте `/` вместо `\` в путях; или выполните `bash run.sh`.

## Что именно сделано

| Пункт в PDF | Решение | Основной файл |
| --- | --- | --- |
| Дженерики №1.1 | Удаление дубликатов из `ArrayList` с помощью `contains()` | `generics/GenericTasks.java` |
| Дженерики №1.2 | Линейный поиск индекса или `-1` | `generics/GenericTasks.java` |
| Дженерики №1.3 | Максимум в одномерном массиве по `compareTo()`, класс `Circle` | `generics/GenericTasks.java`, `Circle.java` |
| Дженерики №1.4 | Максимум в двумерном массиве по `compareTo()` | `generics/GenericTasks.java` |
| Дженерики №2.1 | `GenericStack` на массиве с удвоением ёмкости | `stacks/GenericStackArray.java` |
| Дженерики №2.2 | Стек через наследование от `ArrayList`, ввод и обратный вывод 5 строк | `stacks/GenericStackInheritance.java`, `StackTasks.java` |
| Клонирование №1.1 | `MyStack extends ArrayList`, ввод и обратный вывод 5 строк | `cloning/MyStack.java`, `CloningTasks.java` |
| Клонирование №1.2 | Клонирование отдельного списка, содержащегося в `MyStack` (композиция) | `cloning/MyStackComposition.java`, `CloningTasks.java` |

## UML: композиция и наследование

Композиция `GenericStackArray<E>` — стек **содержит** внутренний массив `Object[]`, управляет длиной и расширением. Для `MyStackComposition` связь с `ArrayList<Object>` — `has-a`:

```text
+--------------------------+       contains       +-------------------+
| MyStackComposition       | 1 ---------------- 1 | ArrayList<Object> |
|--------------------------|                      +-------------------+
| - list: ArrayList<Object>| 
| + isEmpty(): boolean     |
| + getSize(): int         |
| + peek(): Object         |
| + pop(): Object          |
| + push(Object): void     |
| + clone(): MyStackComposition |
+--------------------------+
```

Наследование `GenericStackInheritance<E>` — стек **является** `ArrayList<E>` (`is-a`):

```text
         +----------------+
         | ArrayList<E>   |
         +----------------+
                 ^
                 | extends
 +-------------------------------+
 | GenericStackInheritance<E>    |
 |-------------------------------|
 | + getSize(): int              |
 | + peek(): E                  |
 | + pop(): E                   |
 | + push(E): void              |
 +-------------------------------+
```

Для задания по клонированию `MyStack` также наследуется от `ArrayList<Object>`.

## Особенность глубокой копии

Формулировка последнего задания — сделать **глубокую копию поля списка**. `MyStackComposition.clone()` создаёт отдельный `ArrayList` вместо копирования его ссылки. Это значит, что операции добавления/удаления в копии не меняют оригинал. Элементы списка имеют тип `Object`: универсальное глубокое копирование **самих элементов** без дополнительных требований к их классам невозможно. При использовании неизменяемых строк (`String`) разницы нет. Если преподаватель требует также рекурсивно клонировать изменяемые объекты внутри списка, понадобится определить их тип и способ копирования.
