<img src="https://repository-images.githubusercontent.com/40136600/f3f5fd00-c59e-11e9-8284-cb297d193133" alt="Ktor" width="500" style="max-width:100%;">


[Ktor](https://ktor.io/) is an asynchronous framework for creating microservices, web applications and more. Written in Kotlin from the ground up.

## Plugin Used
- [Routing](https://ktor.io/docs/routing-in-ktor.html) - Routing is the core Ktor plugin for handling incoming requests in a server application
- [Content negotiation and serialization](https://ktor.io/docs/serialization.html) - Serializing/deserializing the content in a specific format. Ktor supports the following formats out-of-the-box: JSON, XML, and CBOR
- [Status pages](https://ktor.io/docs/status-pages.html) - The StatusPages plugin allows Ktor applications to respond appropriately to any failure state based on a thrown exception or status code.
- [Koin](https://insert-koin.io/docs/reference/koin-ktor/ktor/) - The koin-ktor project is dedicated to bring dependency injection for Ktor.
## Boruto-API
JSON API for Boruto-Character 

BASE_URL: [https://boruto-server-api.herokuapp.com/](https://boruto-server-api.herokuapp.com/)


## Custom Endpoints

**Get All Character**
In order to get all the heroes in single request use this endpoint.


Endpoint: [/boruto/heroes](/boruto/heroes)

Example : [https://boruto-server-api.herokuapp.com/boruto/heroes](https://boruto-server-api.herokuapp.com/boruto/heroes)

Response
```jsonc
{
  "success": true,
  "message": "ok",
  "prevPage": null,
  "nextPage": 2,
  "heroes": [
    {
      "id": 1,
      "name": "Sasuke",
      "image": "/images/sasuke.jpg",
      "about": "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
      "rating": 5,
      "power": 98,
      "month": "July",
      "day": "23rd",
      "family": [
        "Fugaku",
        "Mikoto",
        "Itachi",
        "Sarada",
        "Sakura"
      ],
      "abilities": [
        "Sharingan",
        "Rinnegan",
        "Sussano",
        "Amateratsu",
        "Intelligence"
      ],
      "natureTypes": [
        "Lightning",
        "Fire",
        "Wind",
        "Earth",
        "Water"
      ]
    }
   }
```

**Search Character**

In order to search a specific character you can use this endpoint

you need to also pass a *Query parameter* **name**

Endpoint: [/boruto/heroes?name=""](https://boruto-server-api.herokuapp.com/boruto/heroes/search?name=ki)

Example : [https://boruto-server-api.herokuapp.com/boruto/heroes/search?name=naruto](https://boruto-server-api.herokuapp.com/boruto/heroes/search?name=naruto)

```jsonc
{
  "success": true,
  "message": "ok",
  "prevPage": null,
  "nextPage": null,
  "heroes": [
    {
      "id": 2,
      "name": "Naruto",
      "image": "/images/naruto.jpg",
      "about": "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
      "rating": 5,
      "power": 98,
      "month": "Oct",
      "day": "10th",
      "family": [
        "Minato",
        "Kushina",
        "Boruto",
        "Himawari",
        "Hinata"
      ],
      "abilities": [
        "Rasengan",
        "Rasen-Shuriken",
        "Shadow Clone",
        "Senin Mode"
      ],
      "natureTypes": [
        "Wind",
        "Earth",
        "Lava",
        "Fire"
      ]
    }
  ],
  "lastUpdated": null
}
```


