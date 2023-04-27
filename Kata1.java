
public class Kata1 {
  
  public static Object[] removeEveryOther(Object[] arr) {
 
    Solution soluzionne = new Solution(arr);    
    return soluzionne.removeElement();
  }
}

class Solution {
  private int arrayParamaterSize;
  private int arraySolutionSize;
  private Object[] arrayParameter;
  private Object[] arraySolution;
  
  Solution(Object[] arr){
      this.arrayParamaterSize = arr.length;
      this.arraySolutionSize = (this.arrayParamaterSize % 2 == 0)? this.arrayParamaterSize/2 : (this.arrayParamaterSize+1)/2;
      this.arrayParameter = arr;
      this.arraySolution = null;
   }

  public Object[] removeElement(){
    
      if(this.arraySolution != null) return(this.arraySolution);
    
      this.arraySolution = new Object[this.arraySolutionSize];
      int j = 0;
      for (int i = 0; i < this.arrayParamaterSize; i+=2){
          this.arraySolution[j] = this.arrayParameter[i];
          j++;
      }  
     return this.arraySolution;

  }
}