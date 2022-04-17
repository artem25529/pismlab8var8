package com.expertsoft.beans;

import com.expertsoft.model.Operation;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "executor", eager = true)
public class NumbersExecutor {
    private double num1;
    private double num2;
    private String operation;
    private double res;

    public String calculate() {
        Operation operation = Operation.valueOf(this.operation);

        switch (operation) {
            case ADDITION:
                res = num1 + num2;
                break;
            case DIVISION:
                res = num1 / num2;
                break;
            case MULTIPLICATION:
                res = num1 * num2;
                break;
            case SUBTRACTION:
                res = num1 - num2;
                break;
            default:
                throw new RuntimeException("Unknown operation " + operation);
        }

        return "result";
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
