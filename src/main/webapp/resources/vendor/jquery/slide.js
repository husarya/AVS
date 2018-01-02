$(function () {
	
	
    $('.row').click(function () {
    	
    	$(this).parent().siblings().children().next().slideUp();
        $(this).next('div').slideToggle();

       
        return false;
    });
    
});
