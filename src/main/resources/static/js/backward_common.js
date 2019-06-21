
$(function () {
    //id选择器选中modal框
    $("#myModal").on('show.bs.modal', function () {
        console.log("show");
        $('#myModal').modal('hide');
    });

    $('#modal').on('hide.bs.modal', function () {
        // 执行一些动作...
    });
})


//初始化树形控件
function initTreeView() {
    // 把之前选中的放在隐藏框中的值清掉
    $("#hiddenSeqNo").val("");
    var seqNo = $("#seqNo").val();
    if(seqNo == "" || seqNo == undefined || seqNo == null || $.trim(seqNo) == "" ) {
        $("#inputSeqNo").css("color", "red");
        $("#seqNo").val("");
        return;
    }
    $("#inputSeqNo").css("color", "#333");
    var defaultData;
    var nodeId_temp = null;
    var sqn = $("#seqNo").val();
    $.ajax({
        type: "post",
        url: "/backward/getTreeData?rnd=" + Math.random() + "&sqn=" + sqn,
        contentType: 'text/json,charset=utf-8',
        dataType: "json",
        async: false,
        success: function (result) {
            defaultData=result;
            console.log("defaultData:"+defaultData[0].text);
            $('#treeview1').treeview({
                data: defaultData,
                showCheckbox: true, //展示checkedbox
                levels: 0, //设置初始化展开几级菜单 默认为2
                showTags: true,
                showBorder: false, //去掉控件的边框颜色
                //tagsClass: "badge",
                onNodeSelected:function(event, data) {
                    // 事件代码...
                    //console.log("被选中");
                },
                onNodeChecked: function(event, data) {
                    console.log("被勾选checked=nodeId_temp=="+nodeId_temp);
                    //debugger
                    //单选思路：利用临时变量。首次选择记录节点id。选择其他节点，unchecked此id节点；
                    if (nodeId_temp != null) {
                        console.log("有临时变量");
                        $('#treeview1').treeview('uncheckNode', [nodeId_temp, {slient: false}]);
                    }
                    nodeId_temp = data.nodeId;
                    //把选中的节点的text写进hidden中
                    $("#hiddenSeqNo").val(data.text);
                },
                onNodeUnchecked: function (event, data) {
                    console.log("取消checked=nodeId_temp="+nodeId_temp);
                    nodeId_temp = null;
                    $("#hiddenSeqNo").val("");
                }
            });
            // 只有输入了值，并且查到数据才打开弹框
            $("#myModal").modal({
                //remote:"test/test.jsp";//可以填写一个url，会调用jquery load方法加载数据
                //backdrop:"static";//指定一个静态背景，当用户点击背景处，modal界面不会消失
                keyboard:true//当按下esc键时，modal框消失
            });
        },
        error: function () {
            spop({
                template: '没有数据!',
                position  : 'top-center',
                style: 'error',
                autoclose: 3000
            });
        }
    });
}

//物料确认
function confirm() {
    if($("#hiddenSeqNo").val() == "" || $("#hiddenSeqNo").val() == null
        || $("#hiddenSeqNo").val() == undefined || $.trim($("#hiddenSeqNo").val()) == "") {
        spop({
            template: '请选择数据!',
            position  : 'top-center',
            style: 'message',
            autoclose: 1000
        });
        return;
    }
    //把选中的物料编码写入输入框中
    $("#seqNo").val($("#hiddenSeqNo").val());
    //隐藏treeview控件
    //$("#treeViewDiv").css("display", "none");
    //关闭弹框
    $("#myModal").modal('hide');
}

//修改——转换日期格式(时间戳转换为datetime格式)
function changeDateFormat(cellval) {
    if(cellval == 0) {
        return "";
    }
    if (cellval != null) {
        var date = new Date(parseInt(cellval));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hh24 = date.getHours();
        var mi = date.getMinutes();
        var ss = date.getSeconds();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hh24 + ":" + mi + ":" + ss ;
    }
}
