// Code for Tower of Hanoi problem.

void TOH(int n, char BEG, char AUX, char END)
{
  if(n>=1)
	{
		TOH(n-1,BEG,END,AUX);
		System.out.println(BEG+" to "+END+"\n");
		TOH(n-1,AUX,BEG,END);
	}
}
