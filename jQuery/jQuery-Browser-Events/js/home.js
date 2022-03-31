$(document).ready(function () {
    $('#akronInfoDiv, #minneapolisInfoDiv, #louisvilleInfoDiv').hide();
});

$("#akronButton").on("click", function() {
    $('#akronInfoDiv').show();
    $('#akronWeather').hide();
    
});

$("#akronWeatherButton").on("click", function(){
    $('#akronWeather').toggle("slow");
});

$("#minneapolisButton").on("click", function() {
    $('#minneapolisInfoDiv').show();
    $('#minneapolisWeather').hide();
    
});

$("#minneapolisWeatherButton").on("click", function(){
    $('#minneapolisWeather').toggle('slow');
});

$("#louisvilleButton").on("click", function() {
    $('#louisvilleInfoDiv').show();
    $('#louisvilleWeather').hide();
    
});

$("#louisvilleWeatherButton").on("click", function(){
    $('#louisvilleWeather').toggle('slow');
});

$('tr').hover(
    function() {
        $('th').css('background','AliceBlue');
        $(this).css('background','whitesmoke');
    },
    function() {
        $('th').css('background','AliceBlue');
        $(this).css('background',"white");
    });