$(document).ready(function(){
	$("#nav li").click(function(){
		var _this = $(this);
		$("li.selected").removeClass("selected");
		_this.addClass("selected");

		$(".left_select").fadeOut(100,function(){
			$(".left_select").removeClass("left_select");
			$($(".left_container").get(2-$("#nav li").index(_this))).fadeIn(100);
			$($(".left_container").get(2-$("#nav li").index(_this))).addClass("left_select");
		});
	});
})