/*
 TODO 025 基础语法 流程控制 分支执行 介绍

 TODO 026 基础语法 流程控制 分支执行 单分支

 TODO 027 基础语法 流程控制 分支执行 双分支

 TODO 028 基础语法 流程控制 分支执行 多分支
 */

package chapter03_condition;

public class Java02_FlowControl {
    public static void main(String[] args) {

        // TODO 流程控制 - 分支执行
        // 分支结构
        // TODO 1. 可选分支：单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        // 判断：条件表达式的结果是否为true，如果为true，那么执行分支逻辑，如果为false，继续执行
        // TODO 判断的语法使用if关键字，表示如果，在条件表达式前使用,如果结果为true，那么分支逻辑应该在后续的大括号种执行
//        int i = 20;
//        if (i == 10) {
//            System.out.println("分支");
//        }


        // TODO 2. 必选分支：双分支结构（二选一）
        //  语法上使用if ... else操作，这里的else就表示其他场合
//        int i = 20;
//        if ( i == 10 ) {
//            System.out.println("分支1");
//        } else {
//            System.out.println("分支2");
//        }

        // TODO 3. 多分支 : 多重判断
        //  if ... else if ... [else]
        int i = 30;
        if ( i == 10 ) {
            System.out.println("分支1");
        } else if (i == 20) {
            System.out.println("分支2");
        }
        else {
            System.out.println("分支3");
        }


        System.out.println("第三步");
    }
}
