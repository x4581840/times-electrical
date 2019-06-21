laydate.render({
        elem: '#from',
        type: 'datetime',
        format:"yyyy-M-d HH:mm:ss",
        trigger: 'click'
    });

laydate.render({
    elem: '#to',
    type: 'datetime',
    format:"yyyy-M-d HH:mm:ss",
    trigger: 'click'
});
function getSearchValue() {
    var searchValue=$("#serach").val();
    $("#test").val(searchValue);
}
/*    function person(){
        var gg = $("#test").val();

        $.ajax({
            url:"/forward/getMaterialcode",
            method: "post",
            datatype:"json",
            data: {
                id:gg
            },
            success: function (jsonStr) {

                //状态判断
                if (jsonStr !=null) {

                    $('#table tr:gt(0)').remove();
                    var s="";
                    for (var i in jsonStr) {
                        s += "<tr><td style=\"width: 150px\"><label class=\"checkbox-inline\"><input type='checkbox' name='inlineCheckbox1' value='" +i+ "'onClick='chooseOne(this)'>" +i+ "</label></td>\n<td>" +i+ "</td></tr>"
                        ;

                    }
                    $('#table').append(s);
                    document.getElementById('aa').style.display = 'block';

                }else{
                    alert("修改失败");
                    window.location.reload();
                }
            }
        });



    }*/
function getValue1(obj) {

    var gg =document.getElementsByName("inlineCheckbox1");

    for(var i=0;i<gg.length;i++){
        if(gg[i].checked){
            $("#serach").val(gg[i].value);

        }
    }

}
function  reSetMessage() {
    $("#serach").val("");
    $("#from").val("");
    $("#to").val("");
    $("#hiddenValue").val("");
}
function chooseOne(obj,fGzpmc){

    var gg= document.getElementsByName("inlineCheckbox1");
    for(var i=0;i<gg.length;i++){
        if(gg[i]!=obj) {

            gg[i].checked = false;
        }
        else gg[i].checked = true;

        $("#hiddenValue").val(fGzpmc);

    }
}
jQuery(document).ready(function() {

    jQuery("#ccc input[type='checkbox']").click(function() {
        if (jQuery(this).attr("checked") == true) {
            jQuery("#ccc input[type='checkbox']").attr("checked", false);
            jQuery(this).attr("checked", true);
        }
    });
});
$(function() {
    $("#test1").click(function () {
        $("#from").datepicker("show");
    });
    $("#test2").click(function () {
        $("#to").datepicker("show");
    });
    /* $( "#from" ).datepicker({
         defaultDate: "+1w",
         changeMonth: true,
         numberOfMonths: 1,
         onClose: function( selectedDate ) {
             $( "#to" ).datepicker( "option", "minDate", selectedDate );
         }
     });*/
    /* $("#from").datepicker({//添加日期选择功能datetimepicker
         numberOfMonths:1,//显示几个月
         showButtonPanel:true,//是否显示按钮面板

         dateFormat: 'yy-mm-dd',//日期格式

         clearText:"清除",//清除日期的按钮名称
         closeText:"关闭",//关闭选择框的按钮名称
         yearSuffix: '年', //年的后缀
         currentText: '今天',
         changeYear:true,//通过select选择年
         //changeMonth:true,
         showMonthAfterYear:true,//是否把月放在年的后面
         yearRange : '-20:+0',
         // defaultDate:'2011-03-10',//默认日期
         //minDate:'2011-03-05',//最小日期
         // maxDate:'2011-03-20',//最大日期
         monthNames: ['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
         dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
         dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
         dayNamesMin: ['日','一','二','三','四','五','六'],
         // onSelect: function(selectedDate) {//选择日期后执行的操作
         //    alert(selectedDate);
         // }
         onSelect: function( startDate ) {
             var $startDate = $( "#from" );
             var $endDate = $('#to');
             var endDate = $endDate.datepicker( 'getDate' );
             if(endDate < startDate){
                 $endDate.datepicker('setDate', startDate - 3600*1000*24);
             }
             $endDate.datepicker( "option", "minDate", startDate );
         }
     });
     $( "#to" ).datepicker({
         /!*defaultDate: "+1w",
         changeMonth: true,
         numberOfMonths:1,
         onClose: function( selectedDate ) {
             $( "#from" ).datepicker( "option", "maxDate", selectedDate );
         }*!/
         numberOfMonths:1,//显示几个月
         showButtonPanel:true,//是否显示按钮面板
         dateFormat: 'yy-mm-dd',//日期格式
         clearText:"清除",//清除日期的按钮名称
         closeText:"关闭",//关闭选择框的按钮名称
         yearSuffix: '年', //年的后缀
         currentText: '今天',
         yearRange : '-20:+0',
         changeYear:true,//通过select选择年
         showMonthAfterYear:true,//是否把月放在年的后面
         // defaultDate:'2011-03-10',//默认日期
         //minDate:'2011-03-05',//最小日期
         //maxDate:'2011-03-20',//最大日期
         monthNames: ['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
         dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
         dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
         dayNamesMin: ['日','一','二','三','四','五','六'],
         //onSelect: function(selectedDate) {//选择日期后执行的操作
         //    alert(selectedDate);
         // }
         onSelect: function( endDate ) {
             var $startDate = $( "#from" );
             var $endDate = $('#to');
             var startDate = $startDate.datepicker( "getDate" );
             if(endDate < startDate){
                 $startDate.datepicker('setDate', startDate + 3600*1000*24);
             }
             $startDate.datepicker( "option", "maxDate", endDate );
         }
     });
     //点击今日  自动输入日期
     $.datepicker._gotoToday = function (id) {
         var target = $(id);
         var inst = this._getInst(target[0]);
         if (this._get(inst, 'gotoCurrent') && inst.currentDay) {
             inst.selectedDay = inst.currentDay;
             inst.drawMonth = inst.selectedMonth = inst.currentMonth;
             inst.drawYear = inst.selectedYear = inst.currentYear;
         }
         else {
             var date = new Date();
             inst.selectedDay = date.getDate();
             inst.drawMonth = inst.selectedMonth = date.getMonth();
             inst.drawYear = inst.selectedYear = date.getFullYear();
             this._setDateDatepicker(target, date);
             this._selectDate(id, this._getDateDatepicker(target));
         }
         this._notifyChange(inst);
         this._adjustDate(target);
     }*/
});
