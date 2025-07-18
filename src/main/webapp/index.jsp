<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Space station</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<div class="wrapper">
<h1><%= "Space station" %></h1>
<div class="startDivSize">
    <p class="gameDescription">Станция "Надежда" была создана содружеством инопланетных рас на нейтральной территории,
        с целью примерить некогда враждующие колонии Людей, Протосов и Зергов. Однако, спустя неделю после запуска,
        связь с станцией была потеряна. Представители трех рас отрицают причастность к происходящему. И каждая колония
        снарядила самостоятельную миссию по расследованию инцидента. Вам предстоит провести расследование, возглавив
        одну из миссий...
    </p>
</div>
<div class="startGameMenu">
    <h3><%= "Для начала игры вам нужно выбрать расу персонажа и его имя"%></h3>
    <div class="radio-container">
    <input type="radio" id="human" name="race" value="human"><label for="human">Human</label><br />
    <input type="radio" id="protos" name="race" value="protos" disabled><label for="protos">Protos</label><br />
    <input type="radio" id="zerg" name="race" value="zerg" disabled><label for="zerg">Zerg</label><br />
    </div>
    <input placeholder="Имя"><button class="nameButton" type="submit">Ввести имя</button><br />
    <button onclick="window.location.href='start-game'">Старт игры</button>
</div>
</div>
<script>
    window.onload = function() {
        var startDivSize = document.querySelector('.startDivSize');
        var startGameMenu = document.querySelector('.startGameMenu');

        setTimeout(function() {
            startDivSize.classList.add('fadeInUp');

            setTimeout(function() {
                startGameMenu.classList.add('fadeInUp');
            }, 1000);
        }, 100);
    };
</script>
</body>
</html>