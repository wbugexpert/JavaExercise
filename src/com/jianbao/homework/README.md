# 功能包说明
***
***

> 本包的主要内容是老师布置的作业  
> 本包内，对于简单作业，不另外建子包，对于稍复杂函数（一个public类无法复现的情况）或者存在资源文件，会另外建子包，具体细节请看下文详细描述。

# 作业目录
***
***
### **基本类库**  

- 题目来源：课本P68 1.21.1
- 题目描述：
  - #### **字符串操作**
  - > 定义一个StringBuffer类对象，然后通过append()方法向对象中添加26个小写字母。要求每次只添加一个，共添加26次，然后逆序输出，并且可以删除前5个小写字母。
- 实现类：**StringBufferOperation**
- 运行结果：
```
zyxwvutsrqponmlkjihgfedcba
utsrqponmlkjihgfedcba

Process finished with exit code 0
```

- 题目来源：课本P69 1.21.6
- 题目描述：
    - #### **国际化程序**
    - > 编写程序，实现国际化程序，通过命令行输入国家的代号，例如，1表示中国，2表示美国。根据输入代号不同调用不同的资源文件来显示信息。
- 实现包：**programInternationalization**
- 主函数类：**ProgramInternationalization**
- 运行结果：
- 
    - *case1：*
```
1
选择：语言：简体中文 ， 国家：中国。
尖宝欢迎你
程序国际化
-------------------------

Process finished with exit code 0
```
-
    - *case2：*
```
2
Select:Language:English , Country:America
jianbao Welcome u
programInternationalization
-------------------------

Process finished with exit code 0
```
-
    - *case3：*
```
3
输入指令错误，无法识别指定国家地区，已自动选择系统默认地区。
尖宝欢迎你
程序国际化
-------------------------

Process finished with exit code 0
```

***
### **IO编程**

- 题目来源：课本P104 2.15.3
- 题目描述：
    - #### **输入数据排序**
    - > 从键盘输入数据“TOM:89|JERRY:90|TONY:95”，数据格式为“姓名：成绩|姓名：成绩|姓名：成绩”，对输入的内容按照成绩由高到低排序。
- 实现类：**DataSort**
- 运行结果：
```
TOM:89|JERRY:90|TONY:95
【NO.1】   TONY    95.00
【NO.2】   JERRY   90.00
【NO.3】   TOM     89.00

Process finished with exit code 0
```

- 题目来源：课本P104 2.15.4
- 题目描述：
    - #### **用户登录认证**
    - > 完成系统登录程序，可以通过初始化参数方式配置用户名和密码。如果用户没有输入用户名和密码，则提示输入用户名和密码；如果用户输入了用户名但是没有输入密码，则提示用户输入密码。判断用户名是否为jianbao，密码是否为jianbao，如是，则提示登陆成功；如不是，显示登陆失败信息。用户再次输入用户名和密码，连续3次输入错误后自动退出。
- 实现包：userLogin
- 主函数类：Client
- 运行结果：
-
    - *case1：* args[]={ jianbao,jianbao }
```
【SUCCESS】欢迎你，尖宝！

Process finished with exit code 0
```
-
    - *case2：* args[]={ jianbao }
```
请输入密码
jianbao
【SUCCESS】欢迎你，尖宝！

Process finished with exit code 0
```
-
    - *case3：* args[]={ jianbao }
```
请输入密码
adas
【ERROR】登陆失败，用户名和密码不匹配！
请输入密码
fsfd
【ERROR】登陆失败，用户名和密码不匹配！
请输入密码
sasss
【ERROR】登陆失败，用户名和密码不匹配！
Exception in thread "main" com.jianbao.homework.userLogin.exception.MaxTryCountException: 尝试次数超限，系统退出！
	at com.jianbao.homework.userLogin.main.LoginMain.<init>(LoginMain.java:23)
	at com.jianbao.homework.userLogin.Client.main(Client.java:17)

Process finished with exit code 1
```
-
    - *case4：* args[]={}
```
请输入用户名
jianbao
请输入密码
aaa
【ERROR】登陆失败，用户名和密码不匹配！
请输入用户名
jianbao
请输入密码
sssss
【ERROR】登陆失败，用户名和密码不匹配！
请输入用户名
jianbao
请输入密码
sssssaassas
【ERROR】登陆失败，用户名和密码不匹配！
Exception in thread "main" com.jianbao.homework.userLogin.exception.MaxTryCountException: 尝试次数超限，系统退出！
	at com.jianbao.homework.userLogin.main.LoginMain.<init>(LoginMain.java:23)
	at com.jianbao.homework.userLogin.Client.main(Client.java:17)

Process finished with exit code 1
```
-
    - *case5：* args[]={}
```
请输入用户名
jianbao
请输入密码
aaa
【ERROR】登陆失败，用户名和密码不匹配！
请输入用户名
jianbao
请输入密码
jianbao
【SUCCESS】欢迎你，尖宝！

Process finished with exit code 0
```
***
### **集合框架**

- 题目来源：课本P201 5.13.1
- 题目描述：
    - #### **类集序列化对象存储**
    - > 利用类集实现以下数据表结构的映射转换，并将转换后的对象信息保存在文件之中，要求实现如下查询功能：
      > - 可以根据一个用户找到该用户对应的所有角色,以及每一个角色对应的所有权限信息；
      > - 可以根据一个角色找到该角色下的所有权限，以及拥有此角色的全部用户信息；
      > - 可以根据一个权限找到具备此权限的所有用户信息。
      > - 【图片见课本P201】
- 实现类：**ClassSetSerializationStorage**
- 运行结果：
```

```

- 题目来源：课本P201 5.13.3
- 题目描述：
    - #### **学生成绩统计**
    - > 利用类集实现若干学生信息存储，除了保护学生的基本信息之外还要求保存学生的数学成绩、编程成绩、英语成绩，随后统计所有学生的总成绩以及每门课程的平均成绩。
- 实现类：**StudentsScoreStatistics**
- 运行结果：
```

```
***
### **数据库**

- 题目来源：课本P230 6.9.2
- 题目描述：
    - #### **数据表的CURD操作**
    - > 现在假设有图6-35所示的数据表，要求通过代码实现数据表的CURD操作。
      > ```
      > DROP DATABASE jianbao;
      > CREATE DATABASE jianbao CHARACTER SET UTF8;
      > CREATE TABLE user (
      >     uid    VARCHAR(50),
      >     name   VARCHAR(30),
      >     note   TEXT,
      >     CONSTRIANT pk_uid PRIMARY KEY (uid)
      > ) engine=INNODB;
      > ```
      > - 【图片6-35见课本P230】
- 实现类：**TableCurd**
- 运行结果：
```

```

- 题目来源：课本P230 6.9.3
- 题目描述：
    - #### **动态DDL操作**
    - > 定义一任意的简单Java类，并可以基于此简单的Java类的结构生成数据库创建脚本。
- 实现类：**DynamicDDL**
- 运行结果：
```

```
***
***

# 补充说明
> 本功能包目录下，“课程”代指本人大三上学期修的课程 软件开发基础（Java）  
>              “老师”代指课程的任教老师  
>              “作业”代指老师布置的作业  
>              “课本”是Java进阶开发实战--李兴华 马云涛编著 中国工信出版集团 人民邮电出版社


