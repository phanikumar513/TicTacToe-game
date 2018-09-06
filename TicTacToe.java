
//Tic Tac Toe game
import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int winner=0,error1=0,error2=0,p1=0,p2=0,i,j,x=0,y=0;
		char [][]a=new char[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]='-';
			}
			System.out.println();
		}
		System.out.println("Game start");
		while(winner==0)
		{
//player 1=*
			error1=1;
			while(error1==1)
			{
				error1=0;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("PLAYER 1 TURN");
				System.out.println();
				System.out.println("Enter the position x and y");
				System.out.println("x=");
				x=obj.nextInt();
				System.out.println("y=");
				y=obj.nextInt();
				if(x>0 && 4>x && y>0 && 4>y)
				{
					x--;
					y--;
					if(a[x][y]=='-')
					{
						a[x][y]='0';
					}
					else
					{
						System.out.println("Enter the valid location!!");
						error1++;
					}
				}
				else
				{
					System.out.println("Enter the valid location!!");
					error1++;
				}
//gaming cases
	//case1-3
				p1=0;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						if(a[i][j]=='0')
						{
							p1++;
						}
					}
					if(p1==3)
					{
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(a[i][i]+" ");
							}
							System.out.println();
						}
						System.out.println("PLAYER 1 IS WINNER!!");
						winner++;
						error1=2;
						error2=2;
					}
					else
					{
						p1=0;
					}
				}
//case4-6
				p1=0;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						if(a[j][i]=='0')
						{
							p1++;
						}
					}
					if(p1==3)
					{
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(a[i][i]+" ");
							}
							System.out.println();
						}
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(a[i][i]+" ");
							}
							System.out.println();
						}
						System.out.println("PLAYER 1 IS WINNER!!");
						winner++;
						error1=2;
						error2=2;
					}
					else
					{
						p1=0;
					}
				}
	//case7-8
				p1=0;
				for(i=0;i<3;i++)
				{
					j=i;
					if(a[i][j]=='0')
					{
						p1++;
					}
				}
				if(p1==3)
				{
					for(i=0;i<3;i++)
					{
						for(j=0;j<3;j++)
						{
							System.out.print(a[i][i]+" ");
						}
						System.out.println();
					}
					System.out.println("PLAYER 1 IS WINNER!!");
					winner++;
					error1=2;
					error2=2;
				}
				else
				{
					p1=0;
				}
				
				if(a[0][2]=='0')
				{
					if(a[1][1]=='0')
					{
						if(a[2][0]=='0')
						{
							for(i=0;i<3;i++)
							{
								for(j=0;j<3;j++)
								{
									System.out.print(a[i][i]+" ");
								}
								System.out.println();
							}
							System.out.println("PLAYER 1 IS WINNER!!");
							winner++;
							error1=2;
							error2=2;
						}
					}
				}
				
				
				
				
			}
//player 2=*
			error2=1;
			while(error2==1)
			{
				error2=0;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("PLAYER 2 TURN");
				System.out.println();
				System.out.println("Enter the position x and y");
				System.out.println("x=");
				x=obj.nextInt();
				System.out.println("y=");
				y=obj.nextInt();
				if(x>0 && 4>x && y>0 && 4>y)
				{
					x--;
					y--;
					if(a[x][y]=='-')
					{
						a[x][y]='*';
					}
					else
					{
						System.out.println("Enter the valid location!!");
						error2++;
					}
				}
				else
				{
					System.out.println("Enter the valid location!!");
					error2++;
				}
//gaming cases
//case1-3	
				p2=0;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						if(a[i][j]=='*')
						{
							p2++;
						}
					}
					if(p2==3)
					{
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(a[i][i]+" ");
							}
							System.out.println();
						}
						System.out.println("PLAYER 2 IS WINNER!!");
						winner++;
						error1=2;
						error2=2;
					}
					else
					{
						p2=0;
					}
				}
			}
//case4-6
			p2=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(a[j][i]=='*')
					{
						p2++;
					}
				}
				if(p2==3)
				{
					for(i=0;i<3;i++)
					{
						for(j=0;j<3;j++)
						{
							System.out.print(a[i][i]+" ");
						}
						System.out.println();
					}
					System.out.println("PLAYER 2 IS WINNER!!");
					winner++;
					error1=2;
					error2=2;
				}
				else
				{
					p2=0;
				}
			}
//case7-8
			p2=0;
			for(i=0;i<3;i++)
			{
				j=i;
				if(a[i][j]=='*')
				{
					p2++;
				}
			}
			if(p2==3)
			{
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						System.out.print(a[i][i]+" ");
					}
					System.out.println();
				}
				System.out.println("PLAYER 2 IS WINNER!!");
				winner++;
				error1=2;
				error2=2;
			}
			else
			{
				p2=0;
			}
			
			if(a[0][2]=='*')
			{
				if(a[1][1]=='*')
				{
					if(a[2][0]=='*')
					{
						for(i=0;i<3;i++)
						{
							for(j=0;j<3;j++)
							{
								System.out.print(a[i][i]+" ");
							}
							System.out.println();
						}
						System.out.println("PLAYER 2 IS WINNER!!");
						winner++;
						error1=2;
						error2=2;
					}
				}
			}
//end of program!!			
		}
	}

}
