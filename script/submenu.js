$(function(){
    
 $('#componentssubmenu').hide();
 $('#simulationssubmenu').hide(); 
$("#componentsmenu").click(function(){
	$("#componentssubmenu").toggle(500, "linear");
  });
  
  $("#simulationsmenu").click(
  function(){
	$("#simulationssubmenu").toggle(500, "linear");
  });
});
