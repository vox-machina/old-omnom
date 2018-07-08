# Omnom

Omnom - the eater of APIs

![Alt Text](https://media.giphy.com/media/jgUG5cnss7T9K/giphy.gif)

## Overview

Consumes REST APIs - initially those conforming to the DAHL runtime specification.

Clojurescript and Clojure and optionally Electron powered.


## Running it

### Server

Navigate to root of project.

```
npm install electron -g # install electron

lein cooper # compile cljs, start figwheel
```

### Client

Two options:

#### Browser

```
http://localhost:3449/
```

#### Electron

Navigate to root of project

```
electron . # start electron
```
