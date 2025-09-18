class student 
{
    int rollnum;
    String name;
    int marks;

}
public class tut23 {
    public static void main (String a[]){

        student s1=new student();
        s1.rollnum=25;
        s1.name="prince";
        s1.marks=81;

        student s2=new student ();
        s2.name="saurabh ";
        s2.rollnum=2;
        s2.marks=84;

        student s3=new student ();
        s3.name="dipak";
        s3.rollnum=012;
        s3.marks=76;

        student students[]=new student [3];
        students [0]=s1;
        students [1]=s2;
        students [2]=s3;

// System.out.println(s1);   // why it's give a different type value 
// System.out.println(s2);
// System.out.println(s3);
for(int i=0;i<=6;i++){
    System.out.println(students[i].name+": "+students[i].marks);
}

        // int nums[]=new int [6];
        // nums[0]=3;
        // nums[1]=4;
        // nums[2]=5;                      
        // nums[3]=6;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

    }
}
