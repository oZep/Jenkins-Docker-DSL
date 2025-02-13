import unittest
from something import Pet, Dog, Cat

class TestPet(unittest.TestCase):
    def test_pet_does_something(self):
        pet = Pet('Buddy')
        self.assertEqual(pet.doesSomething(), 'Buddy does something')

class TestDog(unittest.TestCase):
    def test_dog_does_something(self):
        dog = Dog('Rex')
        self.assertEqual(dog.doesSomething(), 'Rex barks')

class TestCat(unittest.TestCase):
    def test_cat_does_something(self):
        cat = Cat('Whiskers')
        self.assertEqual(cat.doesSomething(), 'Whiskers meows')

if __name__ == '__main__':
    unittest.main()