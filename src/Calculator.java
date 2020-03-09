public class Calculator {
   private int result;
   private int number;
   
   public Calculator() {
	 this.result = 0;
	 this.number = 0;
   }
   
   public int getResult() {
	 return result;
   }
  
   public void setResult(int result) {
	 this.result = result;
   }

   public int getNumber1() {
	return number;
  }

   public void setNumber(int number) {
	 this.number = number;
  }

  public void addition() {
	   this.result += this.number;
   }
  
  public void subtraction() {
	  this.result -= this.number;
  }
  
  public void multiplication() {
	  if(this.result == 0)
		  this.result = this.number;
	  else
		  this.result = this.result * this.number;
  }
  
  public void division() {
	  if(this.result == 0)
		  this.result = this.number;
	  else
		  this.result = this.result / this.number;
  }
  
  public void modulo() {
	  if(this.result == 0)
		  this.result = this.number;
	  else
		  this.result = this.result % this.number;
  }
   
  public int fac(int n){
     if(n == 1)
        return 1;
     else 
    	this.result = n * fac(n-1);
     return this.result;
  }
}  
