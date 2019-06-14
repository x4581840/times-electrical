
//初始化树形控件
function initTreeView() {
    var seqNo = $("#seqNo").val();
    if(seqNo == "" || seqNo == undefined || seqNo == null || $.trim(seqNo) == "" ) {
        $("#inputSeqNo").css("color", "red");
        $("#treeViewDiv").css("display", "none");
        $("#seqNo").val("");
        return;
    }
    $("#inputSeqNo").css("color", "#333");
    var defaultData;
    var nodeId_temp = null;
    var flag = $("#seqNo").val();
    $.ajax({
        type: "post",
        url: "/test/getTreeData?rnd=" + Math.random() + "&flag=" + flag,
        contentType: 'text/json,charset=utf-8',
        dataType: "json",
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
                    console.log("被勾选checked");
                    //debugger
                    //单选思路：利用临时变量。首次选择记录节点id。选择其他节点，unchecked此id节点；
                    if (nodeId_temp != null) {
                        console.log("有临时变量");
                        $('#treeview1').treeview('uncheckNode', [nodeId_temp, {slient: true}]);
                    }
                    nodeId_temp = data.nodeId;
                    //把选中的节点的text写进hidden中
                    $("#hiddenSeqNo").val(data.text);
                }
            });
            $("#treeViewDiv").css("display", "block");
        },
        error: function () {
            $("#treeViewDiv").css("display", "none");
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
    //把选中的物料编码写入输入框中
    $("#seqNo").val($("#hiddenSeqNo").val());
    //隐藏treeview控件
    $("#treeViewDiv").css("display", "none");
}

//修改——转换日期格式(时间戳转换为datetime格式)
function changeDateFormat(cellval) {
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
