package com.example.finalcalculator;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	     double num1 = -1;
	    double num2 = -1;
	    int flag = 1;
	    double answer = 0;
	    int oper = 0;
	    Button one, two , ans, add, sub, equ, three, four, five, six, seven, eight, nine, zero, multiply, dev;
	    
	    Button clear,dec,sign;
	    TextView see;
	    
    @Override
    
 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.button4);
        two = (Button)findViewById(R.id.button8);
        add = (Button)findViewById(R.id.button17);
        see = (TextView)findViewById(R.id.textView1);
        equ = (Button) findViewById(R.id.button18);
        three = (Button)findViewById(R.id.button14);
        four = (Button)findViewById(R.id.button3);
        five = (Button)findViewById(R.id.button7);
        six = (Button)findViewById(R.id.button13);
        seven = (Button)findViewById(R.id.button2);
        eight = (Button)findViewById(R.id.button6);
        nine = (Button)findViewById(R.id.button12);
        zero = (Button)findViewById(R.id.button9);
        sub = (Button)findViewById(R.id.button16);
        dev = (Button)findViewById(R.id.button10);
        multiply = (Button)findViewById(R.id.button11);
        clear = (Button)findViewById(R.id.button1);
        dec = (Button)findViewById(R.id.button15);
        sign = (Button)findViewById(R.id.button5);
        
        		sign.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
					if(num1 != -1){
						num1 = -num1;
						see.setText(""+num1);
					}
					else{
						num2 = -num2;
					see.setText(""+num2);
					}
					}
				});
        one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flag == 1){
				if(num1 == -1)
		        	num1 = 1;
				else
					num1 = num1*10 + 1;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 1;
					else
						num2 = num2*10 + 1;
					see.setText(""+num2);
				}
					
				
			}
		});
        two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(flag == 1){
					if(num1 == -1)
			        	num1 = 2;
					else
						num1 = num1*10 + 2;
					see.setText(""+num1);
					}
					else{
						if(num2==-1)
							num2 = 2;
						else
							num2 = num2*10 + 2;
						see.setText(""+num2);
					}
				// TODO Auto-generated method stub
				
			}
		});
 three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flag == 1){
					if(num1 == -1)
			        	num1 = 3;
					else
						num1 = num1*10 + 3;
					see.setText(""+num1);
					}
					else{
						if(num2==-1)
							num2 = 3;
						else
							num2 = num2*10 + 3;
						see.setText(""+num2);
					}
			}
		});
 four.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 4;
				else
					num1 = num1*10 + 4;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 4;
					else
						num2 = num2*10 + 4;
					see.setText(""+num2);
				}
		}
	});
 five.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 5;
				else
					num1 = num1*10 + 5;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 5;
					else
						num2 = num2*10 + 5;
					see.setText(""+num2);
				}
		}
	});
 six.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 6;
				else
					num1 = num1*10 + 6;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 6;
					else
						num2 = num2*10 + 6;
					see.setText(""+num2);
				}
		}
	});
 seven.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 7;
				else
					num1 = num1*10 + 7;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 7;
					else
						num2 = num2*10 + 7;
					see.setText(""+num2);
				}
		}
	});
 
 eight.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 8;
				else
					num1 = num1*10 + 8;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 8;
					else
						num2 = num2*10 + 8;
					see.setText(""+num2);
				}
		}
	});
 nine.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 9;
				else
					num1 = num1*10 + 9;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 9;
					else
						num2 = num2*10 + 9;
					see.setText(""+num2);
				}
		}
	});
 zero.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag == 1){
				if(num1 == -1)
		        	num1 = 0;
				else
					num1 = num1*10 + 0;
				see.setText(""+num1);
				}
				else{
					if(num2==-1)
						num2 = 0;
					else
						num2 = num2*10 + 0;
					see.setText(""+num2);
				}
		}
	});
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				flag = 2;
				oper = 3;
			
				
				// TODO Auto-generated method stub
				
			}
		});
     sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				flag = 2;
				oper = 4;
			
				
				// TODO Auto-generated method stub
				
			}
		});
   multiply.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		flag = 2;
		oper = 2;
	
		
		// TODO Auto-generated method stub
		
	}
});
  dev.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		flag = 2;
		oper = 1;
	
		
		// TODO Auto-generated method stub
		
	}
});
  
       clear.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		        answer = 0;
		        num1 = -1;
		        num2 = -1;
		        flag = 1;
		        see.setText("Start Calculation");
		}
	});
        equ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			switch(oper){
			case 1:
				answer = num1/num2;
				break;
			case 2:
				answer = num1*num2;
				break;
	        	case 3:
				 answer = num1 + num2;
				 break;
			   case 4:
			 	answer = num1 - num2;
				break;
			}
			num1 = answer;
			num2 = -1;
			see.setText("Your answer is " + answer);
			}
		});
    }
    
    
         
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
