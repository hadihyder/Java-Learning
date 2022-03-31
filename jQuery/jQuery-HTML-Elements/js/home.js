$(document).ready(function () {
    $('h1').addClass('text-center');
    $('h2').addClass('text-center');
    $('h1').removeClass('myBannerHeading');
    $('h1').addClass('page-header');
    $('#yellowHeading').text("Yellow Team");
    $('#orangeTeamList').css({'background-color': 'orange'});
    $('#blueTeamList').css({'background-color': 'blue'});
    $('#redTeamList').css({'background-color': 'red'});
    $('#yellowTeamList').css({'background-color': 'yellow'});
    $('#yellowTeamList').append("<li>Joseph Banks</li><li>Simon Jones</li>");
    $('#oops').hide();
    $('#footerPlaceholder').remove();
    $('footer').addClass('#footerContactInformation').append("<p>Hadi Hyder - hyderhadi123@gmail.com</p>").css({'font':'Courier', 'height':24})
});