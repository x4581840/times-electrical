
var $table1;
//初始化bootstrap-table的内容
function InitTable1 (sqn, selectValueArray) {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = '/backward/getLoadConfigurationList?rnd=' + Math.random();
    if(sqn != null && sqn != undefined && sqn != "" && $.trim(sqn) != "") {
        queryUrl = queryUrl + "&sqn=" + sqn;
    }
    if(selectValueArray != undefined && selectValueArray != null && selectValueArray != "") {
        queryUrl = queryUrl + "&locChildList=" + selectValueArray;
    }
    $table1 = $('#table1').bootstrapTable({
        url: queryUrl,                      //请求后台的URL（*）
        method: 'GET',                      //请求方式（*）
        //toolbar: '#toolbar',              //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        ///*sortable: true,*/                     //是否启用排序
        //sortOrder: "asc",                   //排序方式
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
        pageSize: 100,                     //每页的记录行数（*）
        pageList: [100, 200, 500, 1000],        //可供选择的每页的行数（*）
        search: false,                      //是否显示表格搜索
        strictSearch: true,
        //showColumns: true,                  //是否显示所有的列（选择显示的列）
        //showRefresh: true,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        //clickToSelect: true,                //是否启用点击选中行
        //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
        showToggle: false,                   //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                  //是否显示父子表
        //得到查询的参数
        queryParams : function (params) {
            //这里的键的名字和控制器的变量名必须一致，这边改动，控制器也需要改成一样的
            var temp = {
                pageSize: params.limit,                         //页面大小
                pageNo: (params.offset / params.limit) + 1,   //页码
                //sort: params.sort,      //排序列名
                //sortOrder: params.order, //排位命令（desc，asc）
            };
            console.log("表格一");
            // console.log("test=="+$("#dependOn").val());
            return temp;
        },
        columns: [{field: 'sqn', title: '产品序列号', /*sortable: true,*/ halign: 'center'},
            {field: 'loc', title: '父项位置号', /*sortable: true,*/ halign: 'center'},
            {field: 'sqnChild', title: '组件产品序列号', /*sortable: true,*/ halign: 'center'},
            {field: 'itemnum', title: '组件物料编码', /*sortable: true,*/ halign: 'center'},
            {field: 'locdesc', title: '物料描述', /*sortable: true,*/ halign: 'center'},
            {field: 'locChild', title: '组件位置号', /*sortable: true,*/ halign: 'center'},
            {field: 'cmodel', title: '车型编号', /*sortable: true,*/ halign: 'center'},
            {field: 'carno', title: '车号', /*sortable: true,*/ halign: 'center'},
            {field: 'carriagenum', title: '车厢号', /*sortable: true,*/ halign: 'center'},
            {field: 'ownercustomer', title: '配属用户', /*sortable: true,*/ halign: 'center'},
            {field: 'repairprocess', title: '修程修次', /*sortable: true,*/ halign: 'center'},
            {field: 'maker', title: '制造企业', /*sortable: true,*/ halign: 'center'},
            {field: 'onlinetime', title: '上线日期', /*sortable: true,*/ halign: 'center'/*,formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }*/},
            {field: 'releasedate', title: '出厂日期', /*sortable: true,*/ halign: 'center'/*,formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }*/},
            {field: 'updatetime', title: '检修日期', /*sortable: true,*/ halign: 'center'/*,formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }*/},
            {field: 'countScgz', title: '生产故障次数', /*sortable: true,*/ halign: 'center',formatter: function (value, row, index) {
                    var sqnChild = row.sqnChild;
                    // 在方法内要传的值的前后加上&quot;，否则会报Uncaught ReferenceError: xxx is not defined
                    return '<a onclick="productDefectNumClick(&quot;'+sqnChild+'&quot;)">'+value+'</a>';
                }}, //超链接
            {field: 'countXcgz', title: '现场故障记录', /*sortable: true,*/ halign: 'center',formatter: function (value, row, index) {
                    var sqnChild = row.sqnChild;
                    return '<a onclick="sceneFaultNumClick(&quot;'+sqnChild+'&quot;)">'+value+'</a>';
                }}, //超链接
        ],
        onLoadSuccess: function () {

        },
        onLoadError: function () {
            // showTips("数据加载失败！");
            console.log("数据加载失败！");
        }
    });
};

//点击"生产故障次数"字段的值 触发的函数，跳到"生产缺陷记录"的tab
function productDefectNumClick(sqnChild) {
    $("#tab_1").removeClass("active");
    $("#tab1").removeClass("in").removeClass("active");
    $("#tab_2").addClass("active");
    $("#tab2").addClass("in").addClass("active");

    backward_tab2_query_button(sqnChild, 1);
}

//点击"现场故障记录"字段的值触发的函数，跳到"现场故障标签"的tab
function sceneFaultNumClick(sqnChild) {
    console.log("sqnChild==="+sqnChild);
    // debugger;
    $("#tab_1").removeClass("active");
    $("#tab1").removeClass("in").removeClass("active");
    $("#tab_3").addClass("active");
    $("#tab3").addClass("in").addClass("active");

    backward_tab3_query_button(sqnChild, 1);
}

// $(function(){
//     InitMainTable();
// });

function backward_tab1_query_button() {
    //再次点击查询时把table对象信息销毁
    $("#table1").bootstrapTable('destroy');
    //取 下拉框中选中的值
    var selectValueArray = getMultiSelectVal();
    var sqn = $("#seqNo").val();
    InitTable1(sqn, selectValueArray);
}

//多选取值
function getMultiSelectVal() {
    // var result = $.map($("#componentLocSelect").select2('data'), function(value) {
    //     return value.text;
    // });//.join(",");
    //$(".chosen option:selected").text(); 获取的多选值是拼接在一起的，没法区分开
    var result = $(".chosen option:selected").map(function () {
        return this.text;
    }).get();
    console.log("multiSelectVal:"+result);
    return result;
}

$(function () {
    /*$("#componentLocSelect").select2({
        ajax:{
            url: '/backward/getLocSelectData',
            dataType: 'json',  //比较重要，没有的话返回json数据会无法识别，搜索失败
            data: function(param){
                console.log("======"+$("#seqNo").val());
                return {
                    locChildLike: param.term,
                    sqn: $("#seqNo").val()
                    //searchType: 'public',
                    //page: param.page || 1
                }
            },
            processResults: function (data, params) {
                console.log("data==="+data);
                //params.page = params.page || 1;

                return {
                    results: data.results,
                    // pagination: {
                    //     more: (params.page * 10) < data.total_count
                    // }
                };
            },
            cache: true
        },
        language: 'zh-CN',
        width: '20%',
        placeholder: '物料描述查询',
        minimumInputLength: 1, //至少要输入一个字符才能去查询
        maximumSelectionLength: 10,  //最多能够选择的个数
        //allowClear: true,
        multiple: true, // 开启多选
        closeOnSelect: true,
        openOnEnter: true
    }).trigger("change");*/


    /*$(".selectpicker").selectpicker({
        noneSelectedText : '物料描述查询'    //默认显示内容
    });

    loadSelectdata();    //执行此函数，从后台获取数据，拼接成option标签，添加到select的里面

    //初始化刷新数据
    $(window).on('load', function() {
        $('.selectpicker').selectpicker('refresh');
    });*/


    $(".chosen").chosen({
        no_results_text: "没有找到结果！",//搜索无结果时显示的提示
        search_contains:true,   //关键字模糊搜索。设置为true，只要选项包含搜索词就会显示；设置为false，则要求从选项开头开始匹配
        allow_single_deselect:true, //单选下拉框是否允许取消选择。如果允许，选中选项会有一个x号可以删除选项
        width: '250px',
        // disable_search: false, //禁用搜索。设置为true，则无法搜索选项。
        // disable_search_threshold: 0, //当选项少等于于指定个数时禁用搜索。
        // inherit_select_classes: true, //是否继承原下拉框的样式类，此处设为继承
        // //placeholder_text_single: '选择国家', //单选选择框的默认提示信息，当选项为空时会显示。如果原下拉框设置了data-placeholder，会覆盖这里的值。
        // width: '400px', //设置chosen下拉框的宽度。即使原下拉框本身设置了宽度，也会被width覆盖。
        // max_shown_results: 1000, //下拉框最大显示选项数量
        // display_disabled_options: false,
        // single_backstroke_delete: false, //false表示按两次删除键才能删除选项，true表示按一次删除键即可删除
        // case_sensitive_search: false, //搜索大小写敏感。此处设为不敏感
        // group_search: false, //选项组是否可搜。此处搜索不可搜
        // include_group_label_in_selected: false //选中选项是否显示选项分组。false不显示，true显示。默认false。
    });

    jQuery.ajax({
            url: '/backward/getLocSelectData',//这个url用来获取所有数据l
            dataType: "json",
            success: function (data) {
            var html ='';
            //jQuery(".chosen").chosen({maxHeight: 200});
            for (var i = 0; i < data.results.length; i++) {
                /*html+='<option value="'+result[i].id+'">'+result[i].name+'</option>'*/
                html+='<option value="'+data.results[i].id+'">'+data.results[i].text+'</option>'
            }
            jQuery(".chosen").append(html);
            $('.chosen').trigger('chosen:updated');
        }
    });


    //data-init：设置列表初始被选中的项目，传递值为keyField对应的内容
    /*$('#componentLocSelect').bComboSelect({
        showField : 'text', //设置下拉列表中显示文本的列
        keyField : 'text', //设置下拉列表项目中项目的KEY值，用于提交表单
        data : '/backward/getLocSelectData', //数据源，可以是JSON数据格式，也可以是URL
        params : function(){
            //return {'name':'aa','sex':1};
            console.log("params");
        },
        //格式化显示项目，提供源数据进行使用
        formatItem : function(data){
            return data.text;
        },
        //启用多选模式
        multiple : true,
        callback : function(data){
            //$('#callbackLog').append(data.desc + '(' + data.name + ')');
            console.log("call back data="+data)
        }
    });*/
});

function loadSelectdata(){
    $.ajax({
        url : "/backward/getLocSelectData",    //后台controller中的请求路径
        type : 'GET',
        async : false,
        datatype : 'json',
        success : function(data) {
            if(data.results){
                var parknames =[];
                for(var i=0,len=data.results.length;i<len;i++){
                    var parkdata = data.results[i];
                    //拼接成多个<option><option/>
                    parknames.push('<option value="'+parkdata.id+'">'+parkdata.text+'</option>')
                }
                $("#componentLocSelect").html(parknames.join(' '));    //根据parkID(根据你自己的ID写)填充到select标签中
            }
        },
        error : function() {
            alert('查询停车场名称出错');
        }
    });
}

