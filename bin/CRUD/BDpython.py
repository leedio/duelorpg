import sqlite3
conexao = sqlite3.connect("Banco.bd")

conexao.execute('''CREATE TABLE IF NOT EXISTS tabela (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(50) NOT NULL,
    sobrenome TEXT NOT NULL,
    idade INT NOT NULL);  ''')

def criar(nome, sobrenome, idade):
    conexao.execute("INSERT INTO tabela(nome,sobrenome,idade) VALUES (?,?,?);",(nome,sobrenome,idade))
    conexao.commit()
    print("")
    print("Inserido no Banco de Dados")
    
def listar():
    lista = conexao.execute("SELECT * FROM tabela;")
    for i in lista:
        print(i)
    
def atualizar(id, novo_nome,novo_sobrenome, nova_idade):
    conexao.execute("UPDATE tabela  SET nome=?, sobrenome=?, idade=? WHERE id=?;",(novo_nome,novo_sobrenome,nova_idade,id))
    conexao.commit()
    print("")
    print("Registros atualizados")

def deletar(id):
    conexao.execute("DELETE FROM tabela WHERE id=?;",(id,))
    conexao.commit()
    print("")
    print("Registro deletado")
    
#criar("Luara","Ribeiro",7)
#deletar(2)
#atualizar(4,"Diana","Souza",32)
listar()
