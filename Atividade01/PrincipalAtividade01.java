package Atividade01;

public class PrincipalAtividade01 {
	public static void main(String[] args) {
		Casa casa1 = new Casa (1,"Casa do Sonoda", 1404.45,"Rosa");
		ItemCasa itemCasa1 = new ItemCasa(1,"Geladeira","Item para refrigerar alimentos");
		Endereco endereco1 = new Endereco (1,"Rua",254,"Apartamento","Jardim casa Grande","Itapetininga","18 200-580","RJ");
		Cliente cliente1 = new Cliente(1,"André","98 195-4525","54705454984","780744");
	
		System.out.println("---------Dados da casa---------");
		System.out.println("Id da casa: "+casa1.getId());
		System.out.println("Nome da casa: "+casa1.getNome());
		System.out.println("Cor da casa: "+casa1.getCor());
		System.out.println("Valor do Aluguel da casa: R$"+casa1.getValoAluguel());
		System.out.println(" ");
		
		System.out.println("---------Dados do Item---------");
		System.out.println("Id do Item da casa: "+itemCasa1.getId());
		System.out.println("Nome do Item da casa: "+itemCasa1.getNome());
		System.out.println("Descrição do Item da casa: "+itemCasa1.getDescriçao());
		System.out.println(" ");
		
		System.out.println("---------Dados do Endereço---------");
		System.out.println("Id do Endereço: "+endereco1.getId());
		System.out.println("Logradouro do Endereço: "+endereco1.getLogradouro());
		System.out.println("Numero do Endereço: "+endereco1.getNumero());
		System.out.println("Complemento do  Endereço: "+endereco1.getComplemento());
		System.out.println("Bairro do Endereço: "+endereco1.getBairro());
		System.out.println("Cidade do Endereço: "+endereco1.getCidade());
		System.out.println("Cep do Endereço: "+endereco1.getCep());
		System.out.println("UF do Endereço: "+endereco1.getUf());
		System.out.println(" ");
		
		System.out.println("---------Dados od Cliente---------");
		System.out.println("Id do Cliente: "+cliente1.getId());
		System.out.println("Nome do Cliente: "+cliente1.getNome());
		System.out.println("Telefone do Cliente: "+cliente1.getTelefone());
		System.out.println("Cpf do Cliente: "+cliente1.getCpf());
		System.out.println("Rg do Cliente: "+cliente1.getRg());
	}
}