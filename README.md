# TestKotlin 
# This is a learning Demo of Kotlin, and I will update the code of Kotlin on a regular basis.

### Kotlin项目开发规范总结：

1. 返回模型中的字段除了数值型和Boolean以外，要用可空声明；对于数值型和Boolean的字段可以定为不可空类型，但是需要赋值，方便调用，如果接口不返回这个字段，则GSON不会解析，如果字段返回null，则得到的是声明的初始值；
2. 扩展函数和扩展属性不要滥用，用的巧妙可以省很多模板代码；
3. 工具类建议写成顶级函数，以文件为单位归类，不需要对外暴露的用private修饰，避免污染调用；
4. 建议用函数回调取代接口回调（可使用类型别名声明，方便使用lambda表达式）;
5. 少写重载方法，多用具名函数，函数在重写的时候注意形参的参数名要一致；
6. 只读变量可以使用标准委托的方式实例化，也可以自定义属性委托实现；
7. 对于对象的调用可以巧妙的利用run，let，apply等作用域函数；
8. 对于数据模型可以按照页面为单位进行归类，比如主页的请求参数和返回数据可以分别放在HomeReq.kt和HomeResp.kt中，可减少文件数量；
