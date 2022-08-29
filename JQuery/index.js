$("button").click(function(){
    $("h1").css("color","red");
})
$(document).keypress(function(e){
    $("h1").text(e.key)
})