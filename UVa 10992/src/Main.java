import java.util.*;
import java.math.*;

class Main{
public static void main(String[] args){
    
    Scanner br = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    boolean first=true;
    while(true){
        BigInteger bg=new BigInteger(br.next());
        if(bg.compareTo(BigInteger.ZERO)==0){
            break;
        }
        if(!first){
            sb.append("\n");
        }
        sb.append(bg).append("\n");
        answer(bg, sb);
        first=false;
    }
    System.out.print(sb);
}

static void answer(BigInteger bg,StringBuffer sb){
    boolean flag=false;
    if(bg.compareTo(BigInteger.valueOf(2147))==1){
        BigInteger leap=bg.add(BigInteger.ZERO);
        bg=bg.subtract(BigInteger.valueOf(2148));
        if((bg.mod(BigInteger.valueOf(2))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Tanveer Ahsan!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(5))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Shahriar Manzoor!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(7))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Adrian Kugel!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(11))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Anton Maydell!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(15))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Derek Kisman!!!\n");
            
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(20))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Rezaul Alam Chowdhury!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(28))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Jimmy Mardell!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(36))).compareTo(BigInteger.ZERO)==0){
            sb.append("Ghost of Monirul Hasan!!!\n");
            flag=true;
        }
        if((bg.mod(BigInteger.valueOf(4))).compareTo(BigInteger.ZERO)==0){
            if((leap.mod(BigInteger.valueOf(400))).compareTo(BigInteger.ZERO)==0){
                sb.append("Ghost of K. M. Iftekhar!!!\n");
                flag=true;
            }
            if(!((leap.mod(BigInteger.valueOf(100))).compareTo(BigInteger.ZERO)==0)){
                sb.append("Ghost of K. M. Iftekhar!!!\n");
                flag=true;
            }
        }
    }
    if(!flag){
        sb.append("No ghost will come in this year\n");
    }
}
}