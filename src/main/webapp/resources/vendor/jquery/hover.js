$(document).ready(function(){
		
		$('.hover').click(function(){
			$(this).addClass('flip');
		},function(){
			$(this).removeClass('flip');
		});
	});