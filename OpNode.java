package expressiontree;
public class OpNode extends TreeNode{
public TreeNode left;
public TreeNode right;
public String operator;

public OpNode(TreeNode left,String operator,TreeNode right){ //constructor
  this.left=left;
  this.right=right;
  this.operator=operator;
}
public void print(int depth){
  if(this.right!=null){  //when there is a right child it will print the spaces according to its depth.
    this.right.print(depth+1);
    for(int i=0;i<depth;i++){
      System.out.print("\t"); //printing the spaces

    }
    System.out.println(this.operator); //printing the operator or the parent/grand parent

  if(this.left!=null){  ////when there is a left child it will print the spaces according to its depth.
      this.left.print(depth+1);
    }
  }
}
public double evaluate(){
  double result=0.0d;
if(left.evaluate()!=0.0d&&right.evaluate()!=0.0d){  //calling recursively evaluate
  // so that it finds the value of the opcode or value code.
  if(this.operator=="*"){ //Operation is carried out according to the operator.
    result=left.evaluate()*right.evaluate();
    return result;
  }
  if(this.operator=="+"){
    result=left.evaluate()+right.evaluate();
    return result;
  }
  if(this.operator=="-"){
    result=left.evaluate()-right.evaluate();
    return result;
  }
  if(this.operator=="/"){
    result=left.evaluate()/right.evaluate();
    return result;
  }
  if(this.operator=="%"){
    result=left.evaluate()%right.evaluate();
    return result;
  }
}

return result;} //default return is zero

}
