# Documento Técnico

## Introducción
Solucion de desarrollada con Java 17 en framework Spring Boot 3.1.5 y Base de datos en memoria "Hsqldb" y Angular 15 para el consumo de los servicios.

## Requerimientos para la ejecucion del proyecto
- Java 17
- Maven 3.x.x
- Angular 15
- Node 18.x.x
- Npm 8.x.x
- Git 2.x.x
- IDE de desarrollo (Eclipse, IntelliJ, Spring Tools Suite)
- Postman 8.x.x
- Navegador Web (Chrome, Firefox, etc)
- Sistema Operativo (Windows, Linux, Mac)
- Conexión a Internet

## Instalación

### Proyecto Backend
- Clonar el proyecto desde el repositorio de GitHub con el siguiente comando:
- git clone https://github.com/PaarXul/backend-noticias.git
- Abrir el proyecto en el IDE de desarrollo
- Ejecutar el comando "mvn clean install" para descargar las dependencias del proyecto
- Ejecutar el comando "mvn spring-boot:run" para iniciar el proyecto
- Abrir el navegador web y acceder a la url http://localhost:8081/swagger-ui.html para acceder a la documentación de los servicios

### Datos de prueba para agregar al apartado de "Request Body" de los servicios de la API en Swagger UI en las noticias Favoritas

```JSON
[
   {
      "id": 21419,
      "title": "Virgin Galactic pausing flights next year and laying off 18% to focus on next-gen spacecraft",
      "url": "https://www.cnbc.com/2023/11/08/virgin-galactic-spce-q3-earnings-report.html",
      "image_url": "https://image.cnbcfm.com/api/v1/image/107259950-1687346121009-Unity_25_Spaceship_Selects13.jpg",
      "news_site": "CNBC",
      "summary": "Virgin Galactic plans to pause spaceflight operations next year to focus resources on developing its next-generation Delta-class spacecraft, the company announced Wednesday.",
      "published_at": "2023-11-08T22:10:20Z",
      "updated_at": "2023-11-08T22:52:23.798000Z",
      "featured": false,
      "launches": [
        {
          "launch_id": "206ec3ec-d265-4f74-b7c1-40ef231ef1d2",
          "provider": "Launch Library 2"
        }
      ],
      "events": []
    },
    {
      "id": 21420,
      "title": "Rocket Lab pushes to get launch business back on track, with 22 Electron missions booked next year",
      "url": "https://www.cnbc.com/2023/11/08/rocket-lab-rklb-q3-earnings-report.html",
      "image_url": "https://image.cnbcfm.com/api/v1/image/107118843-1663194138342-gettyimages-1243236869-GLOBAL_AEROSPACE_SUMMIT.jpeg",
      "news_site": "CNBC",
      "summary": "Rocket Lab is pushing to get its launch business back on track by the end of the year, reporting on Wednesday third-quarter results that saw continued strength in its space systems division.",
      "published_at": "2023-11-08T21:55:08Z",
      "updated_at": "2023-11-08T22:52:33.436000Z",
      "featured": false,
      "launches": [
        {
          "launch_id": "2918b5f6-1340-4c73-bb75-4f9b5e16999f",
          "provider": "Launch Library 2"
        }
      ],
      "events": []
    },
    {
      "id": 21418,
      "title": "SpaceX installs new Crew Access Arm in between Starlink launches",
      "url": "https://www.teslarati.com/spacex-installs-new-crew-access-arm-in-between-starlink-launches/",
      "image_url": "https://www.teslarati.com/wp-content/uploads/2023/11/F-YaAfxasAACD57.jpg",
      "news_site": "Teslarati",
      "summary": "In between Starlink launches, SpaceX installed its brand new Crew Access Arm on the recently built Crew Launch Tower at Space Launch...",
      "published_at": "2023-11-08T21:54:33Z",
      "updated_at": "2023-11-08T21:54:35.897000Z",
      "featured": false,
      "launches": [],
      "events": []
    },
    {
      "id": 21417,
      "title": "U.S. Air Force X-37B spaceplane to launch on a SpaceX Falcon Heavy rocket",
      "url": "https://spacenews.com/u-s-air-force-x-37b-spaceplane-to-launch-on-a-spacex-falcon-heavy-rocket/",
      "image_url": "https://spacenews.com/wp-content/uploads/2023/11/Screenshot-2023-11-08-at-3.33.23%E2%80%AFPM-300x199.png",
      "news_site": "SpaceNews",
      "summary": "The seventh mission of the reusable U.S. Air Force X-37B spaceplane is scheduled to launch Dec. 7 on a SpaceX Falcon Heavy rocket from Kennedy Space Center, Florida.",
      "published_at": "2023-11-08T21:01:48Z",
      "updated_at": "2023-11-08T22:52:40.802000Z",
      "featured": false,
      "launches": [
        {
          "launch_id": "0098c032-73de-4c6f-8d73-5d68b9a12fdf",
          "provider": "Launch Library 2"
        }
      ],
      "events": []
    },
    {
      "id": 21416,
      "title": "United Launch Alliance begins final preparations for debut launch of Vulcan",
      "url": "https://www.teslarati.com/united-launch-alliance-ula-begins-final-preparations-for-debut-launch-vulcan/",
      "image_url": "https://www.teslarati.com/wp-content/uploads/2023/11/52960005796_df04371504_k-2.jpg",
      "news_site": "Teslarati",
      "summary": "United Launch Alliance recently announced they are targeting to launch its new Vulcan rocket on Christmas Eve and are in the midst...",
      "published_at": "2023-11-08T19:44:39Z",
      "updated_at": "2023-11-08T22:52:47.206000Z",
      "featured": false,
      "launches": [
        {
          "launch_id": "b973e965-3901-4bda-9236-b0afee33f388",
          "provider": "Launch Library 2"
        }
      ],
      "events": []
    },
    {
      "id": 21415,
      "title": "Startups, universities selected for accelerator focused on space domain awareness",
      "url": "https://spacenews.com/startups-universities-selected-for-accelerator-focused-on-space-domain-awareness/",
      "image_url": "https://spacenews.com/wp-content/uploads/2023/11/F-DSr6ZXEAA7hDF-300x223.jpeg",
      "news_site": "SpaceNews",
      "summary": "The Space Force’s Space Systems Command selected several startups and universities to participate in a new accelerator program focused on enhancing space domain awareness.",
      "published_at": "2023-11-08T18:54:45Z",
      "updated_at": "2023-11-08T19:04:10.746000Z",
      "featured": false,
      "launches": [],
      "events": []
    },
    {
      "id": 21414,
      "title": "Summit cites Paradigm Shift for European Spaceflight",
      "url": "https://www.nasaspaceflight.com/2023/11/paradigm-shift-european-spaceflight/",
      "image_url": "https://www.nasaspaceflight.com/wp-content/uploads/2023/11/NSF-2023-11-08-18-17-14-046-1170x824.jpg",
      "news_site": "NASASpaceflight",
      "summary": "The ESA-EU Space Summit at Seville/Spain on November 6/7 focused on the need to evolve the future of the European Space Agency (ESA) and European spaceflight in general.",
      "published_at": "2023-11-08T18:44:44Z",
      "updated_at": "2023-11-08T18:54:50.862000Z",
      "featured": false,
      "launches": [],
      "events": []
    },
    {
      "id": 21413,
      "title": "DoD signs $270 million agreement to acquire SES satellite communications services",
      "url": "https://spacenews.com/dod-signs-270-million-agreement-to-acquire-ses-satellite-communications-services/",
      "image_url": "https://spacenews.com/wp-content/uploads/2023/11/F64UcPnWkAA8fmJ-300x200.jpeg",
      "news_site": "SpaceNews",
      "summary": "The global satellite operator SES will provide services to the U.S. Defense Department under a five-year agreement worth up to $270 million.",
      "published_at": "2023-11-08T15:44:23Z",
      "updated_at": "2023-11-08T15:54:11.360000Z",
      "featured": false,
      "launches": [],
      "events": []
    },
    {
      "id": 21411,
      "title": "SpaceNews 2023 Icon Awards honorees: Unsung Hero",
      "url": "https://spacenews.com/spacenews-2023-icon-awards-honorees-unsung-hero/",
      "image_url": "https://spacenews.com/wp-content/uploads/2023/10/Logo-01-2-300x225.jpg",
      "news_site": "SpaceNews",
      "summary": "Since the beginning, the SpaceNews Awards have honored the well-known champions as well as the unsung heroes shaping the global space industry for the better. We endeavor to celebrate headline-grabbing breakthroughs as well as outside-the-limelight innovations.  \nHowever, it's not just lunar landings that caught our attention in 2023. SpaceNews is delighted to reveal the finalists for the Civil Space Achievement of the Year award, and we invite you to join us on Tuesday, Dec. 5, during the SpaceNews 2023 Icon Awards event at the InterContinental Washington D.C. – The Wharf, where we'll unveil the winner.",
      "published_at": "2023-11-08T15:08:03Z",
      "updated_at": "2023-11-08T15:14:10.661000Z",
      "featured": false,
      "launches": [],
      "events": []
    },
    {
      "id": 21412,
      "title": "Satellite imagery company BlackSky ekes out first quarterly profit",
      "url": "https://www.cnbc.com/2023/11/08/satellite-imagery-blacksky-ekes-out-first-quarterly-profit.html",
      "image_url": "https://image.cnbcfm.com/api/v1/image/107204269-1678195880200-BlackSky_Inc-1437450717908725760-img1.jpg",
      "news_site": "CNBC",
      "summary": "Satellite imagery venture BlackSky delivered its first quarterly profit on Wednesday, as the company works to keep up momentum into the end of the year.",
      "published_at": "2023-11-08T15:07:13Z",
      "updated_at": "2023-11-08T15:14:46.542000Z",
      "featured": false,
      "launches": [],
      "events": []
    }
]
```

### Proyecto Frontend
- Clonar el proyecto desde el repositorio de GitHub con el siguiente comando:
- git clone [https://github.com/PaarXul/FrontEnd-noticias.git](https://github.com/PaarXul/FrontEnd-Noticias.git)
- Ejecutar el comando "npm install" para descargar las dependencias del proyecto
- Ejecutar el comando "ng serve" para iniciar el proyecto
- Abrir el navegador web y acceder a la url http://localhost:4200 para acceder a la aplicación web

## Requerimientos Funcionales desarrollados
- RF01: Ver listado de noticias con el limite de mostrar 10 noticias por página, ordenadas por fecha de publicación, filtradas por busqueda del titulo de la noticia y paginadas  desde la API externa de noticias.
- RF02: ver listado de noticias guardadas en la base de datos, ordenadas por fecha de publicación, filtradas por busqueda del titulo de la noticia y paginadas.
- RF03: Guardar una noticia de la API externa en la base de datos en memoria.
- RF04: Eliminar una noticia de la base de datos en memoria.
- RF05: Control de errores en la aplicación web y en los servicios de la API.

## Repositorio de GitHub
- Repositorio del proyecto Backend:
  - https://github.com/PaarXul/backend-noticias
- Repositorio del proyecto Frontend:
  - https://github.com/PaarXul/FrontEnd-Noticias
