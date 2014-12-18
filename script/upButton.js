$(function(){
	if ($(window).scrollTop() > 100) {
			$('.upButton').fadeIn();
		} else {
			$('.upButton').hide();
		}
	$(window).scroll(function(){
		if ($(this).scrollTop() > 100) {
			$('.upButton').fadeIn();
		} else {
			$('.upButton').fadeOut();
		}
	});
		$(".upButton").click(
			function(){
				$("html, body").animate({ scrollTop: 0 }, 400);
				return false;
			});
		});