
class Pet:
    def __init__(self, name):
        self.name = name

    def doesSomething(self):
        return f'{self.name} does something'

class Dog(Pet):
    def __init__(self, name):
        super().__init__(name)

    def doesSomething(self):
        return f'{self.name} barks'
    
class Cat(Pet):
    def __init__(self, name):
        super().__init__(name)

    def doesSomething(self):
        return f'{self.name} meows'


def main():
    dog = Dog('Rex')
    cat = Cat('Whiskers')

    print(dog.doesSomething())
    print(cat.doesSomething())

if __name__ == '__main__':
    main()