# Diagrama de classe

'''mermaid
classDiagram
    class User {
        -String name
        -Account account
        -List<Feature> features
        -List<Card> cards
        -List<News> news
    }
    
    class Account {
        -String number
        -String agency
        -float balance
        -float limit
    }
    
    class Feature {
        -String icon
        -String description
        -String name
    }
    
    class Card {
        -String cardNumber
        -float cardLimit
    }
    
    class News {
        -String title
        -String description
        -String date
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News
'''
