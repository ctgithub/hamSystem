	function showResult() {
	/*	showResultDiv(true);
		window.setTimeout("showResultDiv(false);", 3000);*/
		//document.getElementById("addForm").submit();
		alert('进入');
		
	}

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

 var i=2;
 var rowCount=2;
 var rowBloodCount=1;
 function delRow(rowIndex){  
	    $("#option"+rowIndex).remove();  
	};
	function eachBlo(){
		var num=0;
		   $(".blo-reason").each(function(){
			   var value="txBlood"+num;
			   $(this).attr("name",value);
			   num++;
		   });
	}
 //输血添加按钮
       $(function(){
   $(".addblood").click(function(){
	   
	   var newRow='<tr id="option'+rowBloodCount+'"><td class="oz-form-topLabel">输血'+rowBloodCount+'：</td><td><input type="text" name="txBlood" class="blo-reason" style="width:300px"></td></tr>'; 
	   $(".blood_1").append(newRow);
	   rowBloodCount++;
	   eachBlo();
		
	   /*
	   var newRow='<tr id="option'+rowBloodCount+'"><td class="oz-form-topLabel">输血'+rowBloodCount+'：</td><td class="oz-property" ><input type="text" name="txBlood'+rowBloodCount+'" style="width:300px"></td><td><a href="#" onclick=delRow('+rowBloodCount+')>删除</a></td></tr>';   
		 $(".blood_1").after(newRow);
		 var x='txBlood'+rowBloodCount;
	   		var dateT=$("input[name=txBlood2]").val();
	   		$.post(
	   				//url
				"archive_test.action",
					//数据传输
				{"dateT":dateT},
				//返回值方法
				function(){
					alert('传送回来成功');
					
				}
			);	
		 rowBloodCount++; 
         */

	   }); 
/*   $(".form-save").click(function(){
		  var myform=$("#all-form").serialize();
		  $.post("archive_test.action",myform);
	   });*/
   		
   
      });
       
 //外伤添加按钮
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
  //手术添加按钮
		$(function(){
   $(".addblo").click(function(){
	   		
             var ss = $(".blo_1").clone();
             ss.attr("class","blo_"+i);
             ss.find(input[type='text']).attr("name","shoushuText"+i);
             ss.find("input[type='radio']").attr("name","radio_"+i);
             $(".blo_1 input[type=radio]").each(function(i){
              var sel=$(this).attr("checked");
              ss.find("input[type='radio']").eq(i).attr("checked",sel);
             });
             $(".blo_1").after(ss);
             i++;
         });       
      });
	//输血有无判断	  
   $(".rblood").click(function(){
		if($(this).attr("value")=="1"){
		$(".tblood").show();
		$(".addblood").show();
		} else {
			$(".tblood").hide();
			$(".addblood").hide();
			while (rowBloodCount >=1) {
				delRow(rowBloodCount);
				rowBloodCount--;
				}
			rowBloodCount=1;
		}
	})
	//外伤有无
   $(".rbloo").click(function(){
		if($(this).attr("value")=="1"){
		$(".tbloo").show();
		}else{
			$(".tbloo").hide();
			}
			})
	//手术有无
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