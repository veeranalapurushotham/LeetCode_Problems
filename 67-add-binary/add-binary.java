// class Solution {
//     public String addBinary(String a, String b) {
//         long n1=0;
//         int i=1;
//         for(int j=a.length()-1;j>=0;j--)
//         {
//             if(a.charAt(j)=='1')
//             {
//                 n1=n1+i;
//             }
//             i*=2;
//         }
//         long n2=0;
//          i=1;
//         for(int j=b.length()-1;j>=0;j--)
//         {
//             if(b.charAt(j)=='1')
//             {
//                 n2=n2+i;
//             }
//             i*=2;
//         }
//         long res=n1+n2;
//         if(res==0)
//         {
//             return "0";
//         }
//         StringBuilder result=new StringBuilder();
//         while(res>0)
//         {
//             result.append(res%2);
//             res=res/2;
//         }
//         return result.reverse().toString();


//     }
// }
class Solution {
    public String addBinary(String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = charArrA.length - 1, j = charArrB.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int aNum = i >= 0 ? charArrA[i] - '0' : 0;
            int bNum = j >= 0 ? charArrB[j] - '0' : 0;

            int sum = aNum + bNum + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;

            sb.append((char)(digit + '0'));
        }

        return sb.reverse().toString();
    }
}