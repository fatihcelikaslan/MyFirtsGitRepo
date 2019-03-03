package ccc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
  int year = 1979;
  LocalDate calendarYear = LocalDate.of(year, 1, 1);
  DayOfWeek firstDay = calendarYear.getDayOfWeek();
  int start = firstDay.ordinal(), start1 = 1, start2 = 1;
  int[] end = { 31, this.year % 100 != 0 ? this.year % 4 == 0 ? 29 : 28 : 28, 
      31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  static String[] days = new String[] { "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su" };
  String[] mons = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
  String[] daysMons = new String[12];
  public static void weekDays () {
    for (int j = 0; j < 7; j++) {
      System.out.print(days[j] + "\t");
    }
  }

  public static void main(String[] args) {
    Calendar c = new Calendar();
    int start2=c.start;
    System.out.println("\t\t\t\t-----------------Calendar " + c.year + "--------------------");
    for (int i = 0; i < 12; i=i+3) {
      c.daysMons[i] = "";
      System.out.print("-----------------------" + c.mons[i] + "------------------------\t\t\t");
      System.out.print("-----------------------" + c.mons[i+1] + "-----------------------\t\t\t");
      System.out.print("-----------------------" + c.mons[i+2] + "------------------------");
      System.out.println();
      weekDays();
      System.out.print("\t\t");
      weekDays();
      System.out.print("\t\t");
      weekDays();
      c.start=i==0?start2:((c.end[i-1]+start2)%7);
      int start1=((c.end[i]+c.start)%7);
      start2=((c.end[i+1]+start1)%7);
      for (int j=0;j<(c.end[i]+c.start)/7+2;j++) {
        String s1="";
        
        for (int j1=7*j;j1<7*j+7;j1++) {
          s1+=(j==0?(j1-c.start)<0?"\t":(j1-c.start+1)+"\t":((j1-c.start+1)<=c.end[i]?j1-c.start+1+"\t":"\t"));
        }
        
        
        
        String s2="";

        for (int j1=7*j;j1<7*j+7;j1++) {
          s2+=(j==0?(j1-start1)<0?"\t":(j1-start1+1)+"\t":(j1-start1+1<=c.end[i+1]?((j1-start1+1)+"\t"):"\t"));
        }

         
        
        String s3="";
        for (int j1=7*j;j1<7*j+7;j1++) {
          s3+=(j==0?(j1-start2)<0?"\t":(j1-start2+1)+"\t":(j1-start2+1<=c.end[i+2]?((j1-start2+1)+"\t"):"\t"));
        }
        System.out.print("\n"+s1);
        System.out.print("\t\t");
        System.out.print(s2);
        System.out.print("\t\t");
        System.out.print(s3);
      }
      System.out.println();
    }
  }
}