# 功能包说明
***
***

> 本包的主要内容是课程课本的部分代码片段摘抄模仿  

# 目录
***
***
### **chapter1-Java常用类库**

- 题目来源：课本1.1.1 StringBuffer类 P2
- 题目描述：
    - #### **实现字符串连接**
    - > 实现StringBuffer类字符串连接、删除。
- 实现类：**StringBufferAppend**
- 运行结果：
```
0123456

0123456
789

56
789


Process finished with exit code 0
```

- 题目来源：课本1.1.1 StringBuffer类 P3
- 题目描述：
    - #### **StringBuffer拓展功能**
    - > 实现StringBuffer字符串的添加、删除、替换、反转。
- 实现类：**StringBufferOperation**
- 运行结果：
```
【原数据】托管平台：www.github.com
【数据删除】www.github.com
【数据替换】edum
【数据反转】mude

Process finished with exit code 0
```

- 题目来源：课本1.1.2 StringBuilder类 P3
- 题目描述：
    - #### **使用StringBuilder修改字符串**
    - > 实现StringBuilder类修改字符串。
- 实现类：**StringBuilder**
- 运行结果：
```
在线代码托管平台:www.github.com
www.github222.com
www.github222.com

Process finished with exit code 0
```

- 题目来源：课本1.1.3 CharSequence接口 P4
- 题目描述：
  - #### **字符串对象转换**
  - > 实现String和StringBuffer的双向转换。
- 实现类：**StringTypeChange**
- 运行结果：
```
【StringBuffer】尖宝爱你：www.jianbao.com
【String】尖宝爱你：WWW.JIANBAO.COM

Process finished with exit code 0
```

- 题目来源：课本1.2 AutoCloseable接口 P5
- 题目描述：
  - #### **自动释放资源**
  - > 实现模拟自动释放网络资源。
- 实现类：**AutoCloseable**
- 运行结果：
```
【连接】连接远程服务器，创建消息的发送通道...
【发送】托管平台：www.github.com
【关闭】网络消息发送完毕，断开服务器连接...

Process finished with exit code 0
```

- 题目来源：课本1.3 Runtime类 P7
- 题目描述：
  - #### **获取JVM内存信息**
  - > 实现获取当前JVM内存状态。
- 实现类：**GetJvmInfo**
- 运行结果：
```
MaxMemory = 1864368128
TotalMemory = 126877696
FreeMemory = 123515976

Process finished with exit code 0
```

- 题目来源：课本1.3 Runtime类 P7
- 题目描述：
  - #### **手动执行GC处理**
  - > 实现手动gc。
- 实现类：**ManualGc**
- 运行结果：
```
【1】垃圾产生后的内存信息：MaxMemory = 1864368128
【2】垃圾产生后的内存信息：TotalMemory = 224395264
【3】垃圾产生后的内存信息：FreeMemory = 54637592
【4】GC调用后的内存信息：MaxMemory = 1864368128
【5】GC调用的内存信息：TotalMemory = 268959744
【6】GC调用后的内存信息：FreeMemory = 232444536

Process finished with exit code 0
```

- 题目来源：课本1.4 System类 P9
- 题目描述：
  - #### **统计程序耗时**
  - > 实现统计程序耗时。
- 实现类：**TimeDiff**
- 运行结果：
```
本次程序耗时统计：1000ms

Process finished with exit code 0
```

- 题目来源：课本1.4 System类 P9
- 题目描述：
  - #### **手动停止程序运行**
  - > 实现手动停止程序运行，程序结束状态码=1。
- 实现类：**ExitStatus1**
- 运行结果：
```
【错误】本程序执行时需要传递初始化参数，否则无法运行！
【提示】可以按照如下方式运行： java 类名 参数1 参数2

Process finished with exit code 1
```

- 题目来源：课本1.5 Cleaner类 P10
- 题目描述：
  - #### **Cleaner实现对象回收**
  - > 用Cleaner实现对象回收。
- 实现类：**Cleaner**
- 运行结果：
```
写到一半发现java.lang.ref.Cleaner这个回收类是JDK9开始引入的，JDK8跑不了，抄一下代码。
```

- 题目来源：课本1.6 对象克隆 P12
- 题目描述：
  - #### **实现对象克隆**
  - > 实现对象克隆。
- 实现类：**ObjectClone**
- 运行结果：
```
【Emp - com.jianbao.codecopy.chapter1.Emp@1b6d3586】姓名： 尖宝  职位：学生
【Emp - com.jianbao.codecopy.chapter1.Emp@4554617c】姓名： 尖宝  职位：学生

Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P14
- 题目描述：
  - #### **使用Math进行计算**
  - > 实现基于Math类的数学运算。
- 实现类：**MathCalculate**
- 运行结果：
```
【绝对值】10.3
【最大值】20
【最小值】10
【正弦值】9.265358966049026E-5
【对数值】2.995732273553991

Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P14
- 题目描述：
  - #### **实现四舍五入**
  - > 实现基于Math类的四舍五入。
- 实现类：**MathRound**
- 运行结果：
```
【四舍五入】-10
【四舍五入】45
【四舍五入】16
【四舍五入】-11
【四舍五入】-10

Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P15
- 题目描述：
  - #### **生成随机数**
  - > 实现基于Random的随机数生成。
- 实现类：**RandomNumber**
- 运行结果：
```
18、91、60、7、56、9、40、96、76、1、
Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P16
- 题目描述：
  - #### **生成“36选7”彩票数据**
  - > 有一种“36选7”的彩票，购买者可以在36个数字中自行选择，也可以直接将数字生成交由机器完成，实现这一生成机制。
- 实现类：**RandomLotteryTicketNumber**
- 运行结果：
```
2、5、9、14、20、27、33、
Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P17
- 题目描述：
  - #### **BigInteger数学计算**
  - > 实现大数字（整型）的加减乘除。
- 实现类：**BigIntegerCalculate**
- 运行结果：
```
2、6、11、12、22、29、36、
Process finished with exit code 0
```

- 题目来源：课本1.7 数字操作类 P18
- 题目描述：
  - #### **BigDecimal数学计算**
  - > 实现大数字（浮点型）的加减乘除。
- 实现类：**BigDecimalCalculate**
- 运行结果：
```
【加法运算】8888888888888888888888888888888888888888.8887
【减法运算】-4444444444444444444444444444444444444444.4443
【乘法运算】14814814814814814814814814814814814814814814296296296296296296296296296296296296.29629630
【除法运算】3.00

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P20
- 题目描述：
  - #### **获取当前日期时间数据**
  - > 实现获取当前的日期和时间。
- 实现类：**GetCurrentDateAndTime**
- 运行结果：
```
Sat Nov 26 21:23:03 CST 2022

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P20
- 题目描述：
  - #### **Date实例与long类型数据转换**
  - > 实现Date实例与long类型数据的转换。
- 实现类：**Date2Long**
- 运行结果：
```
Sat Nov 26 21:24:43 CST 2022
Sat Nov 26 21:24:53 CST 2022
【两个日期之间所差的毫秒数】10001
【先后关系】AFTER：false
【先后关系】BEFORE：true

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P21
- 题目描述：
  - #### **获取当前日期时间**
  - > 基于Calendar实现获取当前日期时间。
- 实现类：**CalendarGetCurrentDateAndTime**
- 运行结果：
```
当前的日期时间:2022-11-26 21:26:12

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P22
- 题目描述：
  - #### **实现日期的精确计算**
  - > 实现日期的精确计算。
- 实现类：**DateCalculate**
- 运行结果：
```
30年6个月后的日期时间:2053-5-26 21:28:5

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P22
- 题目描述：
  - #### **找到8月的最后一天**
  - > 实现找到八月的最后一天。
- 实现类：**GetTheLastDayOfAugust**
- 运行结果：
```
日期时间:2022-8-31 21:29:44

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P23
- 题目描述：
  - #### **日期时间的格式化**
  - > 实现日期时间格式化。
- 实现类：**FormatDateAndTime**
- 运行结果：
```
2022-11-26 21:43:44.208

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P23
- 题目描述：
  - #### **字符串转为Date实例**
  - > 实现字符串转Date实例。
- 实现类：**String2Date**
- 运行结果：
```
Tue Jul 01 15:54:36 CST 1997

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P25
- 题目描述：
  - #### **获取当前日期时间**
  - > 使用LocalDate类获取当前日期时间。
- 实现类：**LocalDateGetCurrentDateAndTime**
- 运行结果：
```
【LocalDate实例化对象输出】2022-11-26
【LocalTime实例化对象输出】21:59:14.922
【LocalDateTime实例化对象输出】2022-11-26T21:59:14.922

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P25
- 题目描述：
  - #### **获取当前日期详情**
  - > 实现获取当前日期详情。
- 实现类：**GetDateAndTimeDetail**
- 运行结果：
```
【当前日期】2022-11-26
【获取星期几】6
【现在是一月中的第几周】4
【现在是一年中的第几周】48
【今天是一年中的第几天】330

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P26
- 题目描述：
  - #### **闰年判断**
  - > 实现特定日期的闰年判断。
- 实现类：**IsLeapYear**
- 运行结果：
```
【闰年判断】false
【获取星期几】TUESDAY

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P27
- 题目描述：
  - #### **多线程下的SimpleDateFormat对象实例**
  - > 实现多线程下的日期格式转换，若干线程共享同一对象实例，从而减少对象个数，提高程序性能。  
      但是由于SimpleDateFormat类没有提供数据同步处理，所以可能出现转换异常。
- 实现类：**SimpleDateFormatDateAndTime**
- 运行结果：
```
Exception in thread "SDF转换线程 - 5" Exception in thread "SDF转换线程 - 6" Exception in thread "SDF转换线程 - 0" Exception in thread "SDF转换线程 - 1" Exception in thread "SDF转换线程 - 2" Exception in thread "SDF转换线程 - 7" java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
java.lang.NumberFormatException: For input string: ".1119189999988819981998E.1119189999988819981998E44"
	at sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)
	at sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.lang.Double.parseDouble(Double.java:538)
	at java.text.DigitList.getDouble(DigitList.java:169)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2087)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.jianbao.codecopy.chapter1.SimpleDateFormatDateAndTime.lambda$main$0(SimpleDateFormatDateAndTime.java:16)
	at java.lang.Thread.run(Thread.java:750)
【SDF转换线程 - 9】Tue Feb 17 21:15:12 CST 1998
【SDF转换线程 - 8】Tue Feb 17 21:15:12 CST 1998
【SDF转换线程 - 3】Tue Feb 17 21:15:12 CST 1998
【SDF转换线程 - 4】Tue Feb 17 21:15:12 CST 1998

Process finished with exit code 0
```

- 题目来源：课本1.8 日期时间数据处理 P28
- 题目描述：
  - #### **通过LocalDateTime类实现并发转换**
  - > 实现多线程下并发的日期格式转换，若干线程共享同一对象实例，从而减少对象个数，提高程序性能。
- 实现类：**LocalDateTimeFormatDateAndTime**
- 运行结果：
```
【LDT转换线程 - 8】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 4】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 7】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 6】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 2】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 9】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 5】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 0】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 3】Sat Feb 14 21:12:22 CST 1998
【LDT转换线程 - 1】Sat Feb 14 21:12:22 CST 1998

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P29
- 题目描述：
  - #### **正则表达式判断**
  - > 判断字符串的组成是否符合正则表达式。
- 实现类：**RegexMatch**
- 运行结果：
```
true

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P31
- 题目描述：
  - #### **字符串替换操作**
  - > 给定一个字符串，保留字符串中的小写字母。
- 实现类：**StringReplace**
- 运行结果：
```
yasdasfsdasdkifidd

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P31
- 题目描述：
  - #### **字符串拆分**
  - > 实现字符串的分割。
- 实现类：**StringSplit**
- 运行结果：
```
我爱你
你真帅
大帅哥

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P32
- 题目描述：
  - #### **安全的数据类型转换**
  - > 实现字符串到Integer的安全转换。
- 实现类：**SafeTransformString2Int**
- 运行结果：
```
【字符串转数字】98899991

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P32
- 题目描述：
  - #### **正则匹配并实现日期或日期时间转换**
  - > 用正则表达式实现字符串和日期/日期时间的转换。
- 实现类：**DateRegex**
- 运行结果：
```
【字符串转日期】Mon Dec 12 00:00:00 CST 2022
【字符串转日期时间】Mon Dec 12 21:00:00 CST 2022

Process finished with exit code 0
```

- 题目来源：课本1.9 正则表达式 P33
- 题目描述：
  - #### **E-mail地址正则匹配**
  - > 判断一个字符串是否是一个E-mail地址。
- 实现类：**E_mailRegex**
- 运行结果：
```
true

Process finished with exit code 0
```

