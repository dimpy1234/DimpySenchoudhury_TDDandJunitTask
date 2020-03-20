package tddjunit;

public class RemoveAfrom1stTwoChars {
	public String remove(String string) {
	int l = string.length();
	if(l!=0)
	{
		char c1= string.charAt(0);

	if(l>=2)
	{
		char c2 = string.charAt(1);
		if(c1 == 'A')
		{
			string = string.substring(1,l);
			if(c2 == 'A')
				string = string.substring(1);
		}
	else if(c2 == 'A')
		string= string.substring(0,1)+ string.substring(2,l);
	}
	else if(c1 == 'A')
	{
		string= "";
	}
	}
	return(string);
	}


}
