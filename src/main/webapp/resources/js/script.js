/**
 * 
 */

/*
 * $(function() { $(".test").on("mouseover", function(){
 * $(this).css("background-color","blue"); }).on("mouseout", function(){
 * $(this).css("background-color","white"); }); });
 * 
 * function AddBox(){ var div=$("<div></div>").addClass("test").text("Another
 * box"); $("#divTestArea1").append(div).css("background-color","blue"); }
 */

/*
 * function makeReq(){ makeRequest('test.html'); }
 * 
 * function makeRequest(url){ if(windows.XMLHttpRequest){ httpRequest= new
 * XMLHttpRequest(); }else if(window.ActiveXObject){ try{ httpRequest= new
 * ActiveXObject("Msxml2.XMLHTTP"); } catch(e){ try{ httpRequest= new
 * ActiveXObject("Microsoft.XMLHTTP"); } catch(e){} } } if(!httpRequest){
 * alert('Giving up: (Cannot create an XMLHTTP instance'); return false; }
 * httpRequest.onreadystatechange= alertContents; httpRequest.open('GET', url,
 * true); httpRequest.send(); } // 0- unopened, 1- opened, 2- headers_received,
 * 3- loading, 4- done
 * 
 * function alertContents(){ if(httpRequest.readyState === 4){
 * if(httpRequest.status === 200){ document.getElementById("div1").innerHTML=
 * httpRequest.responseText; }else{ alert('There was a problem with the
 * request.'); } } }
 */

/*
 * $(function() { $("#button1").click(function() { $.ajax({ type : "GET", url :
 * "test.html", success : function(data) { $("#div1").html(data); return false; },
 * error : function(xmlHttpReq, data, status) { $("#div1").html("<b>Error!!!</b>");
 * return false; } }) }); });
 */
/*
 * $(function() {
 * 
 * $(document).ajaxStart(function() { alert("from wait1");
 * $("#wait").css("display", "block"); });
 * 
 * $(document).ajaxComplete(function() { setTimeout(function() {
 * $("#wait").css("display", "none"); }, 3000); });
 * $("#button1").click(function() { $.getJSON("sample.json", function(data,
 * status) { alert("from getjson"); $("#div1").text(data.name);
 * 
 * });
 * 
 * }); $.noConflict(); });
 */
$(document).ready(function () {
        $(function(){
        	$("#btnclick").click(function(){
        		$("")//There im going to write logic to popup operation
        		$("divpopup").dialog({
        			title: "my jquery popup",
        			width: 430,
        			height: 200,
        			modal: true,
        			buttons: {
        				Close:
        					function(){
        						$(this).dialog('close');
        					}
        				}
        			});
        		});
        	});
        });
    



$(function ABC() {
	$("#button1").on("mouseover", function() {
		$("#button1").css("color", "blue");

	});
});

$(function alertColor() {
	$("#freeButtonHomePage").on("mouseover", function() {
		$("#freeButtonHomePage").css("color", "blue");
	});
});

/*
 * $(function(){ $("#leftSideImg4RunnerWhite").on("mouseover", function(){
 * //$("#leftSideImg4RunnerWhite").fadeTo(duration, opacity[3000,2]);
 * //$("#leftSideImg4RunnerWhite").append(div).css("background-color","blue"); $(
 * "#leftSideImg4RunnerWhite" ).click(function() { $( this ).fadeTo( "slow",
 * 0.33 ); }); }) });
 */

$(function clicksFrontPageImagesEvent() {
	$("#leftSideImg4RunnerWhite").click(function() {
		
//		$("#frontPage-image-dropdown").find("img").eq(0)
		$("#rightSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#topSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#FrontSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#addToCartImage").removeClass('hidden').addClass('show');
		$("#zoomImage").removeClass('hidden').addClass('show');
		var small={width: "300px",height: "300px"};
        var large={width: "1200px",height: "800px"};
        var count=1; 
        $("#leftSideImg4RunnerWhite").css(small).on('click',function () { 
            $(this).animate((count==1)?large:small);
            count = 1-count;
        });
        $("#addToCartImage").click(function(){
        	$("#addToCartImage").removeClass('show').addClass('hidden');
        	$("#div12").removeClass('hidden').addClass('show');
        	$("#div12").css("color","red");
        	$("#myPopupDialog").removeClass('hidden').addClass('show');
        });
        

	});
	$("#rightSideImg4RunnerWhite").click(function() {
		$("#leftSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#topSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#FrontSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#addToCartImage").removeClass('hidden').addClass('show');
		var small={width: "300px",height: "300px"};
        var large={width: "1200px",height: "800px"};
        var count=1; 
        $("#rightSideImg4RunnerWhite").css(small).on('click',function () { 
            $(this).animate((count==1)?large:small);
            count = 1-count;
        });
        $("#addToCartImage").click(function(){
        	$("#addToCartImage").removeClass('show').addClass('hidden');
        	$("#div12").removeClass('hidden').addClass('show');
        	$("#div12").css("color","red");
        	$("#myPopupDialog").removeClass('hidden').addClass('show');
        });

	});

	$("#topSideImg4RunnerWhite").click(function() {
		$("#leftSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#rightSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#FrontSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#addToCartImage").removeClass('hidden').addClass('show');
		var small={width: "300px",height: "300px"};
        var large={width: "1200px",height: "800px"};
        var count=1; 
        $("#topSideImg4RunnerWhite").css(small).on('click',function () { 
            $(this).animate((count==1)?large:small);
            count = 1-count;
        });
        $("#addToCartImage").click(function(){
        	$("#addToCartImage").removeClass('show').addClass('hidden');
        	$("#div12").removeClass('hidden').addClass('show');
        	$("#div12").css("color","red");
        	$("#myPopupDialog").removeClass('hidden').addClass('show');
        });

	});
	$("#FrontSideImg4RunnerWhite").click(function() {
		
		$("#leftSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#rightSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#topSideImg4RunnerWhite").removeClass('show').addClass('hidden');
		$("#addToCartImage").removeClass('hidden').addClass('show');
		var small={width: "300px",height: "300px"};
        var large={width: "1200px",height: "800px"};
        var count=1; 
        $("#FrontSideImg4RunnerWhite").css(small).on('click',function () { 
            $(this).animate((count==1)?large:small);
            count = 1-count;
            $("#FrontSideImg4RunnerWhite").animate({scrollTop: $("#FrontSideImg4RunnerWhite").offset().top});
        });
        $("#addToCartImage").click(function(){
        	$("#addToCartImage").removeClass('show').addClass('hidden');
        	$("#div12").removeClass('hidden').addClass('show');
        	$("#div12").css("color","red");
        	alert("from before myPopupDialog")
        	$("#myPopupDialog").removeClass('hidden').addClass('show');        	
        });
        $.import_js('resources/js/script.js');
        $.import_js('resources/js/script.js');
        $.import_js('resources/css/styles.css');
        
        $("#myPopupDialog").click(function(){
        	alert("myPopupDialog");
        	
        });
      
        
        
        
        
        
       
	});

//	$(document).ready(function () {
//        var small={width: "300px",height: "300px"};
//        var large={width: "1200px",height: "800px"};
//        var count=1; 
//        $("#rightSideImg4RunnerWhite").css(small).on('click',function () { 
//            $(this).animate((count==1)?large:small);
//            count = 1-count;
//        });
//    });;
});

// $(function(){
// $("#leftSideImg4RunnerWhite").click(function(){
//		
// $("#rightSideImg4RunnerWhite").css("class","hidden");
//		
// // $("#frontPage-image-dropdown").css("visibility", "hidden");
// // $("#div11").css("class","show");
// // $("#div11").append("<img id=\"addToCartImage\"
// src=\"http://simonhedley.com/wp-content/uploads/addtocart.jpg\"/>");
// // $("#addToCartImage").css("border","10px solid #fff");
// //
// // $("#div11").append("<img id='theImg1'
// src='http://fordduty.com/wp-content/uploads/2015/02/2016-toyota-4runner.jpg'/>");
// // $("#button1").css("color", "red");
// // $("#theImg1").css("border","10px solid #fff");
// //
//		
//
// });
//	
// $("#div11").on("mouseover", function(){
// alert("div11 mouseoveer");
// $("#div11").css("class","hidden");
// });
//	
// });

