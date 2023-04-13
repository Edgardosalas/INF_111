package Laboratorios.Lab3.E3_Clase_Vector;
import java.util.Scanner;
public class Vector {
			private
				int nomsbe[]=new int[10];
				int nsbe;
			public
				Vector()
				{	nsbe=1;
					nomsbe[1]=15;
				}
				Vector(int asbe)
				{	int isbe;
					nsbe=asbe;
					for(isbe=1;isbe<=nsbe;isbe++)
					{nomsbe[isbe]=isbe;
					}
				}
				int obtn()
				{return nsbe;}
				int obtnom(int ksbe)
				{return nomsbe[ksbe];}
				void ponn(int asbe)
				{nsbe=asbe;}
				void ponnom(int ksbe, int asbe)
				{nomsbe[ksbe]=asbe;}
				void leer()
				{	int isbe;
					Scanner sc=new Scanner(System.in);
					System.out.println("Intro nsbe");
					nsbe=sc.nextInt();
	                for (isbe=1;isbe<=nsbe;isbe++)
	                {System.out.println("nomsbe["+isbe+"]=");
	                	nomsbe[isbe]=sc.nextInt();
	                }
				}
				void mostrar()
				{	int isbe;
					Scanner cs=new Scanner(System.in);
					System.out.println("\nsbe");
					for (isbe=1;isbe<=nsbe;isbe++)
					{	System.out.print(" "+nomsbe[isbe]);
					}
				}
				void burbuja()
			    {	int isbe, jsbe, xsbe;
			        for (isbe=1;isbe<=nsbe-1;isbe++)
			            {	for (jsbe=isbe+1;jsbe<=nsbe;jsbe++)
			                {	if(nomsbe[isbe]>nomsbe[jsbe])
			                    {	xsbe=nomsbe[isbe]; nomsbe[isbe]=nomsbe[jsbe];
			                    	nomsbe[jsbe]=xsbe;
			                    }
			                }
			            }
			    }
			     void insercion()
			     {	int isbe, ksbe=0, xsbe;
			     	for (isbe=2;isbe<=nsbe;isbe++)
			     	{	ksbe=isbe;
			     		while(nomsbe[ksbe]<=nomsbe[ksbe-1] && ksbe>1)
			     		{	xsbe=nomsbe[ksbe]; nomsbe[ksbe]=nomsbe[ksbe-1]; nomsbe[ksbe-1]=xsbe;
			     			ksbe=ksbe-1;
			     		}
			     	}
			     }
			     void sacudida()
			        {int isbe, ksbe=0, xsbe, swsbe=1, lisbe=1, lssbe=nsbe;
			            while(swsbe!=0)
			            {swsbe=0;
			                if(ksbe==0)
			                {	for(isbe=lisbe;isbe<=lssbe-1;isbe++)
			                    {if(nomsbe[isbe]>nomsbe[isbe+1])
			                        {xsbe=nomsbe[isbe]; nomsbe[isbe]=nomsbe[isbe+1]; nomsbe[isbe+1]=xsbe; swsbe=1;
			                        }
			                    }
			                    lssbe=lssbe-1; ksbe=1;
			                }
			                else
			                {	for(isbe=lssbe;isbe>=lisbe+1;isbe--)
			                    {if(nomsbe[isbe]<nomsbe[isbe-1])
			                        {xsbe=nomsbe[isbe]; nomsbe[isbe]=nomsbe[isbe-1]; nomsbe[isbe-1]=xsbe; swsbe=1;
			                        }
			                    }
			                lisbe=lisbe-1; ksbe=0;
			                }
			            }
			        }
			}