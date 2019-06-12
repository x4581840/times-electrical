
var $table2;
//初始化bootstrap-table的内容
function InitTable2() {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = '/forward/getList?rnd=' + Math.random();
    $table2= $('#table2').bootstrapTable({
        url: queryUrl,                      //请求后台的URL（*）
        method: 'GET',                      //请求方式（*）
        //toolbar: '#toolbar',              //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        //sortable: true,                     //是否启用排序
        //sortOrder: "asc",                   //排序方式
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
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
                rows: params.limit,                         //页面大小
                page: (params.offset / params.limit) + 1,   //页码
                sort: params.sort,      //排序列名
                sortOrder: params.order //排位命令（desc，asc）
            };
            console.log("test=="+$("#dependOn").val());
            return temp;
        },
            columns: [{field: 'id', title: '故障物料编码22', sortable: true, halign: 'center',align: 'center'},
                {field: 'age', title: '故障物料名称', sortable: true, halign: 'center',align: 'center'},
                {field: 'name', title: '车型大类', sortable: true, halign: 'center',valign: 'middle',align: 'center'
                },
                {field: 'scoreSum', title: '车型', sortable: true, halign: 'center',align: 'center'},
                {field: 'scoreAvg', title: '物料发生故障频次', sortable: true, halign: 'center',align: 'center'


                }],
        onLoadSuccess: function () {

        },
        onLoadError: function () {
            showTips("数据加载失败！");
        }
    });
};

// $(function(){
//     InitMainTable();
// });

function tab2_query_button() {

    var target= document.getElementById("tab1");
    var search= document.getElementById("search1");
    search.style.borderBottom="none";
    search.style.borderRight="none";
    search.style.borderLeft="none";

    target.style.display="none";
    InitTable2();
}