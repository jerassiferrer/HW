

public static int divide(int numerator,int denominator ) throws ArithmeticException {
		int result =0;
		if(numerator==denominator){
			result=1;
		}
		else if(numerator==0){
			result =0;
		}	
		else if (denominator ==0){
			// make an arithmetic exception
			throw new ArithmeticException("illegal denominator value: " + denominator);
		}
		else if (numerator>0 && denominator>0 && numerator<denominator){
			result =0;	
		}
		else if (numerator<0 && denominator<0){
		      while (numerator <= denominator) {
		            numerator += -1 * denominator;
		                    result++;
		                }
		}
		else if (numerator<0 || denominator<0){
			if(numerator <0){
				numerator= numerator*-1;
			}else{
				denominator=denominator*-1;
			}
			while (numerator >= denominator){
				numerator -= denominator;
				result++;
			}
			result=result*-1;
				
		}
		else {
			while(numerator >= denominator){
				numerator -= denominator;
				result++;
			}
		}	
		
		
		return result;
	}
