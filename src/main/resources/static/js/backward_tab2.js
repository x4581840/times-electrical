
var $table2;
//初始化bootstrap-table的内容
function InitTable2 (sqn) {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = '/backward/getProductDefectRecordList?rnd=' + Math.random();
    if(sqn != null && sqn != undefined && sqn != "" && $.trim(sqn) != "") {
        queryUrl = queryUrl + "&sqn=" + sqn;
    }
    console.log("queryUrl=="+queryUrl);
    $table2 = $('#table2').bootstrapTable({
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
            };
            console.log("test=="+$("#dependOn").val());
            return temp;
        },
        columns: [{field: 'sublotId', title: '产品序列号', sortable: true, halign: 'center'},
            {field: 'lotId', title: '订单号', sortable: true, halign: 'center'},
            /*{field: 'name', title: '工序', sortable: true, halign: 'center'},*/
            {field: 'defectType', title: '缺陷类型', sortable: true, halign: 'center'},
            {field: 'defectCode', title: '缺陷代码', sortable: true, halign: 'center'},
            {field: 'defectComment', title: '现象描述', sortable: true, halign: 'center'},
            {field: 'bomMatId', title: '缺陷物料编号', sortable: true, halign: 'center'},
            {field: 'locationNum', title: '缺陷物料位置', sortable: true, halign: 'center'},
            {field: 'matCmf1', title: '缺陷物料分类组', sortable: true, halign: 'center'},
            {field: 'seq', title: '缺陷物料序列号', sortable: true, halign: 'center'},
            {field: 'defCmf2', title: '缺陷物料数量', sortable: true, halign: 'center'},
            {field: 'zgys', title: '供应商序列号', sortable: true, halign: 'center'},
            {field: 'lifnr', title: '供应商代码', sortable: true, halign: 'center'},
            {field: 'mblnr', title: '物料凭证编号', sortable: true, halign: 'center'},
            {field: 'zsfsx', title: '是否筛选', sortable: true, halign: 'center'},
            {field: 'zsxdw', title: '筛选单位', sortable: true, halign: 'center'},
            {field: 'zsxrq_long', title: '筛选日期', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }},
            {field: 'zsxsj_long', title: '筛选时间', sortable: true, halign: 'center',formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }},
            {field: 'zsxbb', title: '采用筛选方案版本', sortable: true, halign: 'center'},
            {field: 'zsxjg', title: '筛选结果', sortable: true, halign: 'center'},
        ],
        onLoadSuccess: function () {

        },
        onLoadError: function () {
            //showTips("数据加载失败！");
            console.log("数据加载失败！");
        }
    });
};

function backward_tab2_query_button(sqn) {
    //再次点击查询时把table对象信息销毁
    $("#table2").bootstrapTable('destroy');
    InitTable2(sqn);
}
