package _19观察者模式;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company importCompany = new ImportCompany();
        Company exportCompany = new ExportCompany();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.change(10);
        rate.change(-20);
    }
}

interface Company {
    void response(int number);
}

abstract class Rate {
    protected List<Company> companies = new ArrayList<Company>();

    public void add(Company company) {
        companies.add(company);
    }

    public void remove(Company company) {
        companies.remove(company);
    }

    abstract void change(int number);
}

class RMBRate extends Rate {

    @Override
    void change(int number) {
        companies.forEach(company -> {
            company.response(number);
        });
    }
}

//具体观察者1：进口公司
class ImportCompany implements Company {
    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了进口产品成本，提升了进口公司利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }
}

//具体观察者2：出口公司
class ExportCompany implements Company {
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}