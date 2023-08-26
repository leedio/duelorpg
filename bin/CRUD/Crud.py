class Person:
    def __init__(self, id, nome, idade) -> None:
        self.id=id
        self.nome=nome
        self.idade=idade


class Crud:
    def __init__(self) -> None:
        self.pessoas=[]
        self.id_atual=1
    
    def criar(self,nome,idade):
        pessoa = Person(self.id_atual,nome,idade)
        self.pessoas.append(pessoa)
        self.id_atual+=1
        print(f"{pessoa.nome} Inserido com sucesso")
        return pessoa
    
    def listar(self, id=None):
        if id is None:
            return self.pessoas
        else:
            for pessoa in self.pessoas:
                if pessoa.id == id:
                    print(pessoa.nome)
                    return pessoa
            return None
    
    def delete(self, id):
        pessoa = self.listar(id)
        if pessoa:
            self.pessoas.remove(pessoa)
            return True
        else:
            return False

exe =Crud()

pessoa1 = exe.criar("Lidio",37)
exe.listar(1)