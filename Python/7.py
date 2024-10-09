class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []  
    def adicionar_escola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.adicionar_professor(self) 
            print(f"O professor {self.nome} já ensina na escola {escola.nome}.")
       
    
    def listar_escolas(self):
        if self.escolas:
            print(f"O professor {self.nome} ensina nas seguintes escolas:")
            for escola in self.escolas:
                print(f"- {escola.nome}")
        else:
            print(f"O professor {self.nome} não ensina em nenhuma escola.")


class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []  
    
    def adicionar_professor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)
        else:
            print(f"O professor {professor.nome} já está ligado à escola {self.nome}.")
    
    def listar_professores(self):
        if self.professores:
            print(f"A escola {self.nome} tem os seguintes professores:")
            for professor in self.professores:
                print(f"- {professor.nome}")
        else:
            print(f"A escola {self.nome} ainda não tem professores ligados.")

escola_a = Escola("Escola A")
escola_b = Escola("Escola B")
professor_ricardo = Professor("Ricardo")
professor_leo = Professor("Leo")

professor_ricardo.adicionar_escola(escola_a)
professor_leo.adicionar_escola(escola_a)
professor_leo.adicionar_escola(escola_b)  #

escola_a.listar_professores()
escola_b.listar_professores()

professor_ricardo.listar_escolas()
professor_leo.listar_escolas()