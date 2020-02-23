package expressiontree;
public class ValueNode extends TreeNode{
public double value;
public ValueNode(double value){
  this.value=value;  //constructor
}
public void print(int depth){
  for(int i=0;i<depth;i++){//it will print spaces until the desired depth is reached.
  System.out.print("\t");}
  System.out.println(this.evaluate());
}
public double evaluate(){
  boolean check=(this.value!=0); //if there is a zero in the value node then
  //check will have false.then it will return 0.0d.
  if(check==true){
return this.value;//when it is not zero it will return a value.
}
else return 0.0d;
}
}
