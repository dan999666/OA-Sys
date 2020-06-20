
2020.6.9
要完成的功能点为 账户管理
查询账号、创建账号、删除账号、禁用账号
2020.6.11
关于以上功能的jsp页面需要重新依据功能点命名

salaryServlet
modify
主要的重点是jsp页面数据 
修改员工薪资数据
映射数据(依据请求获得的参数进行页面数据的填装，转发页面)、提交修改数据传入数据库
delete员工薪资数据
add员工薪资数据

薪资参数设置功能
需要对salary重新构建
weekendStandard weekendHour festivalStandard festival releaseStatus

2020.6.19
完成工资发放功能 对应salary表中新添加 releaseStatus属性 对应的是财务 对应的是update releaseStatus 为1
完成授权的功能点的dao service层方法 查询员工个人工资信息 查询部门员工信息
完善薪资参数的功能 添加薪资参数 新建一张表salary_standard表
部门管理中的合并部门功能 input 若干个应该合并部门的id 合并后部门的名字 

先搭建以上功能的前端页面 后写数据库部门 最后servlet页面转发

2020.6.20 已完成hr角色的功能点授权     完成部门经理的功能点、员工查询自己工资的功能点