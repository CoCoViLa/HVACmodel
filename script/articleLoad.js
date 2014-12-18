$(function() {
	$('nav a').click(
		function() {
			var url=$(this).attr('href');
			$('#content').load(url);
			return false;
		});
});