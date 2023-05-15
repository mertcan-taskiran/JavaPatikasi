package PracticalWeek2.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int hireYearCalculation = 2021 - hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (salary > 1000){
            return salary*0.03;
        }else{
            return 0;
        }
    }

    double bonus(){
        if (workHours > 40){
            return (workHours-40)*30;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        if (hireYearCalculation < 5){
            return this.salary*0.05;
        } else if(hireYearCalculation > 9 && hireYearCalculation < 20) {
            return this.salary*0.1;
        } else if (hireYearCalculation > 19) {
            return this.salary*0.15;
        }
        return 0;
    }

    void toPrint(){
        System.out.println( "Adı\t:\t" + this.name
                           +"\nMaaşı\t:\t" + this.salary
                           +"\nÇalışma Saati\t:\t" + this.workHours
                           +"\nBaşlangıç Yılı\t:\t" + this.hireYear
                           +"\nVergi\t:\t" + tax()
                           +"\nBonus \t:\t" + bonus()
                           +"\nMaaş Artışı\t:\t" + raiseSalary()
                           +"\nVergi ve Bonuslar ile birlikte maaş\t:\t" + (this.salary+bonus()-tax())
                           +"\nToplam Maaş\t:\t" + (this.salary+bonus()+raiseSalary()-tax())
        );
    }



}

