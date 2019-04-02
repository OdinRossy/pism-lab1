<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>lab1.jsp</title>
        <link type="text/css" rel="stylesheet" href="style/main.css">
        <link rel="shortcut icon" href="assets/ac.png" type="image/x-icon">
    </head>
    <body>
        <div class="container">
            <div class="title">
                <h1>Лабораторная работа №1</h1>
            </div>
            <h3>Вариант 19:</h3>
            <p>
                Создать сервлет и взаимодействующие с ним пакеты Java классов и html-документов, выполняющие следующие
                действия:<br>Вводится n-ное количество чисел, подсчитать и вывести количество чисел имеюших и не имеющих
                дробную часть, общее количество чисел, первое и последнее число. Предусмотреть обработку всех
                исключительных ситуаций.
            </p>
            <hr>
            <p>
                <%=request.getAttribute("message")%>
            </p>
        </div>
        <script src="script/lab1.js"></script>
    </body>
</html>
