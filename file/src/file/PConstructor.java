 package file;

public class PConstructor {


private static PConstructor obj = null;

private PConstructor(){

}

public static PConstructor createConstructor(){
if(obj==null){
obj = new PConstructor();
}
return obj;

}
}