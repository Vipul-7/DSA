// most profitable job

package Greedy_Algorithms.Greedy;

import java.util.*;


public class Job_Sequencing {
    static class job{
        int id ;
        int deadline;
        int profit ;

        public job(int i,int d,int p){
            id = i ;
            deadline =d ;
            profit = p ;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i = 0 ; i < jobInfo.length ;i++){
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit); // lamda function // sorted in descending order

        ArrayList<Integer> ans = new ArrayList<>();

        int time = 0;
        for(int i = 0 ; i < jobs.size();  i++){
            job curr = jobs.get(i) ;
            if(curr.deadline > time ){
              ans.add(curr.id);
              time++ ;
            }
        }

        System.out.println("maximum job - "+ ans.size());

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
