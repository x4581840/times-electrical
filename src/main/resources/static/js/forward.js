
var $table1;
//初始化bootstrap-table的内容
function InitTable1 () {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = '/forward/parentSelectResult?rnd=' + Math.random();
    $table1 = $('#table1').bootstrapTable({
        url: queryUrl,                      //请求后台的URL（*）
        method: 'GET',                      //请求方式（*）
        //toolbar: '#toolbar',              //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
     /*   sortable:false,                     //是否启用排序*/
        //sortOrder: "asc",                   //排序方式
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
        pageSize: 10,                     //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        smartDisplay:false,
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
            var serach = $("#serach").val();
            var  from=$("#from").val();
            var  to=$("#to").val();
            var  fGzpmc= $("#hiddenValue").val();
            var temp = {
                pageSize: params.limit,                         //页面大小
                pageNo: (params.offset / params.limit) + 1,  //页码
                serachContext:serach,
                fromDate:from,
                toDate:to,
                fGzpmc:fGzpmc
               /* sort: params.sort,      //排序列名
                sortOrder: params.order //排位命令（desc，asc）*/
            };
            console.log("test=="+$("#dependOn").val());
            return temp;
        },
        columns: [{field: 'fGzpthwzbm', title: '故障物料编码', sortable: false, halign: 'center',align: 'center'},
                {field: 'fGzpmc', title: '故障物料名称', sortable: false, halign: 'center',align: 'center'},
                {field: 'fCxdl', title: '车型大类', sortable: false, halign: 'center',valign: 'middle',align: 'center'
                   },
                {field: 'fZccx', title: '车型', sortable: false, halign: 'center',valign: 'middle',align: 'center'
                },
                {field: 'fZyzrdw', title: '责任单位', sortable: false, halign: 'center',align: 'center'},
                {field: 'count', title: '物料发生故障频次', sortable: false, halign: 'center',align: 'center',
                    formatter: function(value, row, index) {
                       var fGzpthwzbm=row.fGzpthwzbm;
                       var fGzpmc=row.fGzpmc;
                       var fCxdl=row.fCxdl;
                       var fZccx=row.fZccx;
                       var fZyzrdw=row.fZyzrdw;
                       var actions = [];
                        /* actions.push('<input type="checkbox" name="inlineCheckbox1" style="width: 40px;" value="'+value+'" onclick="chooseOne(this)">'+'<span>'+value+'</span>');*/
                        actions.push('<a href="#" onclick="tab2_query_button(\''+fGzpthwzbm+'\',\''+fGzpmc+'\',\''+fCxdl+'\',\''+fZccx+'\',\''+fZyzrdw+'\')" data-toggle="modal" data-target="#myModal1">'+value+'</a>')
                        return actions.join('');
                    }
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

function tab1_query_button() {
    $("#table1").bootstrapTable('destroy');
    InitTable1();
}