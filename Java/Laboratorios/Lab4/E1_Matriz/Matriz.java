package Laboratorios.Lab4.E1_Matriz;

public class Matriz {
	private
	int esbe[][]=new int[10][10];
	int nsbe;
	public
	Matriz()
	{nsbe=1;
		esbe[nsbe][nsbe]=15;
	}
	Matriz(int asbe)
	{int isbe, jsbe;
		nsbe=asbe;
		for(isbe=1;isbe<=nsbe;isbe++)
		{	for(jsbe=1;jsbe<=nsbe;jsbe++)
			{esbe[isbe][jsbe]=isbe+jsbe;
			}
		}
	}
	void mostrarm (int nsbe)
	{int isbe,jsbe;
		System.out.println("\nsbe");
		for(isbe=1;isbe<=nsbe;isbe++)
		{	for(jsbe=1;jsbe<=nsbe;jsbe++)
			{
				System.out.print("\t"+esbe[isbe][jsbe]);
			}
			System.out.println("\nsbe");
		}
	}
	void caracolcentro(int nsbe)
	{	int isbe,jsbe,psbe,ksbe,csbe=1,lisbe,lssbe;
		psbe=(nsbe/2)+1; lisbe=psbe; lssbe=psbe;
		esbe[psbe][psbe]=csbe;csbe++;
		for(ksbe=1;ksbe<=psbe-1;ksbe++)
		{	jsbe=lssbe+1;
			for(isbe=lisbe;isbe<=lssbe+1;isbe++)
			{esbe[isbe][jsbe]=csbe; csbe=csbe+1;}
			isbe=lssbe+1;
			for(jsbe=lssbe;jsbe>=lisbe-1;jsbe--)
			{esbe[isbe][jsbe]=csbe;csbe=csbe+1;}
			jsbe=lisbe-1;
			for(isbe=lssbe;isbe>=lisbe-1;isbe--)
			{esbe[isbe][jsbe]=csbe;csbe=csbe+1;}
			isbe=lisbe-1;
			for(jsbe=lisbe;jsbe<=lssbe+1;jsbe++)
			{esbe[isbe][jsbe]=csbe;csbe=csbe+1;}
			lisbe=lisbe-1; lssbe=lssbe+1;
		}
	}
	void rombo(int nsbe)
	{int isbe,jsbe,csbe=1,lisbe,lssbe;
		lisbe=(nsbe/2)+1; lssbe=lisbe;
		for(isbe=1;isbe<=nsbe;isbe++)
		{	for(jsbe=lisbe;jsbe<=lssbe;jsbe++)
			{esbe[isbe][jsbe]=csbe; csbe=csbe+1;
			}
		if(isbe>=(nsbe/2)+1)
		{lisbe=lisbe+1;}
		else
		{lisbe=lisbe-1;}
		}
	}
	void zic(int nsbe)
	{int csbe=1,ksbe,isbe,jsbe;
		for(ksbe=1;ksbe<=nsbe;ksbe++)
			{if(ksbe%2==1)
				{jsbe=ksbe;
					for(isbe=1;isbe<=ksbe;isbe++)
					{esbe[isbe][jsbe]=csbe;csbe=csbe++;jsbe--;}
				}
			else
				{isbe=ksbe;
					for(jsbe=1;jsbe<=ksbe;jsbe++)
					{esbe[isbe][jsbe]=csbe;csbe++;isbe--;}
				}
			}
		for(ksbe=2;ksbe<=nsbe;ksbe++)
		{if(ksbe%2==1)
			{jsbe=nsbe;
				for(isbe=ksbe;isbe<=nsbe;isbe++)
				{esbe[isbe][jsbe]=csbe;csbe++;isbe--;}
			}
		}
	}
}

