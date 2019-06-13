
var $table1;
//初始化bootstrap-table的内容
function InitTable1 () {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = '/backward/getList?rnd=' + Math.random();
    $table1 = $('#table1').bootstrapTable({
        url: queryUrl,                      //请求后台的URL（*）
        method: 'GET',                      //请求方式（*）
        //toolbar: '#toolbar',              //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        //sortable: true,                     //是否启用排序
        //sortOrder: "asc",                   //排序方式
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
        pageSize: 10,                     //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
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
                flag: 1
            };
            console.log("test=="+$("#dependOn").val());
            return temp;
        },
        columns: [{field: 'id', title: '产品序列号', sortable: true, halign: 'center'},
            {field: 'age', title: '父项位置号', sortable: true, halign: 'center'},
            {field: 'name', title: '组件产品序列号', sortable: true, halign: 'center'},
            {field: 'scoreSum', title: '组件物料编码', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '组件位置描述', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '组件位置号', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '车型编号', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '车号', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '车厢号', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '配属用户', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '修程修次', sortable: true, halign: 'center'},
            {field: 'scoreAvg', title: '制造企业', sortable: true, halign: 'center'},
            {field: 'birthDate', title: '上线日期', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }},
            {field: 'birthDate', title: '出厂日期', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }},
            {field: 'birthDate', title: '检修日期', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return changeDateFormat(value);
                }},
            {field: 'scoreAvg', title: '生产故障次数', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return '<a href="#">'+value+'</a>';
                }}, //超链接
            {field: 'scoreAvg', title: '现场故障记录', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return '<a href="#">'+value+'</a>';
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


// $(function(){
//     InitMainTable();
// });

function tab1_query_button() {
    //再次点击查询时把table对象信息销毁
    $("#table1").bootstrapTable('destroy');
    InitTable1();
}

$(function () {
    $("#componentLocSelect").select2({
        ajax:{
            url: '/backward/getSelectData',
            dataType: 'json',  //比较重要，没有的话返回json数据会无法识别，搜索失败
            data: function(param){
                console.log("======");
                return {
                    keyword: param.term,
                    searchType: 'public',
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
        placeholder: '请输入选择',
        minimumInputLength: 1, //至少要输入一个字符才能去查询
        maximumSelectionLength: 10,  //最多能够选择的个数
        allowClear: true,
        // tags: true
    });
})

