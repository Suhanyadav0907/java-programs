class Armstrong {
    public static void main(String []args)
{
    int n=10500,r,sum=0,count=0;

    while(n!=0)
    {
        r =n%10;
        sum = sum*10 +r;
        n =n/10;
        count++;
    }
    while(sum!=0)
    {
        r = sum%10;
        switch (r) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }

        sum =sum/10;
        count--;
    }
    while(count>0)
    {
        System.out.println("Zero");
        count--;
    }
}
}