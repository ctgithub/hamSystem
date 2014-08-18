$(document).ready(function(){
   $(".exhave").click(function(){
  if($(this).attr("value")=="1"){
   $(".expose").show();
  }else{
   $(".expose").hide();
  }
});
   $(".allergy").click(function(){
		if($(this).attr("value")=="1"){
		$(".tallergy").show();
		}else{
			$(".tallergy").hide();
			}
			})
     $(".genetic").click(function(){
		if($(this).attr("value")=="1"){
		$(".tgene").show();
		}else{
			$(".tgene").hide();
			}
			})
$(".mz").change(function(){
		if($(this).find("option:selected").val()=="1"){
			$(".tfew").show();
			}else{
				$(".tfew").hide();}});
$(".payother").click(function(){
	$(".payo").show();})
$(".badc").click(function(){
	$(".badcan").show();})
$(".ots").click(function(){
	$(".otsick").show();})
$(".pros").click(function(){
	$(".prosick").show();})
$(".badc1").click(function(){
	$(".badcan1").show();})
$(".ots1").click(function(){
	$(".otsick1").show();})
$(".pros1").click(function(){
	$(".prosick1").show();})
$(".badc2").click(function(){
	$(".badcan2").show();})
$(".ots2").click(function(){
	$(".otsick2").show();})
$(".pros2").click(function(){
	$(".prosick2").show();})
$(".badc3").click(function(){
	$(".badcan3").show();})
$(".ots3").click(function(){
	$(".otsick3").show();})
$(".pros3").click(function(){
	$(".prosick3").show();})
$(".badc4").click(function(){
	$(".badcan4").show();})
$(".ots4").click(function(){
	$(".otsick4").show();})
$(".pros4").click(function(){
	$(".prosick4").show();})
$(".otdis").click(function(){
	$(".otdisabled").show();})
//ÃÌº” ‰—™±Ìµ•
 var i=2;
       $(function(){
   $(".addblood").click(function(){
             var ss = $(".blood_1").clone();
             ss.attr("class","blood_"+i);
             ss.find("input[type='radio']").attr("name","radio_"+i);
             $(".blood_1 input[type=radio]").each(function(i){
              var sel=$(this).attr("checked");
              ss.find("input[type='radio']").eq(i).attr("checked",sel);
             });
             $(".blood_1").after(ss);
             i++;
         });       
      });
	    $(function(){
   $(".addbloo").click(function(){
             var ss = $(".bloo_1").clone();
             ss.attr("class","bloo_"+i);
             ss.find("input[type='radio']").attr("name","radio_"+i);
             $(".bloo_1 input[type=radio]").each(function(i){
              var sel=$(this).attr("checked");
              ss.find("input[type='radio']").eq(i).attr("checked",sel);
             });
             $(".bloo_1").after(ss);
             i++;
         });       
      });
		$(function(){
   $(".addblo").click(function(){
             var ss = $(".blo_1").clone();
             ss.attr("class","blo_"+i);
             ss.find("input[type='radio']").attr("name","radio_"+i);
             $(".blo_1 input[type=radio]").each(function(i){
              var sel=$(this).attr("checked");
              ss.find("input[type='radio']").eq(i).attr("checked",sel);
             });
             $(".blo_1").after(ss);
             i++;
         });       
      });
   $(".rblood").click(function(){
		if($(this).attr("value")=="1"){
		$(".tblood").show();
		}else{
			$(".tblood").hide();
			}
			})
   $(".rbloo").click(function(){
		if($(this).attr("value")=="1"){
		$(".tbloo").show();
		}else{
			$(".tbloo").hide();
			}
			})
   $(".rblo").click(function(){
		if($(this).attr("value")=="1"){
		$(".tblo").show();
		}else{
			$(".tblo").hide();
			}
			})
   Calendar.setup({ 
trigger : "calendar-trigger", 
inputField : "calendar-inputField", 
onSelect : function(){this.hide()} 
}); 
   Calendar.setup({ 
trigger : "calendar-trigger1", 
inputField : "calendar-inputField1", 
onSelect : function(){this.hide()} 
}); 
   Calendar.setup({ 
trigger : "calendar-trigger2", 
inputField : "calendar-inputField2", 
onSelect : function(){this.hide()} 
}); 
   Calendar.setup({ 
trigger : "calendar-trigger3", 
inputField : "calendar-inputField3", 
onSelect : function(){this.hide()} 
}); 
   Calendar.setup({ 
trigger : "calendar-trigger4", 
inputField : "calendar-inputField4", 
onSelect : function(){this.hide()} 
}); 
  
   Calendar.setup({ 
trigger : "calendar-trigger5", 
inputField : "calendar-inputField5", 
onSelect : function(){this.hide()} 
}); 

   });