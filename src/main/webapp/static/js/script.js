// function to animate body background
$(document).ready(function(){
    $('body').css('background-color', '#f39c12');
    $('body').animate({
        backgroundColor: '#00a65a'
    }, 2000);
});

// function make elements bounce when inactive
$(document).ready(function(){
    $('a').each(function(){
        $(this).click(function(){
            $(this).toggleClass('animated bounceInDown');
        });
    });
});

