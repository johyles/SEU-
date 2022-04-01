# myfront

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

```
frontend
├─ .gitignore
├─ README.md
├─ babel.config.js
├─ globalConfig.js
├─ package-lock.json
├─ package.json
├─ public
│  ├─ icon.png
│  └─ index.html
├─ src
│  ├─ App.vue
│  ├─ Global.vue
│  ├─ assets
│  │  ├─ fonts
│  │  │  ├─ icomoon.eot
│  │  │  ├─ icomoon.svg
│  │  │  ├─ icomoon.ttf
│  │  │  ├─ icomoon.woff
│  │  │  └─ style.css
│  │  └─ img
│  │     ├─ 1920x1080
│  │     │  ├─ beets-carrots-close-up-533360.jpg
│  │     │  ├─ berries-food-fresh-59999.jpg
│  │     │  ├─ colorful-fruit-platter-and-dark-chocolate.jpg
│  │     │  └─ vegetables.jpg
│  │     ├─ 720x540
│  │     │  ├─ banana.jpg
│  │     │  ├─ blueberry.jpg
│  │     │  ├─ cool-girl.jpg
│  │     │  ├─ cucumber-transparent.png
│  │     │  ├─ cucumber.jpg
│  │     │  ├─ fruits-plate.png
│  │     │  ├─ fruits.jpg
│  │     │  ├─ orange.jpg
│  │     │  ├─ pepper.jpg
│  │     │  ├─ potato.jpg
│  │     │  ├─ pumpkin.jpg
│  │     │  ├─ red-pepper.jpg
│  │     │  ├─ tomato.jpg
│  │     │  └─ vegies.jpg
│  │     ├─ aboutus
│  │     │  ├─ curve.png
│  │     │  ├─ curve上.png
│  │     │  ├─ curve下.png
│  │     │  ├─ dots-map.png
│  │     │  ├─ salad.jpg
│  │     │  ├─ vegetables-pattern-white.png
│  │     │  └─ vegetables-pattern.png
│  │     ├─ fruits-plate.png
│  │     ├─ icon.png
│  │     ├─ icon1.png
│  │     ├─ inner-bg.jpg
│  │     ├─ login_background.jpg
│  │     ├─ logo.png
│  │     ├─ logo_text.png
│  │     ├─ orange
│  │     │  ├─ card-payment.png
│  │     │  ├─ shipped.png
│  │     │  └─ shopping-basket.png
│  │     ├─ product.jpg
│  │     ├─ product1.jpg
│  │     ├─ product3.jpg
│  │     ├─ product4.jpg
│  │     ├─ slider2-2.jpg
│  │     ├─ textlogo.png
│  │     ├─ white
│  │     │  ├─ dairy-transparent.png
│  │     │  ├─ guarantee.png
│  │     │  ├─ handshake.png
│  │     │  ├─ in-love.png
│  │     │  ├─ leafs-transparent.png
│  │     │  └─ tomato-transparent.png
│  │     ├─ 主页背景
│  │     │  ├─ 1.png
│  │     │  ├─ 2.png
│  │     │  ├─ 3.png
│  │     │  ├─ 4.png
│  │     │  ├─ 5.png
│  │     │  ├─ 6.png
│  │     │  └─ sprite_fresh_bgs (1).png
│  │     ├─ 二维码
│  │     │  ├─ 1.jpg
│  │     │  ├─ 2.jpg
│  │     │  └─ 3.jpg
│  │     ├─ 分类小图标
│  │     │  ├─ sprite_fresh1.png
│  │     │  ├─ sprite_fresh2.png
│  │     │  ├─ sprite_fresh3.png
│  │     │  ├─ sprite_fresh4.png
│  │     │  ├─ sprite_fresh5.png
│  │     │  └─ sprite_fresh_fs@2x.png
│  │     └─ 图标
│  │        ├─ game.png
│  │        ├─ hotel.png
│  │        ├─ movie.png
│  │        ├─ oil.png
│  │        ├─ plane.png
│  │        ├─ sprite.png
│  │        └─ train.png
│  ├─ components
│  │  └─ HelloWorld.vue
│  ├─ css
│  │  ├─ finalhome.css
│  │  ├─ header.css
│  │  ├─ homepage.css
│  │  ├─ nav.css
│  │  ├─ personalcenter.css
│  │  └─ singleproduct.css
│  ├─ img
│  │  ├─ lock_icon.png
│  │  ├─ lockback.jpg
│  │  ├─ lockback1.png
│  │  ├─ logo-pic.png
│  │  ├─ logo.png
│  │  ├─ user_icon.png
│  │  └─ userback.jpg
│  ├─ main.js
│  ├─ router
│  │  └─ index.js
│  └─ views
│     ├─ About.vue
│     ├─ Bottom.vue
│     ├─ Cart.vue
│     ├─ FinalHome.vue
│     ├─ ForumContent.vue
│     ├─ ForumHome.vue
│     ├─ GoodsList.vue
│     ├─ Header.vue
│     ├─ HippoForum.vue
│     ├─ MY_Comment.vue
│     ├─ MY_Order.vue
│     ├─ MyOrderCenter.vue
│     ├─ My_Address.vue
│     ├─ My_Hippo.vue
│     ├─ My_Information.vue
│     ├─ My_ModifyAccount.vue
│     ├─ My_ModifyInformation.vue
│     ├─ My_ModifyPassword.vue
│     ├─ Navbar.vue
│     ├─ Ordercheck.vue
│     ├─ PersonalCenter.vue
│     ├─ PostForum.vue
│     ├─ Product.vue
│     ├─ SingleProduct.vue
│     ├─ login.vue
│     └─ regist.vue
├─ theme
│  ├─ fonts
│  │  ├─ element-icons.ttf
│  │  └─ element-icons.woff
│  └─ index.css
└─ vue.config.js

```