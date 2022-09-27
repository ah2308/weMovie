const toggleBtn = document.querySelector('.navbar_toggleBtn');
const menu = document.querySelector('.navbar_menu');
const icons = document.querySelector('.navbar_icons');

toggleBtn.addEventListener('click', () => {
    menu.classList.toggle('active');
    icons.classList.toggle('active');
});

$(document).ready(function(){
    var $header = $('header');
    $(window).scroll(function(){
        if($(this).scrollTop() > 0){
            $header.addClass('sticky');
        }else{
            $header.removeClass('sticky');
        }
    })
});