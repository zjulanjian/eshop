﻿//调用mock方法模拟数据
Mock.mock(
    'http://mockjs', {
        "userName" : '@name',     //模拟名称
        "age|1-100":100,          //模拟年龄(1-100)
        "color"    : "@color",    //模拟色值
        "date"     : "@date('yyyy-MM-dd')",  //模拟时间
        "url"      : "@url()",     //模拟url
        "content"  : "@cparagraph()" //模拟文本
    }
);