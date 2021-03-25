// There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is start time of meeting i and 
// F[i] is finish time of meeting i.
// What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a 
// particular time? Also note start time of one chosen meeting can't be equal to the end time of the other chosen meeting.



import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Meeting().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}



class mycomparator implements Comparator<meeting> {
    @Override
    public int compare(meeting a, meeting b)
    {
        if(a.end>b.end)
        return 1;
        else if(a.end<b.end)
        return -1;
        else
        return 0;
    }
}

class meeting
{
    int start,end,pos;
    public meeting(int start,int end,int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}



class Meeting {
    public static int maxMeetings(int start[], int end[], int n) 
    {
        ArrayList<meeting> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(new meeting(start[i],end[i],i));
        }
        
        mycomparator mc = new mycomparator();
        
        Collections.sort(arr,mc);
        
        
        ArrayList<Integer> m = new ArrayList<>();
        m.add(arr.get(0).pos);
        int limit = arr.get(0).end;
        for(int i=1;i<n;i++)
        {
            if(arr.get(i).start>limit)
            {
                m.add(arr.get(i).pos);
                limit = arr.get(i).end;
            }
        }
        return m.size();
    }
}





