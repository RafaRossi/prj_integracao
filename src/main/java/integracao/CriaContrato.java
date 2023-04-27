package integracao;

public class CriaContrato {
	
	public static Contrato CriaContrato(Pessoa pessoa, TipoContrato tipo)
	{
		if(pessoa.GetIdade() < 16 || pessoa.GetIdade() > 55)
		{
			System.out.println("Não é possível contratar uma pessoa com essa idade.");
			return null;
		}
		
		if(pessoa.GetIdade() < 18 && tipo != TipoContrato.Parcial)
		{
			System.out.println("Não é possível realizar esse tipo de cotrato para essa idade.");
			return null;
		}
		
		return new Contrato(pessoa, tipo);
	}
}
