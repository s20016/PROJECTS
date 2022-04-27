class Person():
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def state(self):
        print(f'I am {self.name}')

p1 = Person('JC', 22)
p1.state()


