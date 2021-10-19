package Modelo;

public abstract class PessoaHeranca {

	

private String nome;
private String email;
private String telefone;




public PessoaHeranca() {
super();
//Modelo JavaBins construtores
}




public PessoaHeranca(String nome, String email, String telefone) {
super();
this.nome = nome;
this.email = email;
this.telefone = telefone;
}



//assinatura
public abstract void validaEmail(String email);



public void validaTelefone() {
if(this.nome == null && this.telefone == null)
System.out.println("invalidos");
//aceita logica = possui corpo
}





public String getNome() {
return nome;
}




public void setNome(String nome) {
this.nome = nome;
}




public String getEmail() {
return email;
}




public void setEmail(String email) {
this.email = email;
}




public String getTelefone() {
return telefone;
}




public void setTelefone(String telefone) {
this.telefone = telefone;
}









	
	
}
