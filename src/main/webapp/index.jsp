<html>
<body>

<h2>Hello World!</h2>
<script>
    $(function () {
        var json = {username:"张三丰",gender:"男"};
        $.ajax({
            url:"/login/tk3",   // 请求路径
            type:"post",            // 请求的方式，不区分大小写
            cache:false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
            contentType:"application/json",
            data:JSON.stringify(json),
            datatype:"json",        // 返回类型，text文本、html页面、json数据
            success:function(response){
                console.log("返回: " + response);
                console.log("数据: " + JSON.stringify(response));
            },
            error:function(response){
                console.log("出错返回: " + response);
                console.log("出错数据: " + JSON.stringify(response));
            }
        });
    });

</script>
</body>
</html>
