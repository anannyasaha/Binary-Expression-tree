package expressiontree;
public class ExpressionTree{
public TreeNode root;
public ExpressionTree(TreeNode root){
  this.root=root;
}
public void print(){
  this.root.print(0);
}
public double evaluate(){
return root.evaluate();
}
}
